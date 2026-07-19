package com.nabobery.sdkgen.runtime.auth

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNull

internal class UriOriginTest {
    @Test
    fun bracketedIpv6HostWithExplicitPort() {
        assertEquals(UriOrigin("https", "[::1]", 8080), parseOrigin("https://[::1]:8080/path"))
    }

    @Test
    fun bracketedIpv6HostWithoutExplicitPortUsesSchemeDefault() {
        assertEquals(UriOrigin("https", "[::1]", 443), parseOrigin("https://[::1]/path"))
        assertEquals(UriOrigin("http", "[2001:db8::1]", 80), parseOrigin("http://[2001:db8::1]/"))
    }

    @Test
    fun differentIpv6OriginsAreNeverEqual() {
        // Regression for the collision bug: distinct bracketed hosts (or ports) must parse to distinct UriOrigins,
        // or TrustedHosts would treat every IPv6 origin as the client's own base origin.
        val a = parseOrigin("https://[::1]:8080/")
        val b = parseOrigin("https://[::2]:8080/")
        val c = parseOrigin("https://[::1]:9090/")

        assertNotEquals(a, b)
        assertNotEquals(a, c)
    }

    @Test
    fun ipv6LiteralsAreComparedTextuallyNotCanonically() {
        // Documented, deliberate: core never canonicalizes IPv6 addresses, so these two spellings of loopback are
        // distinct origins even though they name the same host.
        val shorthand = parseOrigin("https://[::1]/")
        val expanded = parseOrigin("https://[0:0:0:0:0:0:0:1]/")

        assertNotEquals(shorthand, expanded)
    }

    @Test
    fun ipv6BaseUriRefusesCrossOriginIpv6Target() {
        val trustedHosts = TrustedHosts.of("https://[::1]:8080")

        assertEquals(false, trustedHosts.isTrusted("https://[::2]:8080/steal"))
        assertEquals(false, trustedHosts.isTrusted("https://[::1]:9090/steal"))
        assertEquals(true, trustedHosts.isTrusted("https://[::1]:8080/ok"))
    }

    @Test
    fun userinfoWithPasswordIsRejected() {
        assertNull(parseOrigin("https://user:pass@example.test/"))
    }

    @Test
    fun userinfoWithoutPasswordIsRejected() {
        assertNull(parseOrigin("https://user@example.test/"))
    }

    @Test
    fun emptyHostIsRejected() {
        assertNull(parseOrigin("https:///path"))
    }

    @Test
    fun outOfRangePortIsRejected() {
        assertNull(parseOrigin("https://example.test:0/"))
        assertNull(parseOrigin("https://example.test:65536/"))
        assertNull(parseOrigin("https://example.test:99999999999/"))
    }

    @Test
    fun schemeAndHostAreNormalizedToLowercase() {
        assertEquals(UriOrigin("https", "example.test", 443), parseOrigin("HTTPS://EXAMPLE.test/path"))
    }

    @Test
    fun malformedBracketedHostWithoutClosingBracketIsRejected() {
        assertNull(parseOrigin("https://[::1/path"))
    }

    @Test
    fun garbageBetweenClosingBracketAndPortIsRejected() {
        assertNull(parseOrigin("https://[::1]garbage:80/"))
    }
}
