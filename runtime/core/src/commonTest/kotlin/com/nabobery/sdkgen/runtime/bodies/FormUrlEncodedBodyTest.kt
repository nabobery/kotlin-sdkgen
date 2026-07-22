package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkRequestBody
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNotSame

internal class FormUrlEncodedBodyTest {
    @Test
    fun encodesUtf8AndHtmlFormReservedCharacters() {
        val body =
            FormUrlEncodedBody()
                .add("plain", "AZaz09*-._")
                .add("unicode", "café ☕")
                .add("reserved", "+&=%")
                .add("empty", "")
                .build()

        val bytes = assertIs<SdkRequestBody.Bytes>(body).bytes

        assertEquals(
            "plain=AZaz09*-._&unicode=caf%C3%A9+%E2%98%95&reserved=%2B%26%3D%25&empty=",
            bytes.decodeToString(),
        )
        assertEquals("application/x-www-form-urlencoded", body.contentType)
        assertEquals(bytes.size.toLong(), body.contentLength)
    }

    @Test
    fun preservesDuplicateKeysAndCallerOrder() {
        val body =
            assertIs<SdkRequestBody.Bytes>(
                FormUrlEncodedBody()
                    .add("item", "second")
                    .add("item", "first")
                    .add("after", "last")
                    .build(),
            )

        assertEquals("item=second&item=first&after=last", body.bytes.decodeToString())
    }

    @Test
    fun safelyEncodesNestedDynamicKeySegmentsIncludingLiteralBrackets() {
        val body =
            assertIs<SdkRequestBody.Bytes>(
                FormUrlEncodedBody()
                    .add("metadata[#&=雪[]]", "value")
                    .build(),
            )

        assertEquals("metadata%5B%23%26%3D%E9%9B%AA%5B%5D%5D=value", body.bytes.decodeToString())
    }

    @Test
    fun buildsIndependentSnapshotsAndAllowsRepeatedBuilds() {
        val builder = FormUrlEncodedBody().add("first", "one")
        val first = builder.build()
        val repeated = builder.build()
        builder.add("second", "two")
        val second = builder.build()

        assertNotSame(first, repeated)
        assertEquals("first=one", first.bytes.decodeToString())
        assertEquals("first=one", repeated.bytes.decodeToString())
        assertEquals("first=one&second=two", second.bytes.decodeToString())
    }

    @Test
    fun handlesEmptyTextUnicodeSurrogatesAndLiteralTilde() {
        val body =
            FormUrlEncodedBody()
                .add("", "")
                .add("emoji", "😀")
                .add("surrogate", 0xD800.toChar().toString())
                .add("tilde", "~")
                .build()

        assertEquals("=&emoji=%F0%9F%98%80&surrogate=%EF%BF%BD&tilde=%7E", body.bytes.decodeToString())
    }

    @Test
    fun rendersFiniteNumbersCanonicallyAndRejectsNonFiniteValues() {
        val body =
            FormUrlEncodedBody()
                .add("negativeZero", -0.0)
                .add("exponent", 1.0E20)
                .build()

        assertEquals("negativeZero=0&exponent=1e20", body.bytes.decodeToString())
        assertFailsWith<IllegalArgumentException> { FormUrlEncodedBody().add("value", Double.NaN) }
        assertFailsWith<IllegalArgumentException> { FormUrlEncodedBody().add("value", Double.POSITIVE_INFINITY) }
        assertFailsWith<IllegalArgumentException> { FormUrlEncodedBody().add("value", Double.NEGATIVE_INFINITY) }
    }

    @Test
    fun toStringDoesNotExposeEntryNamesOrValues() {
        val text = FormUrlEncodedBody().add("api_key", "secret-value").toString()

        assertFalse(text.contains("api_key"))
        assertFalse(text.contains("secret-value"))
    }

    @Test
    fun returnsReplayableDefensivelyCopiedBytes() {
        val body = assertIs<SdkRequestBody.Bytes>(FormUrlEncodedBody().add("secret", "value").build())
        val first = body.bytes
        first[0] = 0

        assertContentEquals("secret=value".encodeToByteArray(), body.bytes)
    }
}
