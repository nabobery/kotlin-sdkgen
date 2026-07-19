package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.bodies.TransferDirection
import com.nabobery.sdkgen.runtime.bodies.TransferEvent
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

internal class RecordingTransferObserverTest {
    @Test
    fun recordsCallbacksInOrderIncludingFailureIdentity() {
        val observer = RecordingTransferObserver()
        val event = TransferEvent(TransferDirection.UPLOAD, "call", 1, 2, 4)
        val failure = IllegalStateException("failed")

        observer.onStart(event.copy(bytesTransferred = 0))
        observer.onProgress(event)
        observer.onFailure(event, failure)

        assertEquals(
            listOf(TransferCallbackKind.START, TransferCallbackKind.PROGRESS, TransferCallbackKind.FAILURE),
            observer.events.map { it.kind },
        )
        assertSame(failure, observer.events.last().failure)
        assertEquals(event, observer.events.last().event)
    }

    @Test
    fun eventsSnapshotCannotBeMutatedByLaterRecording() {
        val observer = RecordingTransferObserver()
        val event = TransferEvent(TransferDirection.DOWNLOAD, "call", 1, 0, null)
        observer.onStart(event)
        val snapshot = observer.events

        observer.onCompletion(event)

        assertEquals(1, snapshot.size)
        assertEquals(2, observer.events.size)
    }
}
