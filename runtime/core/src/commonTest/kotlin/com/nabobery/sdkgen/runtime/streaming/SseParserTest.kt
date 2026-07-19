package com.nabobery.sdkgen.runtime.streaming

import com.nabobery.sdkgen.runtime.SdkStreamingException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class SseParserTest {
    @Test
    fun lineSplitterRecognizesAllTerminatorsAcrossHostileBoundaries() {
        val splitter = ByteLineSplitter(maxLineBytes = 32)

        val lines =
            buildList {
                addAll(splitter.feed("a\r".encodeToByteArray()))
                addAll(splitter.feed("\nb\nc\rd".encodeToByteArray()))
                addAll(splitter.finish())
            }

        assertEquals(listOf("a", "b", "c", "d"), lines)
    }

    @Test
    fun lineSplitterStripsOneLeadingBomAndDecodesUtf8OnlyAfterLineCompletion() {
        val bytes = "data: café\n﻿kept\n".encodeToByteArray()
        val splitter = ByteLineSplitter(maxLineBytes = 64)
        val lines = mutableListOf<String>()

        bytes.forEach { byte -> lines += splitter.feed(byteArrayOf(byte)) }
        lines += splitter.finish()

        assertEquals(listOf("data: café", "﻿kept"), lines)
    }

    @Test
    fun lineSplitterRejectsLineBeyondByteBudget() {
        val splitter = ByteLineSplitter(maxLineBytes = 3)

        assertFailsWith<SdkStreamingException> {
            splitter.feed("four".encodeToByteArray())
        }
    }

    @Test
    fun parserRejectsAggregatedEventBeyondByteBudget() {
        val parser = SseParser(maxEventBytes = 5)

        parser.accept("data: ab")
        assertFailsWith<SdkStreamingException> {
            parser.accept("data: cd")
        }
    }

    @Test
    fun parserImplementsWhatwgFieldSemantics() {
        val parser = SseParser()
        val events =
            listOf(
                ": keepalive",
                "id: first",
                "retry: 1500",
                "retry: 1x",
                "event: custom",
                "data: first",
                "data:second",
                "",
                "data",
                "",
            ).mapNotNull(parser::accept)

        assertEquals(
            listOf(
                SseEvent("first\nsecond", "custom", "first", 1500),
                SseEvent("", "message", "first", null),
            ),
            events,
        )
    }

    @Test
    fun parserAppliesWhatwgFieldParsingMatrix() {
        val cases =
            listOf(
                FieldCase(
                    name = "split field at first colon",
                    lines = listOf("data: first:second", ""),
                    expected = SseEvent("first:second"),
                ),
                FieldCase(
                    name = "strip exactly one leading space",
                    lines = listOf("data:  retained", ""),
                    expected = SseEvent(" retained"),
                ),
                FieldCase(
                    name = "treat field without colon as empty value",
                    lines = listOf("data", ""),
                    expected = SseEvent(""),
                ),
                FieldCase(
                    name = "ignore non-ASCII-digit retry",
                    lines = listOf("retry: +1", "data: value", ""),
                    expected = SseEvent("value"),
                ),
                FieldCase(
                    name = "ignore unknown fields and comments",
                    lines = listOf(": keepalive", "unknown: value", "data: value", ""),
                    expected = SseEvent("value"),
                ),
            )

        cases.forEach { case ->
            val actual = case.lines.mapNotNull(SseParser()::accept).single()
            assertEquals(case.expected, actual, case.name)
        }
    }

    @Test
    fun parserIgnoresOverflowingRetryAndKeepsThePreviousHint() {
        val parser = SseParser()

        parser.accept("retry: 1500")
        parser.accept("retry: 999999999999999999999999999999")
        parser.accept("data: payload")

        assertEquals(SseEvent("payload", retryHintMillis = 1500), parser.accept(""))
    }

    @Test
    fun parserRetainsEventAndRetryBuffersWhenEmptyDataPreventsDispatch() {
        val parser = SseParser()

        parser.accept("event: later")
        parser.accept("retry: 42")
        assertEquals(null, parser.accept(""))
        parser.accept("data: payload")

        assertEquals(SseEvent("payload", "later", "", 42), parser.accept(""))
    }

    @Test
    fun parserDoesNotDispatchEmptyDataBufferButStillUpdatesId() {
        val parser = SseParser()
        val nulId =
            buildString {
                append("ignored")
                append(0.toChar())
                append("value")
            }

        assertEquals(null, parser.accept("id: next"))
        assertEquals(null, parser.accept(""))
        assertEquals(null, parser.accept("id: $nulId"))
        assertEquals(null, parser.accept(""))
        parser.accept("data: payload")

        assertEquals(SseEvent("payload", "message", "next", null), parser.accept(""))
    }

    @Test
    fun parserSurfacesCommentsOnlyThroughItsInternalItemApi() {
        val parser = SseParser()

        assertEquals(SseComment(" keepalive"), parser.acceptItem(": keepalive"))
        assertEquals(null, parser.accept(": keepalive"))
    }

    @Test
    fun parserIgnoresCommentsAndUnknownFieldsAndDefaultsEventType() {
        val parser = SseParser()

        assertEquals(null, parser.accept(":"))
        assertEquals(null, parser.accept("unknown: value"))
        parser.accept("data: hello")

        assertEquals(SseEvent("hello", "message", "", null), parser.accept(""))
    }

    @Test
    fun lineSplitterStripsLeadingBomEvenWhenSplitAcrossFeeds() {
        val bytes = "﻿data: hi\nsecond\n".encodeToByteArray()
        val splitter = ByteLineSplitter(maxLineBytes = 64)
        val lines = mutableListOf<String>()

        bytes.forEach { byte -> lines += splitter.feed(byteArrayOf(byte)) }
        lines += splitter.finish()

        assertEquals(listOf("data: hi", "second"), lines)
    }

    private data class FieldCase(
        val name: String,
        val lines: List<String>,
        val expected: SseEvent,
    )
}
