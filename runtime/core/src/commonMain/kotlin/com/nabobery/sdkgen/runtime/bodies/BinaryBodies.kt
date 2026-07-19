package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.toByteArray

/** Creates an unbuffered one-shot binary upload body with an optional known [contentLength]. */
public fun binaryUpload(
    stream: SdkByteStream,
    contentLength: Long? = null,
    mediaType: String = "application/octet-stream",
    ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
): SdkRequestBody.OneShot {
    require(contentLength == null || contentLength >= 0) { "contentLength must not be negative" }
    return SdkRequestBody.OneShot(stream, mediaType, contentLength, ownership)
}

/** Buffers a binary download up to [maxBytes], using the runtime's bounded stream convenience. */
public suspend fun binaryDownload(
    stream: SdkByteStream,
    maxBytes: Long,
): ByteArray = stream.toByteArray(maxBytes)
