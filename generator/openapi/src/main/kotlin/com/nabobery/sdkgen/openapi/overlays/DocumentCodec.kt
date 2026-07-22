package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import org.yaml.snakeyaml.LoaderOptions
import java.security.MessageDigest

internal object DocumentCodec {
    private const val MAX_YAML_DOCUMENT_LENGTH = 16_777_216

    private val jsonMapper =
        ObjectMapper(JsonFactory())
            .enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)
    private val yamlMapper =
        ObjectMapper(
            YAMLFactory
                .builder()
                .loaderOptions(LoaderOptions().apply { setCodePointLimit(MAX_YAML_DOCUMENT_LENGTH) })
                .build(),
        )

    fun parse(content: ByteArray): JsonNode =
        try {
            yamlMapper.readTree(content)
        } catch (exception: Exception) {
            throw OverlayFormatException("Input is not valid JSON or YAML", exception)
        }

    fun parseJson(content: ByteArray): JsonNode =
        try {
            jsonMapper.readTree(content)
        } catch (exception: Exception) {
            throw OverlayFormatException("Input is not valid JSON", exception)
        }

    fun parseResource(content: String): JsonNode = jsonMapper.readTree(content)

    fun canonicalJson(node: JsonNode): String = jsonMapper.writeValueAsString(canonicalNode(node))

    fun prettyJson(node: JsonNode): String =
        jsonMapper
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(canonicalNode(node)) + "\n"

    fun canonicalNode(node: JsonNode): JsonNode =
        when {
            node.isObject -> {
                val result = jsonMapper.createObjectNode()
                node.fieldNames().asSequence().toList().sorted().forEach { name ->
                    result.set<JsonNode>(name, canonicalNode(node.get(name)))
                }
                result
            }

            node.isArray -> {
                val result = jsonMapper.createArrayNode()
                node.forEach { result.add(canonicalNode(it)) }
                result
            }

            else -> {
                node.deepCopy()
            }
        }

    fun sha256(content: ByteArray): String =
        MessageDigest
            .getInstance("SHA-256")
            .digest(content)
            .joinToString("") { byte -> "%02x".format(byte) }

    fun objectNode(): ObjectNode = jsonMapper.createObjectNode()

    fun arrayNode(): ArrayNode = jsonMapper.createArrayNode()
}
