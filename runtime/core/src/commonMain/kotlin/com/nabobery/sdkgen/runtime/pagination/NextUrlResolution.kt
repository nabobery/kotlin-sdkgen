package com.nabobery.sdkgen.runtime.pagination

import com.nabobery.sdkgen.runtime.SdkPaginationException
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.auth.parseOrigin

/**
 * Resolves a [PaginationDescriptor.NextUrl][com.nabobery.sdkgen.runtime.PaginationDescriptor.NextUrl] response value
 * against [baseUri], the operation's own base URI, following RFC 3986 §5.3 reference-resolution precedence for the
 * forms pagination next-URLs actually use (no `.`/`..` dot-segment removal — server-issued next-URLs are not
 * user-authored relative references that need normalizing):
 *
 *  - **absolute** (`http://…`, `https://…`, case-insensitive scheme): returned unchanged.
 *  - **scheme-relative** (`//host/path`, RFC 3986's "network-path reference"): resolved to a full URL using
 *    [baseUri]'s scheme and the given authority — critically, this yields a URL whose origin may legitimately differ
 *    from [baseUri]'s, so [requireTrustedNextUrl] must still trust-check it like any other absolute URL; it is never
 *    treated as same-origin just because it started as a relative reference.
 *  - **absolute-path** (`/path`, an "absolute-path reference"): resolved against [baseUri]'s origin, discarding its
 *    path/query/fragment.
 *  - **query-only** (`?query`, a "same-document"-with-new-query reference): resolved against [baseUri]'s path,
 *    replacing its query and discarding its fragment.
 *  - **fragment-only** (`#fragment`): rejected — returns `null` — since a fragment carries no server-addressable
 *    information a pagination continuation could ever legitimately be.
 *  - **relative-path** (anything else, e.g. `more`, `sub/more`): resolved against [baseUri]'s path *directory*
 *    (the portion up to and including its last `/`; an empty base path resolves against `/`).
 *
 * Returns `null` when [baseUri] itself is not an absolute `http`/`https` URI this function can resolve against
 * (mirrors [com.nabobery.sdkgen.runtime.auth.parseOrigin]'s fail-closed behavior rather than guessing).
 */
internal fun resolveNextUrl(
    baseUri: String,
    rawNextUrl: String,
): String? {
    if (rawNextUrl.any(::isForbiddenRawUriCharacter)) return null
    val resolved =
        when {
            rawNextUrl.startsWith("http://", ignoreCase = true) ||
                rawNextUrl.startsWith("https://", ignoreCase = true) -> {
                rawNextUrl
            }

            rawNextUrl.startsWith("//") -> {
                val scheme = schemeOf(baseUri) ?: return null
                "$scheme:$rawNextUrl"
            }

            rawNextUrl.startsWith("/") -> {
                val origin = parseOrigin(baseUri) ?: return null
                "$origin$rawNextUrl"
            }

            rawNextUrl.startsWith("?") -> {
                val basePath = pathPrefix(baseUri) ?: return null
                "$basePath$rawNextUrl"
            }

            rawNextUrl.startsWith("#") -> {
                return null
            }

            else -> {
                val directory = directoryPrefix(baseUri) ?: return null
                "$directory$rawNextUrl"
            }
        }
    return resolved.takeIf { parseOrigin(it) != null }
}

private fun isForbiddenRawUriCharacter(character: Char): Boolean =
    character.code <= ASCII_SPACE || character.code == ASCII_DELETE || character.isWhitespace()

/**
 * Trust-checks [resolvedUrl] (already resolved by [resolveNextUrl]) against [trustedHosts], returning [resolvedUrl]
 * unchanged when trusted.
 *
 * @throws SdkPaginationException naming only [resolvedUrl]'s origin (never its path, query, or fragment — see
 *   [TrustedHosts.originLabel]) when the origin is refused.
 */
internal fun requireTrustedNextUrl(
    resolvedUrl: String,
    trustedHosts: TrustedHosts,
    operationId: String?,
): String {
    if (!trustedHosts.isTrusted(resolvedUrl)) {
        throw SdkPaginationException(
            "Pagination next-URL refused: origin '${trustedHosts.originLabel(resolvedUrl)}' is not the client's " +
                "base origin and is not in the trusted-host allowlist.",
            operationId,
        )
    }
    return resolvedUrl
}

/**
 * Splits an already-resolved, absolute `http`/`https` [url] (as [resolveNextUrl] produces, and as carried on
 * [PageRequest.NextUrl.url]) into its origin (`scheme://authority`) and the remaining path+query+fragment — the
 * inverse of [com.nabobery.sdkgen.runtime.buildRequestUri]'s `baseUri`/`pathTemplate` split. Generated code for
 * [HeaderNextUrl pagination][com.nabobery.sdkgen.runtime.PaginationDescriptor.HeaderNextUrl] uses this to re-target
 * a continuation fetch's
 * [com.nabobery.sdkgen.runtime.SdkExecutionRequest.baseUri] and [com.nabobery.sdkgen.runtime.OperationMetadata.path]
 * at a resolved `Link` header target rather than the operation's own fixed base URI.
 *
 * @throws IllegalArgumentException when [url] is not an absolute `http`/`https` URI (should never happen for a URL
 *   that already passed through [resolveNextUrl], which only ever produces such URLs).
 */
public fun splitResolvedUrl(url: String): Pair<String, String> {
    val authorityEnd = requireNotNull(authorityEndIndex(url)) { "expected an absolute http(s) URL: $url" }
    val origin = url.substring(0, authorityEnd)
    val rest = url.substring(authorityEnd)
    return origin to rest.ifEmpty { "/" }
}

/** `"http"`/`"https"` (lowercased) when [uri] is an absolute URI of one of those schemes, else `null`. */
private fun schemeOf(uri: String): String? =
    when {
        uri.startsWith("https://", ignoreCase = true) -> "https"
        uri.startsWith("http://", ignoreCase = true) -> "http"
        else -> null
    }

/**
 * The index into [uri] of the first character after its authority (host[:port]) component — i.e. where the path
 * begins, or `uri.length` when there is no path/query/fragment at all. `null` when [uri] is not an absolute
 * `http`/`https` URI.
 */
private fun authorityEndIndex(uri: String): Int? {
    val schemeLength =
        when {
            uri.startsWith("https://", ignoreCase = true) -> HTTPS_PREFIX_LENGTH
            uri.startsWith("http://", ignoreCase = true) -> HTTP_PREFIX_LENGTH
            else -> return null
        }
    var index = schemeLength
    while (index < uri.length && uri[index] != '/' && uri[index] != '?' && uri[index] != '#') index++
    return index
}

/** [uri] with any trailing `?query` and/or `#fragment` stripped, or `null` when [uri] is not resolvable. */
private fun pathPrefix(uri: String): String? {
    if (authorityEndIndex(uri) == null) return null
    val queryOrFragment = uri.indexOfFirst { it == '?' || it == '#' }
    return if (queryOrFragment >= 0) uri.substring(0, queryOrFragment) else uri
}

/**
 * The "directory" [pathPrefix] resolves relative-path references against: everything up to and including the last
 * `/` in [uri]'s path. When [uri] has no path at all (bare `scheme://authority`), the directory is `scheme://authority/`
 * (RFC 3986 §5.3's merge routine treats an empty base path as `/`). `null` when [uri] is not resolvable.
 */
private fun directoryPrefix(uri: String): String? {
    val authorityEnd = authorityEndIndex(uri) ?: return null
    val path = pathPrefix(uri) ?: return null
    val lastSlash = path.lastIndexOf('/')
    return if (lastSlash >= authorityEnd) path.substring(0, lastSlash + 1) else "$path/"
}

private const val HTTPS_PREFIX_LENGTH = 8
private const val HTTP_PREFIX_LENGTH = 7
private const val ASCII_SPACE = 0x20
private const val ASCII_DELETE = 0x7F
