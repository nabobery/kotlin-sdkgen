package com.nabobery.sdkgen.runtime.auth

/**
 * Supplies [Credential] material for one security scheme id, on demand.
 *
 * [SecuritySchemeAuthentication] calls [credentials] once per configured scheme, per physical attempt — never once
 * per logical call — so a rotated or refreshed credential is always picked up on retry without the core runtime
 * caching anything itself. Implementations that want to avoid redundant work (e.g. a token refreshed only every few
 * minutes) are free to cache internally; the core runtime never assumes freshness and never suppresses a call to
 * this function.
 */
public fun interface CredentialProvider {
    /** Returns the current credential material. May suspend (e.g. to await a token refresh). */
    public suspend fun credentials(): Credential
}
