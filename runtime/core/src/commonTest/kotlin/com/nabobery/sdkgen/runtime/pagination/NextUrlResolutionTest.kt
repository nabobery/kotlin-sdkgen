package com.nabobery.sdkgen.runtime.pagination

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * Table-driven coverage of [resolveNextUrl]'s RFC 3986 §5.3 reference-resolution forms. Trust enforcement of the
 * resolved URL (including that a scheme-relative reference must still pass the trusted-host check like any other
 * absolute URL) is covered separately in `PaginationEngineFlowTest`, since it requires a
 * [com.nabobery.sdkgen.runtime.auth.TrustedHosts] instance.
 */
internal class NextUrlResolutionTest {
    private val base = "https://api.example.test/v1/things?cursor=1"
    private val baseNoPath = "https://api.example.test"

    @Test
    fun absoluteUrlIsReturnedUnchanged() {
        assertEquals(
            "https://other.example.test/x?y=1",
            resolveNextUrl(base, "https://other.example.test/x?y=1"),
        )
        assertEquals(
            "HTTP://other.example.test/x",
            resolveNextUrl(base, "HTTP://other.example.test/x"),
        )
    }

    @Test
    fun schemeRelativeResolvesWithBaseSchemeToAFullUrl() {
        assertEquals("https://cdn.example.test/things?page=2", resolveNextUrl(base, "//cdn.example.test/things?page=2"))
    }

    @Test
    fun schemeRelativeUsesHttpBaseSchemeToo() {
        assertEquals("http://cdn.example.test/x", resolveNextUrl("http://api.example.test/v1", "//cdn.example.test/x"))
    }

    @Test
    fun absolutePathResolvesAgainstBaseOriginDiscardingPathAndQuery() {
        assertEquals("https://api.example.test:443/other?z=1", resolveNextUrl(base, "/other?z=1"))
    }

    @Test
    fun queryOnlyPreservesBasePathAndReplacesQuery() {
        assertEquals("https://api.example.test/v1/things?page=2", resolveNextUrl(base, "?page=2"))
    }

    @Test
    fun queryOnlyAgainstBaseWithNoExistingQueryStillPreservesPath() {
        assertEquals(
            "https://api.example.test/v1/things?page=2",
            resolveNextUrl("https://api.example.test/v1/things", "?page=2"),
        )
    }

    @Test
    fun fragmentOnlyIsRejected() {
        assertNull(resolveNextUrl(base, "#section"))
    }

    @Test
    fun relativePathResolvesAgainstBasePathDirectoryIgnoringExistingQuery() {
        assertEquals("https://api.example.test/v1/more?x=1", resolveNextUrl(base, "more?x=1"))
    }

    @Test
    fun relativePathAgainstBaseWithNoPathResolvesAgainstRoot() {
        assertEquals("https://api.example.test/x", resolveNextUrl(baseNoPath, "x"))
    }

    @Test
    fun relativePathAgainstBaseEndingInSlashAppendsDirectly() {
        assertEquals("https://api.example.test/v1/x", resolveNextUrl("https://api.example.test/v1/", "x"))
    }

    @Test
    fun malformedBaseUriYieldsNullForEveryNonAbsoluteForm() {
        assertNull(resolveNextUrl("not-a-uri", "//host/x"))
        assertNull(resolveNextUrl("not-a-uri", "/x"))
        assertNull(resolveNextUrl("not-a-uri", "?x=1"))
        assertNull(resolveNextUrl("not-a-uri", "x"))
    }
}
