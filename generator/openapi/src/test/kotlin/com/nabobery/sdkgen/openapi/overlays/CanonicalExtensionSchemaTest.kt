package com.nabobery.sdkgen.openapi.overlays

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class CanonicalExtensionSchemaTest {
    @Test
    fun `allOf resolution schema freezes identity and digest shapes`() {
        val schema =
            DocumentCodec.parseJson(
                checkNotNull(
                    javaClass.getResourceAsStream("/schemas/x-sdkgen-allof-resolution.schema.json"),
                ).readBytes(),
            )
        assertEquals("https://json-schema.org/draft/2020-12/schema", schema.path("\$schema").asText())
        assertEquals(false, schema.path("additionalProperties").asBoolean())
        assertEquals(listOf("properties"), schema.path("required").map { it.asText() })
        assertEquals(
            listOf("propertySchemaSha256"),
            schema.at("/properties/properties/additionalProperties/properties/source/required").map { it.asText() },
        )
        assertEquals(
            2,
            schema.at("/properties/properties/additionalProperties/properties/source/oneOf").size(),
        )
        val digestPattern =
            Regex(
                schema
                    .at(
                        "/properties/properties/additionalProperties/properties/source/properties/inlineSchemaSha256/pattern",
                    ).asText(),
            )
        assertTrue(digestPattern.matches("0123456789abcdef".repeat(4)))
        assertFalse(digestPattern.matches("0123456789ABCDEF".repeat(4)))
        assertFalse(digestPattern.matches("0123456789abcdef".repeat(3)))
        assertNotNull(schema.at("/properties/properties/additionalProperties/additionalProperties"))
    }

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
