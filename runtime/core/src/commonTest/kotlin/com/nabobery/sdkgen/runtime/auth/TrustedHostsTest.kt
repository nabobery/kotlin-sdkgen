package com.nabobery.sdkgen.runtime.auth

import com.nabobery.sdkgen.runtime.SdkConfigurationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class TrustedHostsTest {
    @Test
    fun sameOriginIsTrustedByDefault() {
        val trustedHosts = TrustedHosts.of("https://example.test/base")

        assertTrue(trustedHosts.isTrusted("https://example.test/other/path"))
    }

    @Test
    fun differentSchemeHostOrPortIsNotTrustedByDefault() {
        val trustedHosts = TrustedHosts.of("https://example.test")

        assertFalse(trustedHosts.isTrusted("http://example.test"))
        assertFalse(trustedHosts.isTrusted("https://other.test"))
        assertFalse(trustedHosts.isTrusted("https://example.test:8443"))
    }

    @Test
    fun explicitlyTrustedOriginIsTrusted() {
        val trustedHosts = TrustedHosts.of("https://example.test", setOf("https://cdn.example.com"))

        assertTrue(trustedHosts.isTrusted("https://cdn.example.com/asset.bin"))
        assertFalse(trustedHosts.isTrusted("https://other.example.com"))
    }

    @Test
    fun originLabelNeverIncludesPathOrQuery() {
        val trustedHosts = TrustedHosts.of("https://example.test")

        assertEquals("https://evil.test:443", trustedHosts.originLabel("https://evil.test/steal?token=abc"))
    }

    @Test
    fun malformedBaseUriIsRejected() {
        assertFailsWith<SdkConfigurationException> { TrustedHosts.of("not-a-uri") }
    }
}
