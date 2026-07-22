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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_op
 * tions/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_op
 * tions/properties/card
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214(
    public val commodityCode: String? = null,
) {
    public class Builder {
        public var commodityCode: String? = null

        public fun build(): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214 =
            InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214(
                commodityCode = commodityCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214 must be a JSON object",
                    )
            return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214(
                commodityCode = rawObject["commodity_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.commodityCode?.let { put("commodity_code", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214(
    block: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214.Builder.() -> Unit,
): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214 =
    InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214.build(block)
