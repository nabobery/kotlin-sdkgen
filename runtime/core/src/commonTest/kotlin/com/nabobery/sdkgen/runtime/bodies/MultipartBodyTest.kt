package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkBufferLimitExceededException
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.toByteArray
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs

internal class MultipartBodyTest {
    @Test
    fun fixedBoundaryProducesExactStandardsFormDataBytesIncludingRepeatedArrayFields() {
        val body =
            MultipartBody(boundaryProvider = { "fixed-boundary" })
                .text("tag", "first")
                .text("tag", "second")
                .part(
                    name = "document",
                    filename = "résumé.txt",
                    mediaType = "text/plain",
                    headers = listOf(SdkHeader("X-Part", "yes")),
                    body = SdkRequestBody.Bytes("hello".encodeToByteArray(), "text/plain"),
                ).build()

        val bytes = runSuspend { body.readAllOneByteAtATime() }

        val expected =
            "--fixed-boundary\r\n" +
                "Content-Disposition: form-data; name=\"tag\"\r\n" +
                "Content-Type: text/plain; charset=utf-8\r\n\r\n" +
                "first\r\n" +
                "--fixed-boundary\r\n" +
                "Content-Disposition: form-data; name=\"tag\"\r\n" +
                "Content-Type: text/plain; charset=utf-8\r\n\r\n" +
                "second\r\n" +
                "--fixed-boundary\r\n" +
                "Content-Disposition: form-data; name=\"document\"; filename=\"résumé.txt\"; " +
                "filename*=UTF-8''r%C3%A9sum%C3%A9.txt\r\n" +
                "Content-Type: text/plain\r\n" +
                "X-Part: yes\r\n\r\n" +
                "hello\r\n" +
                "--fixed-boundary--\r\n"
        assertContentEquals(expected.encodeToByteArray(), bytes)
    }

    @Test
    fun defaultBoundaryIsRandomAndDoesNotTreatLegacyBoundaryTextAsADelimiter() {
        val body =
            MultipartBody()
                .text("field", "before\r\n--sdkgen-boundary\r\nafter")
                .build()

        val payload = runSuspend { body.readAllOneByteAtATime() }.decodeToString()

        assertEquals(false, body.contentType.contains("boundary=sdkgen-boundary"))
        assertEquals(true, payload.contains("before\r\n--sdkgen-boundary\r\nafter"))
    }

    @Test
    fun replayFactoryRetainsOneBoundaryAcrossReplays() {
        val body =
            MultipartBody()
                .text("field", "value")
                .build()
        val first = runSuspend { body.readAllOneByteAtATime() }
        val second = runSuspend { body.readAllOneByteAtATime() }

        assertContentEquals(first, second)
    }

    @Test
    fun knownBodyLengthMustMatchCallerSuppliedPartLength() {
        assertFailsWith<IllegalArgumentException> {
            MultipartBody().part(
                name = "field",
                body = SdkRequestBody.Bytes(byteArrayOf(1, 2), "application/octet-stream"),
                contentLength = 1,
            )
        }
        assertFailsWith<IllegalArgumentException> {
            MultipartBody().part(
                name = "field",
                body = SdkRequestBody.Bytes(byteArrayOf(1, 2), "application/octet-stream"),
                contentLength = 3,
            )
        }
    }

    @Test
    fun contentLengthIsKnownOnlyWhenEveryPartLengthIsKnown() {
        val known =
            MultipartBody(boundaryProvider = { "b" })
                .text("a", "x")
                .binary("file", stream = ChunkStream(listOf(byteArrayOf(1, 2))), contentLength = 2)
                .build()
        val unknown =
            MultipartBody(boundaryProvider = { "b" })
                .binary("file", stream = ChunkStream(listOf(byteArrayOf(1, 2))))
                .build()

        assertEquals(runSuspend { known.readAllOneByteAtATime() }.size.toLong(), known.contentLength)
        assertEquals(null, unknown.contentLength)
    }

    @Test
    fun replayabilityIsTheConjunctionOfPartReplayability() {
        val replayable =
            MultipartBody(boundaryProvider = { "b" })
                .bytes("a", byteArrayOf(1), "application/octet-stream")
                .part(
                    name = "b",
                    mediaType = "application/octet-stream",
                    body =
                        SdkRequestBody.ReplayFactory("application/octet-stream", 1) {
                            SdkRequestBody.OneShot(ChunkStream(listOf(byteArrayOf(2))), "application/octet-stream", 1)
                        },
                ).build()
        val oneShot =
            MultipartBody(boundaryProvider = { "b" })
                .binary("a", ChunkStream(listOf(byteArrayOf(1))), contentLength = 1)
                .build()

        assertIs<SdkRequestBody.ReplayFactory>(replayable)
        assertIs<SdkRequestBody.OneShot>(oneShot)
        val first = runSuspend { replayable.readAllOneByteAtATime() }
        val second = runSuspend { replayable.readAllOneByteAtATime() }
        assertContentEquals(first, second)
    }

    @Test
    fun oneShotMultipartCanContainReplayFactoryPartsWithoutOpeningThemEagerly() {
        var creates = 0
        val body =
            MultipartBody(boundaryProvider = { "b" })
                .part(
                    name = "replayable",
                    body =
                        SdkRequestBody.ReplayFactory("text/plain", 1) {
                            creates += 1
                            SdkRequestBody.OneShot(ChunkStream(listOf("x".encodeToByteArray())), "text/plain", 1)
                        },
                ).binary("one-shot", ChunkStream(listOf("y".encodeToByteArray())), contentLength = 1)
                .build()

        assertEquals(0, creates)
        val payload = runSuspend { body.readAllOneByteAtATime() }.decodeToString()
        assertEquals(1, creates)
        kotlin.test.assertTrue("x" in payload && "y" in payload)
    }

    @Test
    fun boundedTextAndByteConveniencesRejectOversizeValues() {
        assertFailsWith<SdkBufferLimitExceededException> {
            MultipartBody(maxConvenienceBytes = 3).text("field", "four")
        }
        assertFailsWith<SdkBufferLimitExceededException> {
            MultipartBody(maxConvenienceBytes = 3).bytes("field", byteArrayOf(1, 2, 3, 4))
        }
    }

    @Test
    fun legacyArrayPolicyUsesBracketedFieldNames() {
        val body =
            MultipartBody(
                boundaryProvider = { "b" },
                compatibility = MultipartCompatibility.LEGACY_BRACKETS,
            ).textValues("tag", listOf("a", "b"))
                .build()

        val payload = runSuspend { body.readAllOneByteAtATime() }.decodeToString()

        assertEquals(2, payload.split("name=\"tag[]\"").size - 1)
    }
}

internal suspend fun SdkRequestBody.readAllOneByteAtATime(): ByteArray {
    val resolved = if (this is SdkRequestBody.ReplayFactory) create() else this
    val stream = assertIs<SdkRequestBody.OneShot>(resolved).stream
    val chunks = mutableListOf<ByteArray>()
    while (true) chunks += stream.readChunk(1) ?: break
    return chunks.fold(ByteArray(0), ByteArray::plus)
}

internal class ChunkStream(
    chunks: List<ByteArray>,
) : SdkByteStream {
    private val chunks = chunks.map(ByteArray::copyOf).toMutableList()

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0)
        val chunk = chunks.removeFirstOrNull() ?: return null
        if (chunk.size <= maxBytes) return chunk
        chunks.add(0, chunk.copyOfRange(maxBytes, chunk.size))
        return chunk.copyOfRange(0, maxBytes)
    }

    override fun close(cause: Throwable?) = Unit
}

internal fun <T> runSuspend(block: suspend () -> T): T {
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
