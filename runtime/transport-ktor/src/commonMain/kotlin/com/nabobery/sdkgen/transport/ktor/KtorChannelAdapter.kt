package com.nabobery.sdkgen.transport.ktor

import io.ktor.utils.io.ByteReadChannel
import io.ktor.utils.io.readAvailable

/**
 * Wraps a live ktor [ByteReadChannel] as the small [KtorResponseSource] seam [pumpKtorResponseBody] pumps from.
 *
 * Uses [ByteReadChannel.readAvailable], not `readRemaining`: `readRemaining(max)` treats `max` as a *target* it
 * blocks until reaching (or EOF) — the wrong shape for incremental delivery, since a slow/partial write would be
 * held back until either `max` bytes had arrived or the stream closed, silently defeating streaming (observed as a
 * hang in this adapter's own tests: a `MockEngine` writer that wrote a few bytes and then merely paused, rather than
 * closing, left `readRemaining` waiting forever for the rest of a chunk that was never coming).
 * [ByteReadChannel.readAvailable] instead returns whatever is already sitting in the channel's buffer, suspending
 * only when that buffer is currently empty, so the pump never reads further ahead than its own bounded transfer
 * buffer and never waits for more than "at least one byte."
 */
internal fun ByteReadChannel.asResponseSource(): KtorResponseSource =
    KtorResponseSource { maxBytes ->
        val buffer = ByteArray(maxBytes)
        val read = readAvailable(buffer, 0, maxBytes)
        if (read == -1) null else buffer.copyOf(read)
    }
