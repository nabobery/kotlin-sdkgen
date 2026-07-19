package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkRequestBody
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertSame

internal class TransferObservationTest {
    @Test
    fun observingStreamEmitsStartMonotonicProgressAndCompletion() {
        val observer = RecordingObserver()
        val stream =
            observeTransfer(
                stream = ChunkStream(listOf(byteArrayOf(1, 2), byteArrayOf(3))),
                observer = observer,
                direction = TransferDirection.DOWNLOAD,
                callId = "call-1",
                attemptNumber = 2,
                totalBytes = 3,
            )

        assertContentEquals(byteArrayOf(1, 2, 3), runSuspend { stream.toBytes() })

        assertEquals(
            listOf(
                "start:DOWNLOAD:call-1:2:0:3",
                "progress:DOWNLOAD:call-1:2:2:3",
                "progress:DOWNLOAD:call-1:2:3:3",
                "completion:DOWNLOAD:call-1:2:3:3",
            ),
            observer.events,
        )
    }

    @Test
    fun observerFailuresNeverAlterStreamOutcome() {
        val stream =
            observeTransfer(
                stream = ChunkStream(listOf(byteArrayOf(1, 2))),
                observer = ThrowingObserver,
                direction = TransferDirection.UPLOAD,
                callId = "call-1",
                attemptNumber = 1,
                totalBytes = 2,
            )

        assertContentEquals(byteArrayOf(1, 2), runSuspend { stream.toBytes() })
    }

    @Test
    fun failureAndCancellationAreReportedButRethrownByIdentity() {
        val cancellation = CancellationException("cancel")
        val observer = RecordingObserver()
        val stream =
            observeTransfer(
                stream = FailingStream(cancellation),
                observer = observer,
                direction = TransferDirection.DOWNLOAD,
                callId = "call-1",
                attemptNumber = 1,
            )

        val thrown = kotlin.test.assertFails { runSuspend { stream.readChunk() } }

        assertSame(cancellation, thrown)
        assertSame(cancellation, observer.failures.single())
    }

    @Test
    fun closeCauseIdentityPassesThroughWrapper() {
        val cause = IllegalStateException("closed")
        val delegate = CloseRecordingStream()
        val observer = RecordingObserver()
        val stream = observeTransfer(delegate, observer, TransferDirection.DOWNLOAD, "call-1", 1)

        stream.close(cause)

        assertSame(cause, delegate.closeCause)
        assertSame(cause, observer.failures.single())
    }

    @Test
    fun requestBodyDecoratorPreservesReplayabilityLengthAndAttemptLocalReset() {
        val observer = RecordingObserver()
        val body =
            observeTransfer(
                body = SdkRequestBody.Bytes(byteArrayOf(1, 2), "application/octet-stream"),
                observer = observer,
                callId = "call-1",
                attemptNumber = 4,
            )

        assertIs<SdkRequestBody.ReplayFactory>(body)
        assertEquals(2, body.contentLength)
        assertContentEquals(byteArrayOf(1, 2), runSuspend { body.readAllOneByteAtATime() })
        assertContentEquals(byteArrayOf(1, 2), runSuspend { body.readAllOneByteAtATime() })
        assertEquals(2, observer.events.count { it == "start:UPLOAD:call-1:4:0:2" })
        assertEquals(2, observer.events.count { it == "completion:UPLOAD:call-1:4:2:2" })
    }
}

private suspend fun SdkByteStream.toBytes(): ByteArray {
    val chunks = mutableListOf<ByteArray>()
    while (true) chunks += readChunk() ?: break
    return chunks.fold(ByteArray(0), ByteArray::plus)
}

private class RecordingObserver : TransferObserver {
    val events = mutableListOf<String>()
    val failures = mutableListOf<Throwable>()

    override fun onStart(event: TransferEvent) {
        events += event.render("start")
    }

    override fun onProgress(event: TransferEvent) {
        events += event.render("progress")
    }

    override fun onCompletion(event: TransferEvent) {
        events += event.render("completion")
    }

    override fun onFailure(
        event: TransferEvent,
        failure: Throwable,
    ) {
        events += event.render("failure")
        failures += failure
    }
}

private object ThrowingObserver : TransferObserver {
    override fun onStart(event: TransferEvent): Unit = error("observer start")

    override fun onProgress(event: TransferEvent): Unit = error("observer progress")

    override fun onCompletion(event: TransferEvent): Unit = error("observer completion")

    override fun onFailure(
        event: TransferEvent,
        failure: Throwable,
    ): Unit = error("observer failure")
}

private fun TransferEvent.render(kind: String): String =
    "$kind:$direction:$callId:$attemptNumber:$bytesTransferred:$totalBytes"

private class FailingStream(
    private val failure: Throwable,
) : SdkByteStream {
    override suspend fun readChunk(maxBytes: Int): ByteArray? = throw failure

    override fun close(cause: Throwable?) = Unit
}

private class CloseRecordingStream : SdkByteStream {
    var closeCause: Throwable? = null

    override suspend fun readChunk(maxBytes: Int): ByteArray? = null

    override fun close(cause: Throwable?) {
        closeCause = cause
    }
}
