package com.nabobery.sdkgen.testing

import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

internal class StreamingFixturesTest {
    @Test
    fun chunkedByteStreamDeliversPayloadInScriptedSizes() {
        val stream = ChunkedByteStream("abcdef".encodeToByteArray(), chunkSizes = listOf(1, 3, 2))

        assertContentEquals("a".encodeToByteArray(), runStreamingSuspend { stream.readChunk() })
        assertContentEquals("bcd".encodeToByteArray(), runStreamingSuspend { stream.readChunk() })
        assertContentEquals("ef".encodeToByteArray(), runStreamingSuspend { stream.readChunk() })
        assertEquals(null, runStreamingSuspend { stream.readChunk() })
    }

    @Test
    fun chunkedByteStreamInjectsFailureAtByteOffsetAndRecordsCloseIdentity() {
        val failure = IllegalStateException("offset failure")
        val stream =
            ChunkedByteStream(
                payload = "abcdef".encodeToByteArray(),
                chunkSizes = listOf(4),
                failureAtOffset = 3,
                failure = failure,
            )

        assertContentEquals("abc".encodeToByteArray(), runStreamingSuspend { stream.readChunk() })
        assertSame(failure, assertFailsWith<IllegalStateException> { runStreamingSuspend { stream.readChunk() } })
        stream.close(failure)
        stream.close()
        assertSame(failure, stream.closeCause)
    }

    @Test
    fun sseFixturesRenderFieldsMultilineDataCommentsAndBom() {
        val bytes =
            sseStreamFixture(
                sseCommentFixture("keepalive"),
                sseEventFixture(
                    data = "one\ntwo",
                    eventType = "custom",
                    id = "event-1",
                    retryHintMillis = 250,
                ),
                includeBom = true,
                lineEnding = "\r\n",
            )

        assertEquals(
            "﻿: keepalive\r\n\r\nevent: custom\r\nid: event-1\r\nretry: 250\r\ndata: one\r\ndata: two\r\n\r\n",
            bytes.decodeToString(),
        )
    }
}

private fun <T> runStreamingSuspend(block: suspend () -> T): T {
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
