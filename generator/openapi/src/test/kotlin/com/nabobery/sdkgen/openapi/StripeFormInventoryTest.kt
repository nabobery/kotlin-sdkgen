package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import java.nio.file.Path
import kotlin.io.path.inputStream
import kotlin.test.Test
import kotlin.test.assertEquals

class StripeFormInventoryTest {
    @Test
    fun `pinned Stripe form corpus matches the reviewed inventory`() {
        val root = Path.of(requireNotNull(System.getProperty("corpus.root")))
        val document = root.resolve("stripe/openapi.json").inputStream().use(ObjectMapper()::readTree)
        val forms =
            document.path("paths").properties().flatMap { (_, pathItem) ->
                HTTP_METHODS.mapNotNull { method ->
                    pathItem
                        .get(method)
                        ?.path("requestBody")
                        ?.path("content")
                        ?.get(FORM_MEDIA_TYPE)
                }
            }
        val properties =
            forms.flatMap { form ->
                form
                    .path("schema")
                    .path("properties")
                    .properties()
                    .toList()
            }
        val encodingEntries = forms.flatMap { form -> form.path("encoding").properties().toList() }

        assertEquals(586, forms.size)
        assertEquals(586, forms.count { it.path("schema").path("type").textValue() == "object" })
        assertEquals(0, forms.count { it.path("schema").has("\$ref") })
        assertEquals(2_202, properties.size)
        assertEquals(287, forms.count { it.path("schema").path("properties").isEmpty })
        assertEquals(298, forms.count { !it.path("encoding").isEmpty })
        assertEquals(1_291, encodingEntries.size)
        assertEquals(
            1_291,
            encodingEntries.count { (_, encoding) ->
                encoding.path("style").textValue() == "deepObject" &&
                    encoding.path("explode").booleanValue() &&
                    !encoding.has("allowReserved")
            },
        )
        assertEquals(685, properties.countType("string"))
        assertEquals(131, properties.countType("integer"))
        assertEquals(92, properties.countType("boolean"))
        assertEquals(3, properties.countType("number"))
        assertEquals(633, properties.countType("object"))
        assertEquals(371, properties.countType("array"))
        assertEquals(287, properties.count { (_, schema) -> schema.has("anyOf") })
        assertEquals(0, properties.count { (_, schema) -> schema.has("\$ref") })
        assertEquals(0, properties.count { (_, schema) -> schema.isExplicitlyNullable() })
    }

    private fun List<Map.Entry<String, JsonNode>>.countType(type: String): Int =
        count { (_, schema) -> schema.path("type").textValue() == type }

    private fun JsonNode.isExplicitlyNullable(): Boolean =
        path("nullable").booleanValue() ||
            (path("type").isArray && path("type").any { candidate -> candidate.textValue() == "null" })

    private companion object {
        const val FORM_MEDIA_TYPE = "application/x-www-form-urlencoded"
    }
}
