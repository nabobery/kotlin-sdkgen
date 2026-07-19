package com.nabobery.sdkgen.runtime.streaming

import com.nabobery.sdkgen.runtime.EventMatcher
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkSerializationException
import com.nabobery.sdkgen.runtime.SdkStreamingException
import com.nabobery.sdkgen.runtime.StreamingDescriptor
import com.nabobery.sdkgen.runtime.boundUtf8Preview
import com.nabobery.sdkgen.runtime.withIdleDeadline
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.transform
import kotlin.coroutines.cancellation.CancellationException

/**
 * Opens and incrementally parses a fresh SSE response stream for each collection.
 *
 * The stream is closed normally at EOF or a terminal sentinel, and with the exact failure object when collection,
 * decoding, downstream emission, or stream reading fails.
 */
public fun sseFlow(
    streamProvider: suspend () -> SdkByteStream,
    descriptor: StreamingDescriptor.ServerSentEvents,
    idleMillis: Long? = null,
): Flow<SseEvent> =
    flow {
        val stream = streamProvider().withIdleDeadline(idleMillis)
        try {
            val splitter = ByteLineSplitter(StreamingDescriptor.DEFAULT_MAX_EVENT_BYTES)
            val parser = SseParser()
            var terminal = false
            while (!terminal) {
                val chunk = stream.readChunk() ?: break
                check(chunk.isNotEmpty()) { "readChunk must return null at EOF instead of an empty chunk" }
                for (line in splitter.feed(chunk)) {
                    val event = parser.accept(line) ?: continue
                    if (event.data == descriptor.terminalSentinel) {
                        terminal = true
                        break
                    }
                    descriptor.inBandError?.let { matcher ->
                        if (matcher.matches(event)) throw inBandSseFailure(event)
                    }
                    emit(event)
                }
            }
            if (!terminal) {
                for (line in splitter.finish()) {
                    val event = parser.accept(line) ?: continue
                    if (event.data == descriptor.terminalSentinel) break
                    descriptor.inBandError?.let { matcher ->
                        if (matcher.matches(event)) throw inBandSseFailure(event)
                    }
                    emit(event)
                }
            }
            stream.close()
        } catch (failure: Throwable) {
            runCatching { stream.close(failure) }
            throw failure
        }
    }

/** Opens and incrementally decodes a fresh JSON-lines stream for each collection. */
public fun <T> jsonLinesFlow(
    streamProvider: suspend () -> SdkByteStream,
    descriptor: StreamingDescriptor.JsonLines,
    decode: (String) -> T,
): Flow<T> = jsonLinesFlow(streamProvider, descriptor, null, decode)

/** Opens and incrementally decodes JSON-lines with a runtime-enforced inter-chunk idle deadline. */
public fun <T> jsonLinesFlow(
    streamProvider: suspend () -> SdkByteStream,
    descriptor: StreamingDescriptor.JsonLines,
    idleMillis: Long?,
    decode: (String) -> T,
): Flow<T> =
    flow {
        val stream = streamProvider().withIdleDeadline(idleMillis)
        try {
            val splitter = ByteLineSplitter(StreamingDescriptor.DEFAULT_MAX_EVENT_BYTES)
            var lineNumber = 0L
            var terminal = false
            while (!terminal) {
                val chunk = stream.readChunk() ?: break
                check(chunk.isNotEmpty()) { "readChunk must return null at EOF instead of an empty chunk" }
                for (line in splitter.feed(chunk)) {
                    lineNumber += 1
                    if (line.isBlank()) continue
                    if (line == descriptor.terminalSentinel) {
                        terminal = true
                        break
                    }
                    descriptor.inBandError?.let { matcher ->
                        if (matcher.matches(line)) {
                            val preview = boundUtf8Preview(line, MAX_PREVIEW_BYTES, TRUNCATION_MARKER)
                            throw SdkStreamingException("JSON-lines in-band error at line $lineNumber: $preview")
                        }
                    }
                    emit(decodeLine(line, lineNumber, decode))
                }
            }
            if (!terminal) {
                for (line in splitter.finish()) {
                    lineNumber += 1
                    if (line.isBlank() || line == descriptor.terminalSentinel) continue
                    descriptor.inBandError?.let { matcher ->
                        if (matcher.matches(line)) {
                            val preview = boundUtf8Preview(line, MAX_PREVIEW_BYTES, TRUNCATION_MARKER)
                            throw SdkStreamingException("JSON-lines in-band error at line $lineNumber: $preview")
                        }
                    }
                    emit(decodeLine(line, lineNumber, decode))
                }
            }
            stream.close()
        } catch (failure: Throwable) {
            runCatching { stream.close(failure) }
            throw failure
        }
    }

/** Decodes non-empty SSE `data` values incrementally. */
public fun <T> Flow<SseEvent>.decodeData(decode: (String) -> T): Flow<T> =
    transform { event ->
        if (event.data.isNotEmpty()) {
            val decoded =
                try {
                    decode(event.data)
                } catch (cancellation: CancellationException) {
                    throw cancellation
                } catch (failure: Throwable) {
                    throw SdkSerializationException("Failed to decode SSE event data.", cause = failure)
                }
            emit(decoded)
        }
    }

private fun <T> decodeLine(
    line: String,
    lineNumber: Long,
    decode: (String) -> T,
): T =
    try {
        decode(line)
    } catch (cancellation: CancellationException) {
        throw cancellation
    } catch (failure: Throwable) {
        throw SdkSerializationException("Failed to decode JSON-lines value at line $lineNumber.", cause = failure)
    }

private fun EventMatcher.matches(event: SseEvent): Boolean =
    when (this) {
        is EventMatcher.FieldEquals -> {
            when (field) {
                "data" -> event.data == value
                "eventType" -> event.eventType == value
                "lastEventId" -> event.lastEventId == value
                else -> false
            }
        }
    }

private fun EventMatcher.matches(line: String): Boolean =
    when (this) {
        is EventMatcher.FieldEquals -> (field == "line" || field == "data") && line == value
    }

private fun inBandSseFailure(event: SseEvent): SdkStreamingException =
    SdkStreamingException(
        "SSE in-band error (eventType=${event.eventType}, " +
            "lastEventId=${boundUtf8Preview(event.lastEventId, MAX_PREVIEW_BYTES, TRUNCATION_MARKER)}): " +
            boundUtf8Preview(event.data, MAX_PREVIEW_BYTES, TRUNCATION_MARKER),
    )

private const val MAX_PREVIEW_BYTES: Int = 64 * 1024
private const val TRUNCATION_MARKER: String = "…[truncated]"
