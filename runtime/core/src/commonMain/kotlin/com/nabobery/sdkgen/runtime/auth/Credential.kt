package com.nabobery.sdkgen.runtime.auth

/**
 * Typed credential material returned by a [CredentialProvider]. Every variant carries its secret material as a
 * [Secret], never a bare [String], so it stays redacted through `toString()`/`equals()`/`hashCode()`.
 */
public sealed interface Credential {
    /** Credential for an `apiKey` security scheme ([SecurityScheme.ApiKey]). */
    public data class ApiKeyCredential(
        public val secret: Secret,
    ) : Credential

    /** Credential for an `http`/`basic` security scheme ([SecurityScheme.HttpBasic]). */
    public data class BasicCredential(
        public val username: String,
        public val secret: Secret,
    ) : Credential

    /** Credential for an `http`/`bearer` security scheme ([SecurityScheme.HttpBearer]). */
    public data class BearerCredential(
        public val token: Secret,
    ) : Credential
}
