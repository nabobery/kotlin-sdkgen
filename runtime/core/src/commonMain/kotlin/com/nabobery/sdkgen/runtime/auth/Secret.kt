package com.nabobery.sdkgen.runtime.auth

/**
 * Wraps a secret string (API key, password, bearer token, ...) so it can travel through [Credential] values without
 * ever surfacing in a `toString()`, log line, or diagnostic.
 *
 * Identity semantics: [equals] and [hashCode] are deliberately left as the default (reference) identity rather than
 * overridden to derive from [reveal]'s value or to treat every instance as equal. Value-derived equality would let a
 * `distinct()` call, a `Set`, or a structural digest computed over a [Credential] (or a config/descriptor type that
 * embeds one) leak whether two secrets are equal, differ, or (via hash collisions) share a prefix — none of which any
 * caller should be able to observe without calling [reveal] explicitly. A constant/all-equal override is equally
 * unsound in the other direction: it silently corrupts any consumer `Set`/`Map`/cache keyed on secrets, collapsing
 * every distinct secret into one entry. Plain reference identity avoids both failure modes.
 */
public class Secret(
    private val value: String,
) {
    /** Returns the wrapped secret value. The only supported way to read it back out. */
    public fun reveal(): String = value

    override fun toString(): String = "Secret(redacted)"
}
