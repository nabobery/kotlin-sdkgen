package com.nabobery.sdkgen.runtime.auth

/** The scheme+host+port triple that defines an HTTP origin (RFC 6454), lowercased and with defaulted ports. */
internal data class UriOrigin(
    val scheme: String,
    val host: String,
    val port: Int,
) {
    /** `scheme://host:port`, used in diagnostics — never includes path/query/fragment (potentially sensitive). */
    override fun toString(): String = "$scheme://$host:$port"
}

/**
 * Parses the origin out of an absolute `http`/`https` URI, or returns `null` if [uri] is not one this runtime can
 * safely resolve an origin for. This is deliberately not a general-purpose URI parser — this runtime only ever
 * needs origin *comparison* for trusted-host enforcement — but it must still get bracketed-IPv6 hosts and userinfo
 * right, since getting either wrong can make [TrustedHosts] fail open.
 *
 * IPv6 hosts: a bracketed literal (`[::1]`, `[2001:db8::1]`) is kept, brackets included, as the [UriOrigin.host]
 * value, lowercased. Comparison is purely textual — this function never canonicalizes an IPv6 address, so `[::1]`
 * and `[0:0:0:0:0:0:0:1]` are (deliberately) distinct origins even though they name the same host. Core has no
 * dependency capable of IPv6 canonicalization; treating textually-different literals as distinct is the safe
 * default (never wrongly *merges* two origins), whereas canonicalizing incorrectly could wrongly merge them.
 *
 * Userinfo (`https://user:pass@host/...` or `https://user@host/...`): rejected outright (`null`), never parsed
 * around. An absolute URI is not expected to carry userinfo in this runtime's usage (client base URIs, trusted-host
 * entries, request targets) — spec §9.1 requires URI handling to avoid credential propagation, so a URI that
 * *does* carry userinfo is treated as a misconfiguration that must fail loudly (parseOrigin returning `null` causes
 * [TrustedHosts.isTrusted] to return `false`, refusing credentials) rather than silently discarding or
 * misattributing the embedded credential.
 */
internal fun parseOrigin(uri: String): UriOrigin? {
    val scheme =
        when {
            uri.startsWith("https://", ignoreCase = true) -> "https"
            uri.startsWith("http://", ignoreCase = true) -> "http"
            else -> return null
        }
    val afterScheme = uri.substring(scheme.length + SCHEME_SEPARATOR.length)
    val authorityEnd = afterScheme.indexOfFirst { it == '/' || it == '?' || it == '#' }
    val authority = if (authorityEnd >= 0) afterScheme.substring(0, authorityEnd) else afterScheme
    if (authority.isEmpty() || '@' in authority) return null

    val (host, explicitPortText) = splitHostAndPort(authority) ?: return null
    if (host.isEmpty()) return null

    val port =
        if (explicitPortText != null) {
            val parsed = explicitPortText.toIntOrNull() ?: return null
            if (parsed !in MIN_PORT..MAX_PORT) return null
            parsed
        } else {
            defaultPortFor(scheme) ?: return null
        }

    return UriOrigin(scheme, host.lowercase(), port)
}

/**
 * Splits an authority (already known to contain no userinfo) into its host and optional port text.
 *
 * A bracketed authority (`[...]` or `[...]:port`) is IPv6: the host is the full bracketed literal and any port
 * comes strictly after the closing bracket. Anything else is treated as an ordinary host, split on the first `:`.
 */
private fun splitHostAndPort(authority: String): Pair<String, String?>? {
    if (!authority.startsWith('[')) {
        val colonIndex = authority.indexOf(':')
        return if (colonIndex <
            0
        ) {
            authority to null
        } else {
            authority.substring(0, colonIndex) to authority.substring(colonIndex + 1)
        }
    }
    val closeIndex = authority.indexOf(']')
    if (closeIndex < 0) return null
    val host = authority.substring(0, closeIndex + 1)
    val remainder = authority.substring(closeIndex + 1)
    return when {
        remainder.isEmpty() -> host to null
        remainder.startsWith(':') -> host to remainder.substring(1)
        else -> null
    }
}

private fun defaultPortFor(scheme: String): Int? =
    when (scheme) {
        "https" -> 443
        "http" -> 80
        else -> null
    }

private const val SCHEME_SEPARATOR = "://"
private const val MIN_PORT = 1
private const val MAX_PORT = 65535
