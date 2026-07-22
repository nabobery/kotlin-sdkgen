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
 * -urlencoded/schema/properties/payment_details/properties/payment_method_details/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/payment_method_details/properties/billing_details
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e.Serializer::class)
public class InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e(
    public val address: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsAddressX1d1022ab? = null,
    public val email: String? = null,
    public val name: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var address: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsAddressX1d1022ab? =
            null

        public var email: String? = null

        public var name: String? = null

        public var phone: String? = null

        public fun build(): InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e =
            InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e(
                address = address,
                email = email,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e must be a JSON object",
                    )
            return InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e(
                address =
                    rawObject["address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsAddressX1d1022ab>(
                                it,
                            )
                    },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.address?.let { put("address", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", it) }
                    value.name?.let { put("name", it) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e(
    block: InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e.Builder.() -> Unit,
): InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e =
    InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e.build(block)
