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
 * Information about a email being collected using a reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_email
 */
@Serializable(with = TerminalReaderReaderResourceEmail.Serializer::class)
public class TerminalReaderReaderResourceEmail(
    /**
     * The collected email address
     */
    public val `value`: String? = null,
) {
    public class Builder {
        /**
         * The collected email address
         */
        public var `value`: String? = null

        public fun build(): TerminalReaderReaderResourceEmail =
            TerminalReaderReaderResourceEmail(
                value = value,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceEmail = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceEmail> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceEmail {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceEmail")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReaderReaderResourceEmail must be a JSON object")
            return TerminalReaderReaderResourceEmail(
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
            `value`: TerminalReaderReaderResourceEmail,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceEmail")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.value?.let { put("value", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceEmail(
    block: TerminalReaderReaderResourceEmail.Builder.() -> Unit,
): TerminalReaderReaderResourceEmail = TerminalReaderReaderResourceEmail.build(block)
