package com.nabobery.sdkgen.runtime

/** Applies authentication material to a request without coupling the runtime to a transport engine. */
public fun interface SdkAuthentication {
    public suspend fun apply(request: SdkRequest): SdkRequest
}

/** Adds an RFC 6750 bearer token, replacing every existing Authorization header. */
public class BearerTokenAuthentication(
    private val tokenProvider: suspend () -> String,
) : SdkAuthentication {
    override suspend fun apply(request: SdkRequest): SdkRequest {
        val token = tokenProvider().trim()
        require(token.isNotEmpty()) { "Bearer token must not be blank" }
        return request.copy(headers = replaceCredentialHeader(request.headers, "Authorization", "Bearer $token"))
    }
}

/** Replaces all case-insensitive instances of a final credential-owned header with one generated value. */
internal fun replaceCredentialHeader(
    headers: List<SdkHeader>,
    name: String,
    value: String,
): List<SdkHeader> = headers.filterNot { it.name.equals(name, ignoreCase = true) } + SdkHeader(name, value)
