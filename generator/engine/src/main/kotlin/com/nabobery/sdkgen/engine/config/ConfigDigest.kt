package com.nabobery.sdkgen.engine.config

import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import java.security.MessageDigest

public object ConfigDigest {
    public fun sha256(config: SdkgenConfigV1Alpha1): String =
        sha256(ConfigFormats.json.encodeToJsonElement(SdkgenConfigV1Alpha1.serializer(), config))

    public fun sha256(element: JsonElement): String = sha256Bytes(canonicalize(element).encodeToByteArray())

    public fun sha256(values: Map<String, String>): String =
        sha256(ConfigFormats.json.encodeToJsonElement(MapSerializer(String.serializer(), String.serializer()), values))

    public fun <T> sha256(
        serializer: SerializationStrategy<T>,
        value: T,
    ): String = sha256(ConfigFormats.json.encodeToJsonElement(serializer, value))

    private fun canonicalize(element: JsonElement): String =
        when (element) {
            is JsonObject -> {
                element.entries
                    .sortedBy { it.key }
                    .joinToString(prefix = "{", postfix = "}", separator = ",") { (key, value) ->
                        "${JsonPrimitive(key)}:${canonicalize(value)}"
                    }
            }

            is JsonArray -> {
                element.joinToString(prefix = "[", postfix = "]", separator = ",", transform = ::canonicalize)
            }

            else -> {
                element.toString()
            }
        }

    private fun sha256Bytes(bytes: ByteArray): String {
        val digest = MessageDigest.getInstance("SHA-256").digest(bytes)
        return buildString(digest.size * 2) {
            digest.forEach { byte ->
                val value = byte.toInt() and 0xff
                append(HEX[value ushr 4])
                append(HEX[value and 0x0f])
            }
        }
    }

    private const val HEX = "0123456789abcdef"
}
