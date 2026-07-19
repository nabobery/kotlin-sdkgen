package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.bodies.TransferEvent
import com.nabobery.sdkgen.runtime.bodies.TransferObserver

/** Callback kind captured by [RecordingTransferObserver]. */
public enum class TransferCallbackKind {
    START,
    PROGRESS,
    COMPLETION,
    FAILURE,
}

/** One callback captured by [RecordingTransferObserver], preserving an optional failure by identity. */
public data class RecordedTransferCallback(
    public val kind: TransferCallbackKind,
    public val event: TransferEvent,
    public val failure: Throwable? = null,
)

/** Mutable, single-threaded [TransferObserver] for tests. */
public class RecordingTransferObserver : TransferObserver {
    private val recorded: MutableList<RecordedTransferCallback> = mutableListOf()

    /** Snapshot of callbacks in invocation order. */
    public val events: List<RecordedTransferCallback>
        get() = recorded.toList()

    override fun onStart(event: TransferEvent) {
        recorded += RecordedTransferCallback(TransferCallbackKind.START, event)
    }

    override fun onProgress(event: TransferEvent) {
        recorded += RecordedTransferCallback(TransferCallbackKind.PROGRESS, event)
    }

    override fun onCompletion(event: TransferEvent) {
        recorded += RecordedTransferCallback(TransferCallbackKind.COMPLETION, event)
    }

    override fun onFailure(
        event: TransferEvent,
        failure: Throwable,
    ) {
        recorded += RecordedTransferCallback(TransferCallbackKind.FAILURE, event, failure)
    }
}
