package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkRequestBody
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs

internal class BinaryBodiesTest {
    @Test
    fun binaryUploadRetainsKnownOrUnknownLengthWithoutBuffering() {
        val known = binaryUpload(ChunkStream(listOf(byteArrayOf(1, 2))), contentLength = 2)
        val unknown = binaryUpload(ChunkStream(listOf(byteArrayOf(3))))

        assertEquals(2, known.contentLength)
        assertEquals(null, unknown.contentLength)
        assertIs<SdkRequestBody.OneShot>(known)
        assertContentEquals(byteArrayOf(1, 2), runSuspend { known.readAllOneByteAtATime() })
    }

    @Test
    fun binaryDownloadDelegatesToBoundedStreamRead() {
        assertContentEquals(
            byteArrayOf(1, 2, 3),
            runSuspend { binaryDownload(ChunkStream(listOf(byteArrayOf(1, 2), byteArrayOf(3))), maxBytes = 3) },
        )
        assertFailsWith<Exception> {
            runSuspend { binaryDownload(ChunkStream(listOf(byteArrayOf(1, 2, 3, 4))), maxBytes = 3) }
        }
    }
}
