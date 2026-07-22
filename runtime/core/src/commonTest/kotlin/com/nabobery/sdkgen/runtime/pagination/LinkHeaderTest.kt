package com.nabobery.sdkgen.runtime.pagination

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class LinkHeaderTest {
    @Test
    fun parsesSingleNextLink() {
        val header = """<https://api.example.com/items?page=2>; rel="next""""
        assertEquals("https://api.example.com/items?page=2", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun parsesMultipleLinkValuesInOneHeader() {
        val header =
            """<https://api.example.com/items?page=1>; rel="prev", <https://api.example.com/items?page=3>; rel="next""""
        assertEquals("https://api.example.com/items?page=3", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun parsesAcrossMultipleLinkHeaders() {
        val headers =
            listOf(
                """<https://api.example.com/items?page=1>; rel="prev"""",
                """<https://api.example.com/items?page=3>; rel="next"""",
            )
        assertEquals("https://api.example.com/items?page=3", firstNextLinkTarget(headers))
    }

    @Test
    fun isDeterministicFirstMatchAcrossHeaders() {
        val headers =
            listOf(
                """<https://api.example.com/a>; rel="next"""",
                """<https://api.example.com/b>; rel="next"""",
            )
        assertEquals("https://api.example.com/a", firstNextLinkTarget(headers))
    }

    @Test
    fun handlesCommaInsideAngleBracketedTarget() {
        val header = """<https://api.example.com/items?a=1,2>; rel="next", <https://api.example.com/last>; rel="last""""
        assertEquals("https://api.example.com/items?a=1,2", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun handlesCommaInsideQuotedParamValue() {
        val header =
            """<https://api.example.com/x>; rel="prev"; title="A, B", <https://api.example.com/next>; rel="next""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun handlesEscapedQuotesInsideQuotedValue() {
        val header = """<https://api.example.com/next>; rel="next"; title="say \"hi\"""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun relParamNameIsCaseInsensitive() {
        val header = """<https://api.example.com/next>; REL="next""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun relValueComparisonIsCaseInsensitive() {
        val header = """<https://api.example.com/next>; rel="NEXT""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun parsesQuotedRelTokenList() {
        val header = """<https://api.example.com/next>; rel="alternate next""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun parsesUnquotedRelToken() {
        val header = """<https://api.example.com/next>; rel=next"""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun supportsRelativeReferenceTargets() {
        val header = """</items?page=2>; rel="next""""
        assertEquals("/items?page=2", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun returnsNullWhenNoNextRelPresent() {
        val header = """<https://api.example.com/x>; rel="prev", <https://api.example.com/y>; rel="last""""
        assertNull(firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun returnsNullForEmptyHeaderList() {
        assertNull(firstNextLinkTarget(emptyList()))
    }

    @Test
    fun skipsMalformedLinkValueAndFindsSubsequentNext() {
        val header = """not-a-link-value, <https://api.example.com/next>; rel="next""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun ignoresUnterminatedAngleBracketedValue() {
        val header = """<https://api.example.com/broken; rel="next""""
        assertNull(firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun toleratesExtraWhitespaceAroundDelimiters() {
        val header = """  <https://api.example.com/next>  ;  rel = "next"  """
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun firstValidNextWinsOverLaterMalformedRelWithSameName() {
        val header =
            """<https://api.example.com/first>; rel="next", <https://api.example.com/second>; rel="next""""
        assertEquals("https://api.example.com/first", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun parseLinkHeadersExposesRelListForNonNextRelations() {
        val header = """<https://api.example.com/x>; rel="prev next""""
        val parsed = parseLinkHeaders(listOf(header))
        assertEquals(1, parsed.size)
        assertEquals(listOf("prev", "next"), parsed.single().rel)
    }

    // --- malformed-target recovery (must never let a broken entry hide a later well-formed rel="next") ---

    @Test
    fun malformedUnterminatedTargetFollowedByValidNextIsRecovered() {
        val header = """<https://broken.example/a, <https://api.example.com/items?page=2>; rel="next""""
        assertEquals("https://api.example.com/items?page=2", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun malformedUnterminatedTargetFollowedBySeveralValidLinksIsRecovered() {
        val header =
            """<https://broken.example/a, <https://api.example.com/x>; rel="prev", """ +
                """<https://api.example.com/next>; rel="next""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun multipleConsecutiveMalformedTargetsAreAllSkipped() {
        val header =
            """<https://broken.example/a, <https://broken.example/b, <https://api.example.com/next>; rel="next""""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun unterminatedQuotedParamResynchronizesAtLaterWellFormedNextLink() {
        val header =
            """<https://api.example.com/x>; title="broken; equals==; escaped=\"still-broken, """ +
                """<https://api.example.com/next>; rel=next"""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun ambiguousUnterminatedQuotedParamDoesNotForgeNextLink() {
        val header =
            """<https://api.example.test/real>; rel=prev; title="broken, """ +
                """<https://api.example.test/forged>; rel=next, <https://api.example.test/actual>; rel=next"""

        assertNull(firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun malformedLinkValueWithNextRelationIsDiscardedWithoutRecoveryCandidate() {
        val header = """<https://api.example.test/forged>; rel=next; title="broken"""

        assertNull(firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun malformedLinkValueWithNextRelationIsDiscardedBeforeUnambiguousRecovery() {
        val header =
            """<https://api.example.test/forged>; rel=next; title="broken, """ +
                """<https://api.example.test/actual>; rel=next"""

        assertEquals("https://api.example.test/actual", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun malformedLinkValueWithNextRelationIsDiscardedBeforeAmbiguousRecoveryFailsClosed() {
        val header =
            """<https://api.example.test/forged>; rel=next; title="broken, """ +
                """<https://one.example.test/x>; rel=prev, <https://two.example.test/x>; rel=prev"""

        assertNull(firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun validQuotedParamContainingLinkLikeTextRemainsOneLinkValue() {
        val header =
            """<https://api.example.com/x>; rel="prev"; title="literal, <https://inside.example/x>; rel=next", """ +
                """<https://api.example.com/next>; rel="next""""
        val parsed = parseLinkHeaders(listOf(header))
        assertEquals(2, parsed.size)
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun validQuotedParamWithLinkLikeTextAndEqualsDoesNotForgeNextLink() {
        val header =
            """<https://api.example.test/real>; rel=prev; """ +
                """title="literal, <https://api.example.test/forged>; rel=next; x==", """ +
                """<https://api.example.test/actual>; rel=next"""

        assertEquals("https://api.example.test/actual", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun malformedOpeningAnglesStayWithinLinearScanBound() {
        val header = "<".repeat(4_096)

        val result = parseLinkHeaderValueForTest(header)

        assertEquals(emptyList(), result.values)
        assertTrue(result.scannedCharacters <= header.length * 4)
    }

    @Test
    fun crlfInsideTargetIsPreservedLiterallyAndNeverCorruptsSubsequentParsing() {
        val header =
            "<https://api.example.com/evil\r\nX-Injected: 1>; rel=\"prev\", " +
                "<https://api.example.com/next>; rel=\"next\""
        val parsed = parseLinkHeaders(listOf(header))
        assertEquals(2, parsed.size)
        assertEquals("https://api.example.com/evil\r\nX-Injected: 1", parsed[0].target)
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }

    @Test
    fun controlCharactersInQuotedParamValueDoNotCorruptSubsequentParsing() {
        val header =
            "<https://api.example.com/x>; rel=\"prev\"; title=\"a" +
                0.toChar() +
                "b\", <https://api.example.com/next>; rel=\"next\""
        assertEquals("https://api.example.com/next", firstNextLinkTarget(listOf(header)))
    }
}
