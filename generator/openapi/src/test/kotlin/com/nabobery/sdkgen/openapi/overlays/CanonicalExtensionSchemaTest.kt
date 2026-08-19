package com.nabobery.sdkgen.openapi.overlays

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CanonicalExtensionSchemaTest {
    @Test
    fun `pagination schema enforces complete RFC 6901 escaping`() {
        val schema =
            DocumentCodec.parseJson(
                checkNotNull(javaClass.getResourceAsStream("/schemas/x-sdkgen-pagination.schema.json")).readBytes(),
            )
        listOf("responseItems", "responseNextCursor", "responseTotal").forEach { field ->
            val pattern = Regex(schema.at("/properties/$field/pattern").textValue())

            listOf("/data~", "/data~2", "/data/~").forEach { pointer ->
                assertFalse(pattern.containsMatchIn(pointer), "$field accepted invalid pointer $pointer")
            }
            listOf("/data~0key", "/data~1items").forEach { pointer ->
                assertTrue(pattern.containsMatchIn(pointer), "$field rejected valid pointer $pointer")
            }
        }
    }
}
