package com.nabobery.sdkgen.runtime.auth

/**
 * One OpenAPI security scheme kind the core runtime can apply to a request on its own, keyed by scheme id in a
 * client's `Map<String, SecurityScheme>` configuration (the same ids referenced by
 * [com.nabobery.sdkgen.runtime.SecuritySchemeRef.schemeId]).
 *
 * OAuth2 and OpenID Connect flows are deliberately excluded from this hierarchy: those involve token acquisition,
 * refresh, and redirect flows that are out of scope for the core runtime (spec §11.2) and are left to SDK-author or
 * adapter-level composition, e.g. a [CredentialProvider] backed by an OAuth client library that hands back a
 * [Credential.BearerCredential] once it has a token.
 */
public sealed interface SecurityScheme {
    /** Where an `apiKey` scheme's value is carried on the wire. */
    public enum class ApiKeyLocation {
        HEADER,
        QUERY,
        COOKIE,
    }

    /** An OpenAPI `apiKey` scheme: a named header, query parameter, or cookie carrying the raw key value. */
    public data class ApiKey(
        public val location: ApiKeyLocation,
        public val parameterName: String,
    ) : SecurityScheme

    /** An OpenAPI `http` scheme with `scheme: basic` (RFC 7617): `Authorization: Basic base64(user:pass)`. */
    public data object HttpBasic : SecurityScheme

    /**
     * An OpenAPI `http` scheme with `scheme: bearer` (RFC 6750): `Authorization: <scheme> <token>`.
     *
     * @property scheme the Authorization-header auth-scheme token; defaults to `"Bearer"`.
     */
    public data class HttpBearer(
        public val scheme: String = "Bearer",
    ) : SecurityScheme

    /** A contract-owned scheme whose credential application is supplied through a custom authentication override. */
    public data class Unsupported(
        public val kind: String,
    ) : SecurityScheme
}
