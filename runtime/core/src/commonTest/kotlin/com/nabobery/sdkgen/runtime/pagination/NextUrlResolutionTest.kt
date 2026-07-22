package com.nabobery.sdkgen.runtime.pagination

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
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

    @Test
    fun rejectsRawControlCharactersAndUriForbiddenWhitespace() {
        listOf('\r', '\n', 0.toChar(), '\t', ' ').forEach { forbidden ->
            assertNull(resolveNextUrl(base, "https://api.example.test/a${forbidden}b"))
            assertNull(resolveNextUrl(base, "/a${forbidden}b"))
        }
    }

    @Test
    fun allowsPercentEncodedControlCharactersAndWhitespace() {
        assertEquals(
            "https://api.example.test/a%0Db%0Ab%00b%09b%20b",
            resolveNextUrl(base, "https://api.example.test/a%0Db%0Ab%00b%09b%20b"),
        )
    }

    @Test
    fun rejectsAbsoluteAndSchemeRelativeUrlsWithInvalidAuthorities() {
        listOf(
            "https:///missing-host",
            "https://?query-only",
            "https://#fragment-only",
            "https://user@:443/path",
            "//:443/path",
        ).forEach { invalid -> assertNull(resolveNextUrl(base, invalid)) }
    }
}

internal class SplitResolvedUrlTest {
    @Test
    fun splitsOriginFromPathQueryAndFragment() {
        assertEquals(
            "https://api.example.test" to "/repos/o/r/issues?page=2",
            splitResolvedUrl("https://api.example.test/repos/o/r/issues?page=2"),
        )
    }

    @Test
    fun preservesExplicitPortInOrigin() {
        assertEquals(
            "https://api.example.test:8443" to "/x",
            splitResolvedUrl("https://api.example.test:8443/x"),
        )
    }

    @Test
    fun bareOriginWithNoPathYieldsRootPath() {
        assertEquals("https://api.example.test" to "/", splitResolvedUrl("https://api.example.test"))
    }

    @Test
    fun httpSchemeIsSupportedToo() {
        assertEquals("http://api.example.test" to "/x", splitResolvedUrl("http://api.example.test/x"))
    }

    @Test
    fun rejectsANonAbsoluteUrl() {
        assertFailsWith<IllegalArgumentException> { splitResolvedUrl("/relative/only") }
    }
}
