package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.bodies.TransferDirection
import com.nabobery.sdkgen.runtime.bodies.TransferEvent
import com.nabobery.sdkgen.runtime.bodies.TransferObserver
import kotlin.test.Test
import kotlin.test.assertEquals

internal class TransferObserverExecutorTest {
    @Test
    fun executorObservesUploadAndDownloadAboveTransport() {
        val observer = ExecutorRecordingObserver()
        val transport = BodyConsumingTransport(listOf(200))
        val codecs = MediaTypeCodecRegistry.of(BodyCodec)

        val result =
            runTestSuspend {
                SdkExecutor(transport).execute(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata(retry = null),
                            baseUri = "https://example.test",
                            requestValue = "request",
                            requestCodecIds = listOf("body"),
                        ),
                    responseCodecIds = listOf("body"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                    options = CallOptions(transferObserver = observer),
                )
            }

        assertEquals("response", result)
        assertEquals(
            setOf(TransferDirection.UPLOAD, TransferDirection.DOWNLOAD),
            observer.starts.map { it.direction }.toSet(),
        )
        assertEquals(
            observer.starts
                .map {
                    it.callId
                }.distinct()
                .single(),
            observer.completions
                .map { it.callId }
                .distinct()
                .single(),
        )
        assertEquals(listOf(1, 1), observer.starts.map { it.attemptNumber })
    }

    @Test
    fun replayedUploadResetsAttemptLocalCounts() {
        val observer = ExecutorRecordingObserver()
        val transport = BodyConsumingTransport(listOf(503, 200))
        val codecs = MediaTypeCodecRegistry.of(BodyCodec)
        val time = DeterministicTime()

        runTestSuspend {
            SdkExecutor(
                transport = transport,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
            ).execute(
                request =
                    SdkExecutionRequest(
                        metadata = metadata(retry = RetryDescriptor(maxAttempts = 2)),
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("body"),
                    ),
                responseCodecIds = listOf("body"),
                requestCodecs = codecs,
                responseCodecs = codecs,
                options = CallOptions(transferObserver = observer),
            )
        }

        val uploadStarts = observer.starts.filter { it.direction == TransferDirection.UPLOAD }
        val uploadCompletions = observer.completions.filter { it.direction == TransferDirection.UPLOAD }
        assertEquals(listOf(1, 2), uploadStarts.map { it.attemptNumber })
        assertEquals(listOf(0L, 0L), uploadStarts.map { it.bytesTransferred })
        assertEquals(listOf(7L, 7L), uploadCompletions.map { it.bytesTransferred })
    }

    private fun metadata(retry: RetryDescriptor?): OperationMetadata =
        OperationMetadata(
            operationId = "upload",
            method = "POST",
            path = "/upload",
            requestMediaTypes = listOf("application/octet-stream"),
            responseMediaTypes = listOf("text/plain"),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
            retry = retry,
            safety = OperationSafety(idempotent = true),
        )
}

private object BodyCodec : MediaTypeCodec<String> {
    override val id: String = "body"
    override val mediaTypes: Set<String> = setOf("application/octet-stream", "text/plain")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String {
        val chunks = mutableListOf<ByteArray>()
        while (true) chunks += body.readChunk() ?: break
        return chunks.fold(ByteArray(0), ByteArray::plus).decodeToString()
    }
}

private class BodyConsumingTransport(
    statuses: List<Int>,
) : SdkTransport {
    private val statuses = statuses.toMutableList()

    override suspend fun execute(request: SdkRequest): SdkResponse {
        val body = requireNotNull(request.body)
        val opened = if (body is SdkRequestBody.ReplayFactory) body.create() else body
        when (opened) {
            is SdkRequestBody.Bytes -> {
                opened.bytes
            }

            is SdkRequestBody.OneShot -> {
                while (opened.stream.readChunk() != null) {
                    // Consume through the neutral transport seam.
                }
            }

            is SdkRequestBody.ReplayFactory -> {
                error("Nested replay factory")
            }
        }
        return SdkResponse(
            statuses.removeFirst(),
            listOf(SdkHeader("Content-Type", "text/plain")),
            StringStream("response"),
        )
    }
}

private class ExecutorRecordingObserver : TransferObserver {
    val starts = mutableListOf<TransferEvent>()
    val completions = mutableListOf<TransferEvent>()

    override fun onStart(event: TransferEvent) {
        starts += event
    }

    override fun onProgress(event: TransferEvent) = Unit

    override fun onCompletion(event: TransferEvent) {
        completions += event
    }

    override fun onFailure(
        event: TransferEvent,
        failure: Throwable,
    ) = Unit
}
