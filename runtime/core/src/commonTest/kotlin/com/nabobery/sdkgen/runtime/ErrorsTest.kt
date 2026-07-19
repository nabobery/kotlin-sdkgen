package com.nabobery.sdkgen.runtime

import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class ErrorsTest {
    @Test
    fun sdkTimeoutExceptionCarriesPhase() {
        val exception = SdkTimeoutException(TimeoutPhase.STREAM_IDLE, "idle too long", operationId = "op")

        assertEquals(TimeoutPhase.STREAM_IDLE, exception.phase)
        assertEquals("op", exception.operationId)
    }

    @Test
    fun sdkStreamingExceptionCarriesMessageAndOperationId() {
        val exception = SdkStreamingException("bad frame", operationId = "op")

        assertEquals("bad frame", exception.message)
        assertEquals("op", exception.operationId)
    }

    @Test
    fun diagnosticRedactionRemovesCompleteQuotedAndUnquotedSensitiveValues() {
        val text =
            """{"password":"correct horse battery staple","cookie":"session=abc; token=cookie-secret"}""" +
                " password=plain-secret token=token-secret"

        val redacted = redactDiagnosticText(text)

        assertFalse(redacted.contains("correct horse battery staple"), redacted)
        assertFalse(redacted.contains("cookie-secret"), redacted)
        assertFalse(redacted.contains("plain-secret"), redacted)
        assertFalse(redacted.contains("token-secret"), redacted)
        assertTrue(redacted.contains("password"), redacted)
        assertTrue(redacted.contains("<redacted>"), redacted)
    }

    @Test
    fun diagnosticRedactionRemovesEscapedQuotesInsideQuotedValues() {
        val text = """{"password":"a \"quoted\" secret"}"""

        val redacted = redactDiagnosticText(text)

        assertFalse(redacted.contains("quoted"), redacted)
        assertFalse(redacted.contains("secret"), redacted)
        assertTrue(redacted.contains("password"), redacted)
        assertTrue(redacted.contains("<redacted>"), redacted)
    }

    @Test
    fun unknownApiExceptionCapturesBoundedRedactedPreview() {
        val exception =
            UnknownApiException(
                statusCode = 599,
                headers = listOf(SdkHeader("X-Request-Id", "abc")),
                redactedBodyPreview = "partial body",
                operationId = "op",
            )

        assertEquals(599, exception.statusCode)
        assertEquals("partial body", exception.redactedBodyPreview)
        assertEquals("abc", exception.headers.firstValue("X-Request-Id"))
    }

    @Test
    fun unknownApiExceptionTruncatesOverLimitPreviewToBoundedUtf8Bytes() {
        val overLimit = "a".repeat(UnknownApiException.MAX_BODY_PREVIEW_BYTES + 100)

        val exception =
            UnknownApiException(
                statusCode = 500,
                headers = emptyList(),
                redactedBodyPreview = overLimit,
                operationId = "op",
            )

        val preview = requireNotNull(exception.redactedBodyPreview)
        assertTrue(preview.encodeToByteArray().size <= UnknownApiException.MAX_BODY_PREVIEW_BYTES)
        assertTrue(preview.endsWith("…[truncated]"))
    }

    @Test
    fun unknownApiExceptionDefensivelyCopiesHeaders() {
        val source = mutableListOf(SdkHeader("X-Request-Id", "abc"))
        val exception =
            UnknownApiException(
                statusCode = 500,
                headers = source,
                redactedBodyPreview = null,
                operationId = "op",
            )

        source.add(SdkHeader("X-Extra", "1"))

        assertEquals(listOf(SdkHeader("X-Request-Id", "abc")), exception.headers)
    }

    @Test
    fun sdkApiExceptionDefensivelyCopiesHeaders() {
        val source = mutableListOf(SdkHeader("X-Request-Id", "abc"))
        val exception = SdkApiException(statusCode = 500, headers = source, operationId = "op")

        source.add(SdkHeader("X-Extra", "1"))

        assertEquals(listOf(SdkHeader("X-Request-Id", "abc")), exception.headers)
    }

    @Test
    fun unknownApiExceptionTruncatesMultibyteContentAtAValidUtf8Boundary() {
        // 3-byte-per-character content sized so the naive byte budget (MAX_BODY_PREVIEW_BYTES minus the marker's
        // byte length) lands mid-character: 30_000 euro signs is 90_000 bytes, comfortably over the 64 KiB cap,
        // and the cut point is not divisible by 3, so a byte-blind truncation would slice one euro sign in half.
        val overLimit = "€".repeat(30_000)

        val exception =
            UnknownApiException(
                statusCode = 500,
                headers = emptyList(),
                redactedBodyPreview = overLimit,
                operationId = "op",
            )

        val preview = requireNotNull(exception.redactedBodyPreview)
        val previewBytes = preview.encodeToByteArray()

        // The whole preview, including the marker, must never exceed the cap...
        assertTrue(previewBytes.size <= UnknownApiException.MAX_BODY_PREVIEW_BYTES)
        assertTrue(preview.endsWith("…[truncated]"))
        // ...and a correct UTF-8-boundary retreat never produces a replacement character: every byte kept forms a
        // complete character, so decoding-then-re-encoding is lossless and does not silently grow past the cap.
        assertTrue('�' !in preview)
    }

    @Test
    fun unknownApiExceptionLeavesUnderLimitPreviewUnchanged() {
        val exception =
            UnknownApiException(
                statusCode = 500,
                headers = emptyList(),
                redactedBodyPreview = "short body",
                operationId = "op",
            )

        assertEquals("short body", exception.redactedBodyPreview)
    }

    @Test
    fun retryHistoryDefaultsToEmptyAndIsAttachableOnceToAFinalException() {
        val exception = SdkTransportException("exhausted", operationId = "op")
        assertEquals(emptyList(), exception.retryHistory)

        val history =
            listOf(
                AttemptOutcome(1, AttemptClassification.RETRIED, delayMillis = 500),
                AttemptOutcome(2, AttemptClassification.EXHAUSTED, delayMillis = null),
            )
        exception.attachRetryHistory(history)

        assertEquals(history, exception.retryHistory)
        assertEquals(2, exception.retryHistory.size)
    }

    @Test
    fun retryHistoryCannotBeAttachedTwice() {
        val exception = SdkTransportException("exhausted", operationId = "op")
        exception.attachRetryHistory(listOf(AttemptOutcome(1, AttemptClassification.RETRIED)))

        assertFailsWith<IllegalStateException> {
            exception.attachRetryHistory(listOf(AttemptOutcome(2, AttemptClassification.EXHAUSTED)))
        }
    }

    @Test
    fun retryHistoryKeepsOnlyTheMostRecentThirtyTwoEntries() {
        val exception = SdkTransportException("exhausted", operationId = "op")
        val history = (1..40).map { AttemptOutcome(it, AttemptClassification.RETRIED) }

        exception.attachRetryHistory(history)

        assertEquals(32, exception.retryHistory.size)
        assertEquals(9, exception.retryHistory.first().attemptNumber)
        assertEquals(40, exception.retryHistory.last().attemptNumber)
    }

    @Test
    fun attemptOutcomeSummaryIsTruncatedAtTwoHundredFiftySixCharacters() {
        val short = AttemptOutcome(1, AttemptClassification.RETRIED, summary = "HTTP 503")
        assertEquals("HTTP 503", short.summary)

        val overLong = "x".repeat(300)
        val truncated = AttemptOutcome(1, AttemptClassification.RETRIED, summary = overLong)
        assertEquals(256, truncated.summary?.length)
        assertEquals("x".repeat(256), truncated.summary)

        val noSummary = AttemptOutcome(1, AttemptClassification.RETRIED)
        assertEquals(null, noSummary.summary)
    }

    @Test
    fun sdkExceptionSubclassesAreOpenNotSealedAcrossPackage() {
        // Compiles only because SdkException is `open`, not `sealed`: adapters and generated code may add their
        // own subclasses outside this package.
        class CustomSdkException(
            message: String,
        ) : SdkException(message)
        val instance = CustomSdkException("custom")
        assertEquals("custom", instance.message)
    }

    @Test
    fun cancellationIsNeverWrappedItIsRethrownByIdentityFromExecutor() {
        val cancellation = CancellationException("stop")
        val transport = SdkTransport { throw cancellation }
        val executor = SdkExecutor(transport)
        val codecs = MediaTypeCodecRegistry.of(EchoCodec)

        val thrown =
            assertFailsWith<CancellationException> {
                runSuspendForErrorsTest {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata =
                                    OperationMetadata(
                                        operationId = "op",
                                        method = "GET",
                                        path = "/x",
                                        requestMediaTypes = listOf("application/json"),
                                        responseMediaTypes = listOf("application/json"),
                                        successStatusCodes = setOf(200),
                                        responseMode = SdkResponseMode.BUFFERED,
                                        deadlines = SdkDeadlines(null, null, null),
                                    ),
                                baseUri = "https://example.test",
                                requestValue = "req",
                                requestCodecIds = listOf("echo"),
                            ),
                        responseCodecIds = listOf("echo"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }
        assertSame(cancellation, thrown)
    }
}

private object EchoCodec : MediaTypeCodec<String> {
    override val id: String = "echo"
    override val mediaTypes: Set<String> = setOf("application/json")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = ""
}

private fun <T> runSuspendForErrorsTest(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome).getOrThrow()
}
