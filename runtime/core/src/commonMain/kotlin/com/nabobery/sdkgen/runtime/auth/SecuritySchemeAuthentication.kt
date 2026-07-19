package com.nabobery.sdkgen.runtime.auth

import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkAuthenticationException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.encodeQueryParameter
import com.nabobery.sdkgen.runtime.replaceCredentialHeader
import com.nabobery.sdkgen.runtime.sdkUriEncode
import kotlin.coroutines.cancellation.CancellationException
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

/**
 * Pairs one OpenAPI security scheme definition with the [CredentialProvider] that resolves credentials for it.
 *
 * Replacing the previous parallel `schemes`/`providers` maps with a single `Map<String, SecuritySchemeBinding>`
 * makes "a configured scheme with no provider" (or vice versa) unrepresentable: a scheme id either has both halves
 * bound together in one entry, or it is simply absent from the map, rather than being representable-but-invalid
 * across two maps that could disagree.
 */
public class SecuritySchemeBinding(
    public val scheme: SecurityScheme,
    public val provider: CredentialProvider,
)

/**
 * The [SdkAuthentication] implementation for OpenAPI `apiKey`/`http basic`/`http bearer` security schemes.
 *
 * Requirement selection ([SdkRequest.security], OpenAPI semantics — AND within one requirement, OR across the
 * list, an empty-schemes requirement meaning anonymous): the first requirement in list order whose schemes *all*
 * have a [SecuritySchemeBinding] in [bindings] is selected. An empty-schemes requirement is always satisfiable.
 * When no requirement is satisfiable, [apply] throws [SdkAuthenticationException] naming every scheme id referenced
 * anywhere in [SdkRequest.security] that lacks a configured binding (scheme ids are not secrets and are safe to
 * include).
 *
 * When the selected requirement is anonymous, [apply] returns [SdkRequest] unmodified — no credentials are applied
 * and, per spec, the cross-origin check below does not run: an anonymous request carries nothing an attacker could
 * capture by observing which origin it was sent to.
 *
 * Otherwise, before applying any credential, [apply] checks [trustedHosts] against the request's own origin.
 * Non-matching origin throws [SdkAuthenticationException] naming the offending *origin* only (never the path or
 * query, which may carry sensitive data the origin does not) and applies no credentials at all — not even a subset.
 *
 * Every [CredentialProvider.credentials] call happens fresh on every [apply] invocation (i.e. every physical
 * attempt the executor makes) — nothing is cached in this class; see [CredentialProvider]'s KDoc for why.
 */
public class SecuritySchemeAuthentication(
    bindings: Map<String, SecuritySchemeBinding>,
    private val trustedHosts: TrustedHosts,
) : SdkAuthentication {
    private val bindings: Map<String, SecuritySchemeBinding> = bindings.toMap()

    override suspend fun apply(request: SdkRequest): SdkRequest {
        val selected = selectRequirement(request.security) ?: throw unsatisfiableException(request)
        if (selected.schemes.isEmpty()) return request

        if (!trustedHosts.isTrusted(request.uri)) {
            throw SdkAuthenticationException(
                "Refusing to apply credentials for '${request.operationId}' to cross-origin request target " +
                    "'${trustedHosts.originLabel(request.uri)}'.",
                request.operationId,
            )
        }

        var result = request
        for (ref in selected.schemes) {
            val binding = bindings.getValue(ref.schemeId)
            val credential =
                try {
                    binding.provider.credentials()
                } catch (cancellation: CancellationException) {
                    throw cancellation
                } catch (failure: Throwable) {
                    throw SdkAuthenticationException(
                        "Credential provider for scheme '${ref.schemeId}' failed.",
                        request.operationId,
                        failure,
                    )
                }
            result = applyCredential(result, ref.schemeId, binding.scheme, credential)
        }
        return result
    }

    private fun isSatisfiable(schemeId: String): Boolean = bindings.containsKey(schemeId)

    private fun selectRequirement(requirements: List<SecurityRequirement>): SecurityRequirement? {
        if (requirements.isEmpty()) return SecurityRequirement(emptyList())
        return requirements.firstOrNull { requirement ->
            requirement.schemes.isEmpty() || requirement.schemes.all { isSatisfiable(it.schemeId) }
        }
    }

    private fun unsatisfiableException(request: SdkRequest): SdkAuthenticationException {
        val missing =
            request.security
                .flatMap { it.schemes }
                .map { it.schemeId }
                .distinct()
                .filterNot(::isSatisfiable)
        return SdkAuthenticationException(
            "No security requirement satisfiable for '${request.operationId}'; missing credential provider(s) " +
                "for scheme id(s): $missing.",
            request.operationId,
        )
    }

    private fun applyCredential(
        request: SdkRequest,
        schemeId: String,
        scheme: SecurityScheme,
        credential: Credential,
    ): SdkRequest =
        when (scheme) {
            is SecurityScheme.ApiKey -> {
                applyApiKey(request, schemeId, scheme, credential)
            }

            SecurityScheme.HttpBasic -> {
                applyBasic(request, schemeId, credential)
            }

            is SecurityScheme.HttpBearer -> {
                applyBearer(request, schemeId, scheme, credential)
            }

            is SecurityScheme.Unsupported -> {
                throw SdkAuthenticationException(
                    "Security scheme '$schemeId' of kind '${scheme.kind}' requires a custom authentication override.",
                )
            }
        }

    private fun applyApiKey(
        request: SdkRequest,
        schemeId: String,
        scheme: SecurityScheme.ApiKey,
        credential: Credential,
    ): SdkRequest {
        val secret =
            (
                credential as? Credential.ApiKeyCredential
                    ?: throw credentialMismatch(schemeId, "ApiKeyCredential")
            ).secret
                .reveal()
        return when (scheme.location) {
            SecurityScheme.ApiKeyLocation.HEADER -> {
                request.copy(headers = replaceCredentialHeader(request.headers, scheme.parameterName, secret))
            }

            SecurityScheme.ApiKeyLocation.QUERY -> {
                request.copy(uri = appendQueryParam(request.uri, scheme.parameterName, secret))
            }

            SecurityScheme.ApiKeyLocation.COOKIE -> {
                val encodedName = sdkUriEncode(scheme.parameterName)
                val pair = "$encodedName=${sdkUriEncode(secret)}"
                request.copy(
                    headers = replaceCookieCredential(request.headers, scheme.parameterName, encodedName, pair),
                )
            }
        }
    }

    private fun applyBasic(
        request: SdkRequest,
        schemeId: String,
        credential: Credential,
    ): SdkRequest {
        val basic = credential as? Credential.BasicCredential ?: throw credentialMismatch(schemeId, "BasicCredential")
        val encoded = encodeBasic(basic.username, basic.secret.reveal())
        return request.copy(headers = replaceCredentialHeader(request.headers, "Authorization", "Basic $encoded"))
    }

    private fun applyBearer(
        request: SdkRequest,
        schemeId: String,
        scheme: SecurityScheme.HttpBearer,
        credential: Credential,
    ): SdkRequest {
        val bearer =
            credential as? Credential.BearerCredential ?: throw credentialMismatch(schemeId, "BearerCredential")
        return request.copy(
            headers =
                replaceCredentialHeader(
                    request.headers,
                    "Authorization",
                    "${scheme.scheme} ${bearer.token.reveal()}",
                ),
        )
    }

    private fun credentialMismatch(
        schemeId: String,
        expected: String,
    ): SdkAuthenticationException =
        SdkAuthenticationException(
            "Credential provider for scheme '$schemeId' returned a credential that is not a $expected.",
        )

    private companion object {
        @OptIn(ExperimentalEncodingApi::class)
        fun encodeBasic(
            username: String,
            password: String,
        ): String = Base64.encode("$username:$password".encodeToByteArray())
    }
}

/** Replaces the configured API-key cookie while preserving unrelated caller cookies in one header. */
private fun replaceCookieCredential(
    headers: List<SdkHeader>,
    parameterName: String,
    encodedName: String,
    credentialPair: String,
): List<SdkHeader> {
    val unrelatedCookies =
        headers
            .filter { it.name.equals("Cookie", ignoreCase = true) }
            .flatMap { header ->
                header.value
                    .split(';')
                    .map(String::trim)
                    .filter(String::isNotEmpty)
            }.filterNot { pair ->
                val cookieName = pair.substringBefore('=', missingDelimiterValue = "").trim()
                cookieName.equals(parameterName, ignoreCase = true) ||
                    cookieName.equals(encodedName, ignoreCase = true)
            }
    return headers.filterNot { it.name.equals("Cookie", ignoreCase = true) } +
        SdkHeader("Cookie", (unrelatedCookies + credentialPair).joinToString("; "))
}

/** Appends one encoded query parameter before any URI fragment. */
internal fun appendQueryParam(
    uri: String,
    name: String,
    value: String,
): String {
    val fragmentStart = uri.indexOf('#')
    val withoutFragment = if (fragmentStart < 0) uri else uri.substring(0, fragmentStart)
    val fragment = if (fragmentStart < 0) "" else uri.substring(fragmentStart)
    val separator = if ('?' in withoutFragment) "&" else "?"
    return withoutFragment + separator + encodeQueryParameter(name, value) + fragment
}
