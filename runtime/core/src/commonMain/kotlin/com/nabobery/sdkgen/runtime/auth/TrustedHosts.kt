package com.nabobery.sdkgen.runtime.auth

import com.nabobery.sdkgen.runtime.SdkConfigurationException

/**
 * The origin allowlist [SecuritySchemeAuthentication] enforces before applying any non-anonymous credential to a
 * request: the client's own base origin (same-origin default) plus zero or more explicitly trusted origins
 * (redirect targets, pagination next-URLs, or other absolute targets an SDK author has deliberately opted into).
 *
 * A request whose URI resolves to any other origin never receives credentials, regardless of which security
 * requirement it satisfies — see [SecuritySchemeAuthentication] for the anonymous-requirement exception.
 */
public class TrustedHosts private constructor(
    private val baseOrigin: UriOrigin,
    explicitOrigins: Set<UriOrigin>,
) {
    private val explicitOrigins: Set<UriOrigin> = explicitOrigins.toSet()

    /** Whether [uri]'s origin is the client's base origin or one of the explicitly trusted origins. */
    public fun isTrusted(uri: String): Boolean {
        val origin = parseOrigin(uri) ?: return false
        return origin == baseOrigin || origin in explicitOrigins
    }

    /**
     * A safe-to-log label for [uri]'s origin (`scheme://host:port`), for use in diagnostics when [isTrusted] is
     * `false`. Never includes path, query, or fragment — those may carry sensitive data the origin itself does not.
     * Falls back to the literal string `"<unparsable origin>"` when [uri] is not a well-formed absolute URI.
     */
    public fun originLabel(uri: String): String = parseOrigin(uri)?.toString() ?: "<unparsable origin>"

    public companion object {
        /**
         * Builds a [TrustedHosts] whose same-origin default is [baseUri]'s own origin, additionally trusting every
         * origin in [explicitlyTrustedOrigins] (each an absolute `http`/`https` URI or bare origin string, e.g.
         * `"https://cdn.example.com"`).
         *
         * @throws SdkConfigurationException if [baseUri], or any entry of [explicitlyTrustedOrigins], is not a
         *   well-formed absolute `http`/`https` URI.
         */
        public fun of(
            baseUri: String,
            explicitlyTrustedOrigins: Set<String> = emptySet(),
        ): TrustedHosts {
            val base =
                parseOrigin(baseUri)
                    ?: throw SdkConfigurationException("baseUri must be an absolute http(s) URI, got '$baseUri'")
            val explicit =
                explicitlyTrustedOrigins.map { candidate ->
                    parseOrigin(candidate)
                        ?: throw SdkConfigurationException(
                            "trusted host entry must be an absolute http(s) URI, got '$candidate'",
                        )
                }
            return TrustedHosts(base, explicit.toSet())
        }
    }
}
