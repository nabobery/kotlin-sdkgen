package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Information about a number being collected using a reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_numeric
 */
@Serializable(with = TerminalReaderReaderResourceNumeric.Serializer::class)
public class TerminalReaderReaderResourceNumeric(
    /**
     * The collected number
     */
    public val `value`: String? = null,
) {
    public class Builder {
        /**
         * The collected number
         */
        public var `value`: String? = null

        public fun build(): TerminalReaderReaderResourceNumeric =
            TerminalReaderReaderResourceNumeric(
                value = value,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceNumeric =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceNumeric> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceNumeric {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceNumeric")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReaderReaderResourceNumeric must be a JSON object")
            return TerminalReaderReaderResourceNumeric(
                value =
                    rawObject["value"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceNumeric,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceNumeric")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.value?.let { put("value", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceNumeric(
    block: TerminalReaderReaderResourceNumeric.Builder.() -> Unit,
): TerminalReaderReaderResourceNumeric = TerminalReaderReaderResourceNumeric.build(block)
