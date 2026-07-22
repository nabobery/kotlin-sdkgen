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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/customs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/customs
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46(
    public val eoriNumber: String? = null,
) {
    public class Builder {
        public var eoriNumber: String? = null

        public fun build(): InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46 =
            InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46(
                eoriNumber = eoriNumber,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46 must be a JSON object",
                    )
            return InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46(
                eoriNumber = rawObject["eori_number"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.eoriNumber?.let { put("eori_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46(
    block: InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46.Builder.() -> Unit,
): InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46 =
    InlineV1IssuingCardsPostRequestFormShippingCustomsX08817e46.build(block)
