package com.nabobery.sdkgen.runtime.streaming

import com.nabobery.sdkgen.runtime.SdkStreamingException
import com.nabobery.sdkgen.runtime.StreamingDescriptor

/** One application event decoded from a `text/event-stream` response. */
public data class SseEvent(
    public val data: String,
    public val eventType: String = DEFAULT_EVENT_TYPE,
    public val lastEventId: String = "",
    public val retryHintMillis: Long? = null,
) {
    public companion object {
        public const val DEFAULT_EVENT_TYPE: String = "message"
    }
}

internal class ByteLineSplitter(
    private val maxLineBytes: Int,
) {
    private val line = mutableListOf<Byte>()
    private var pendingCarriageReturn = false
    private var atStreamStart = true

    init {
        require(maxLineBytes > 0) { "maxLineBytes must be positive" }
    }

    fun feed(chunk: ByteArray): List<String> {
        val lines = mutableListOf<String>()
        chunk.forEach { byte ->
            if (pendingCarriageReturn) {
                pendingCarriageReturn = false
                if (byte == LF) return@forEach
            }
            when (byte) {
                CR -> {
                    lines += completeLine()
                    pendingCarriageReturn = true
                }

                LF -> {
                    lines += completeLine()
                }

                else -> {
                    append(byte)
                }
            }
        }
        return lines
    }

    fun finish(): List<String> {
        pendingCarriageReturn = false
        return if (line.isEmpty()) emptyList() else listOf(completeLine())
    }

    private fun append(byte: Byte) {
        if (line.size >= maxLineBytes) {
            throw SdkStreamingException("Streaming line exceeded the $maxLineBytes-byte limit.")
        }
        line += byte
    }

    private fun completeLine(): String {
        var bytes = line.toByteArray()
        line.clear()
        if (atStreamStart) {
            atStreamStart = false
            if (bytes.startsWithUtf8Bom()) bytes = bytes.copyOfRange(UTF8_BOM_SIZE, bytes.size)
        }
        return bytes.decodeToString()
    }

    private fun ByteArray.startsWithUtf8Bom(): Boolean =
        size >= UTF8_BOM_SIZE && this[0] == BOM_0 && this[1] == BOM_1 && this[2] == BOM_2

    private companion object {
        const val CR: Byte = 0x0D
        const val LF: Byte = 0x0A
        const val BOM_0: Byte = 0xEF.toByte()
        const val BOM_1: Byte = 0xBB.toByte()
        const val BOM_2: Byte = 0xBF.toByte()
        const val UTF8_BOM_SIZE: Int = 3
    }
}

internal sealed interface SseParserItem

internal data class SseComment(
    val text: String,
) : SseParserItem

private data class ParsedSseEvent(
    val event: SseEvent,
) : SseParserItem

internal class SseParser(
    private val maxEventBytes: Int = StreamingDescriptor.DEFAULT_MAX_EVENT_BYTES,
) {
    private val data = StringBuilder()
    private var dataBytes: Int = 0
    private var eventType: String = ""
    private var lastEventId: String = ""
    private var retryHintMillis: Long? = null

    fun accept(line: String): SseEvent? = (acceptItem(line) as? ParsedSseEvent)?.event

    fun acceptItem(line: String): SseParserItem? {
        if (line.isEmpty()) return dispatch()?.let(::ParsedSseEvent)
        if (line.startsWith(':')) return SseComment(line.substring(1))

        val colon = line.indexOf(':')
        val field = if (colon < 0) line else line.substring(0, colon)
        var value = if (colon < 0) "" else line.substring(colon + 1)
        if (value.startsWith(' ')) value = value.substring(1)

        when (field) {
            "data" -> {
                appendData(value)
            }

            "event" -> {
                eventType = value
            }

            "id" -> {
                if (value.none { it.code == 0 }) lastEventId = value
            }

            "retry" -> {
                if (value.isNotEmpty() && value.all { it in '0'..'9' }) {
                    value.toLongOrNull()?.let { retryHintMillis = it }
                }
            }
        }
        return null
    }

    private fun appendData(value: String) {
        val addedBytes = value.encodeToByteArray().size + 1
        if (dataBytes > maxEventBytes - addedBytes) {
            throw SdkStreamingException("SSE event exceeded the $maxEventBytes-byte limit.")
        }
        data.append(value).append('\n')
        dataBytes += addedBytes
    }

    private fun dispatch(): SseEvent? {
        if (data.isEmpty()) return null
        data.setLength(data.length - 1)
        val event =
            SseEvent(
                data = data.toString(),
                eventType = eventType.ifEmpty { SseEvent.DEFAULT_EVENT_TYPE },
                lastEventId = lastEventId,
                retryHintMillis = retryHintMillis,
            )
        data.clear()
        dataBytes = 0
        eventType = ""
        retryHintMillis = null
        return event
    }
}
