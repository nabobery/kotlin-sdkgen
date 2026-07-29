package com.nabobery.sdkgen.runtime

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class ResponseResultRequestIdTest {
    private val dummyAlternative =
        ResponseAlternative(
            selector = ResponseSelector.Default,
            mediaTypes = listOf("application/json"),
            typeTag = "Success",
            mode = SdkResponseMode.BUFFERED,
            id = "200",
        )

    @Test
    fun matchedReturnsDefaultRequestId() {
        val headers = listOf(SdkHeader("X-Request-Id", "matched-id-123"))
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )
        assertEquals("matched-id-123", matched.requestId)
    }

    @Test
    fun unknownReturnsDefaultRequestId() {
        val headers = listOf(SdkHeader("Request-Id", "unknown-id-456"))
        val unknown: SdkResponseResult<String> =
            SdkResponseResult.Unknown(
                statusCode = 404,
                headers = headers,
                value = "not found",
            )
        assertEquals("unknown-id-456", unknown.requestId)
    }

    @Test
    fun matchingIsCaseInsensitive() {
        val headers = listOf(SdkHeader("x-github-request-id", "gh-789"))
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )
        assertEquals("gh-789", matched.requestId)
    }

    @Test
    fun headerNamePriorityBeatsResponseOrder() {
        // Headers has Request-Id first, then X-Request-Id second.
        // Default priority is: X-Request-Id > Request-Id > X-GitHub-Request-Id > Stripe-Request-Id.
        val headers =
            listOf(
                SdkHeader("Request-Id", "lower-priority-first-in-response"),
                SdkHeader("X-Request-Id", "higher-priority-second-in-response"),
            )
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )
        assertEquals("higher-priority-second-in-response", matched.requestId)
    }

    @Test
    fun stripeRequestIdHeaderIsSupported() {
        val headers = listOf(SdkHeader("Stripe-Request-Id", "stripe-123"))
        val unknown: SdkResponseResult<String> =
            SdkResponseResult.Unknown(
                statusCode = 200,
                headers = headers,
                value = "ok",
            )
        assertEquals("stripe-123", unknown.requestId)
    }

    @Test
    fun requestIdHeaderPriorityUsesGithubThenStripe() {
        val headers =
            listOf(
                SdkHeader("Stripe-Request-Id", "stripe-after"),
                SdkHeader("X-GitHub-Request-Id", "github-before"),
            )
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )
        assertEquals("github-before", matched.requestId)
    }

    @Test
    fun blankHigherPriorityRequestIdsDoNotMaskAUsableLowerPriorityValue() {
        val headers =
            listOf(
                SdkHeader("X-Request-Id", "  "),
                SdkHeader("Request-Id", ""),
                SdkHeader("Stripe-Request-Id", "stripe-usable"),
            )
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )

        assertEquals("stripe-usable", matched.requestId)
    }

    @Test
    fun blankRepeatedHeaderValueDoesNotMaskTheFirstUsableValueForThatName() {
        val headers =
            listOf(
                SdkHeader("X-Request-Id", ""),
                SdkHeader("x-request-id", "usable-repeated-value"),
                SdkHeader("Stripe-Request-Id", "lower-priority-value"),
            )
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )

        assertEquals("usable-repeated-value", matched.requestId)
    }

    @Test
    fun repeatedWinningHeaderNameUsesFirstPhysicalValue() {
        val headers =
            listOf(
                SdkHeader("X-Request-Id", "first-physical-val"),
                SdkHeader("X-Request-Id", "second-physical-val"),
            )
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )
        assertEquals("first-physical-val", matched.requestId)
    }

    @Test
    fun findRequestIdSupportsCustomPriority() {
        val headers =
            listOf(
                SdkHeader("X-Correlation-Id", "corr-111"),
                SdkHeader("X-Trace-Id", "trace-222"),
            )
        val unknown: SdkResponseResult<String> =
            SdkResponseResult.Unknown(
                statusCode = 500,
                headers = headers,
                value = "error",
            )

        val foundTraceFirst = unknown.findRequestId(listOf("X-Trace-Id", "X-Correlation-Id"))
        assertEquals("trace-222", foundTraceFirst)

        val foundCorrFirst = unknown.findRequestId(listOf("X-Correlation-Id", "X-Trace-Id"))
        assertEquals("corr-111", foundCorrFirst)
    }

    @Test
    fun missingRequestIdReturnsNull() {
        val headers = listOf(SdkHeader("Content-Type", "application/json"))
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = headers,
                value = "ok",
            )
        assertNull(matched.requestId)
        assertNull(matched.findRequestId(listOf("X-Custom-Id")))
    }

    @Test
    fun invalidCustomNamesAreRejected() {
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = listOf(SdkHeader("X-Request-Id", "123")),
                value = "ok",
            )

        // Blank name
        assertFailsWith<IllegalArgumentException> {
            matched.findRequestId(listOf("   "))
        }

        // Empty name
        assertFailsWith<IllegalArgumentException> {
            matched.findRequestId(listOf(""))
        }

        // Case-insensitive duplicate name
        assertFailsWith<IllegalArgumentException> {
            matched.findRequestId(listOf("X-Custom-Id", "x-custom-id"))
        }
    }

    @Test
    fun responseResultsOwnTheirHeaderSnapshot() {
        val matchedSource = mutableListOf(SdkHeader("X-Request-Id", "matched-original"))
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers = matchedSource,
                value = "ok",
            )
        val unknownSource = mutableListOf(SdkHeader("Request-Id", "unknown-original"))
        val unknown: SdkResponseResult<String> =
            SdkResponseResult.Unknown(
                statusCode = 500,
                headers = unknownSource,
                value = "error",
            )

        matchedSource[0] = SdkHeader("X-Request-Id", "matched-mutated")
        matchedSource.clear()
        unknownSource[0] = SdkHeader("Request-Id", "unknown-mutated")
        unknownSource.clear()

        assertEquals(listOf(SdkHeader("X-Request-Id", "matched-original")), matched.headers)
        assertEquals("matched-original", matched.requestId)
        assertEquals(listOf(SdkHeader("Request-Id", "unknown-original")), unknown.headers)
        assertEquals("unknown-original", unknown.requestId)
    }

    @Test
    fun repeatedDefaultRequestIdReadsAreStable() {
        val matched: SdkResponseResult<String> =
            SdkResponseResult.Matched(
                alternative = dummyAlternative,
                statusCode = 200,
                headers =
                    listOf(
                        SdkHeader("Request-Id", "lower-priority"),
                        SdkHeader("X-Request-Id", "stable-id"),
                    ),
                value = "ok",
            )

        repeat(3) {
            assertEquals("stable-id", matched.requestId)
        }
    }
}
