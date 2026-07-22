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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/shipping_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/shipping_details
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693.Serializer::class)
public class InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693(
    public val address: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsAddressXa4476aa1? = null,
    public val name: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var address: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsAddressXa4476aa1? =
            null

        public var name: String? = null

        public var phone: String? = null

        public fun build(): InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693 =
            InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693(
                address = address,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693 must be a JSON object",
                    )
            return InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693(
                address =
                    rawObject["address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsAddressXa4476aa1>(
                                it,
                            )
                    },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.address?.let { put("address", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", it) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693(
    block: InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693.Builder.() -> Unit,
): InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693 =
    InlineV1RadarPaymentEvaluacd5dPostRequestFormShippingDetailsX154c0693.build(block)
