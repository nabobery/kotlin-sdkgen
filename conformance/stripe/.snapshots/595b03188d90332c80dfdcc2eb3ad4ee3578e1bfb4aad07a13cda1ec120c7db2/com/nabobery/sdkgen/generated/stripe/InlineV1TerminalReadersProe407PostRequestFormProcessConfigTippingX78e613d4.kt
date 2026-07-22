package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/process_config/properties/tipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/process_config/properties/tipping
 */
@Serializable(with = InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4.Serializer::class)
public class InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4(
    public val amountEligible: Int? = null,
) {
    public class Builder {
        public var amountEligible: Int? = null

        public fun build(): InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4 =
            InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4(
                amountEligible = amountEligible,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4 must be a JSON object",
                    )
            return InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4(
                amountEligible = rawObject["amount_eligible"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amountEligible?.let { put("amount_eligible", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4(
    block: InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4.Builder.() -> Unit,
): InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4 =
    InlineV1TerminalReadersProe407PostRequestFormProcessConfigTippingX78e613d4.build(block)
