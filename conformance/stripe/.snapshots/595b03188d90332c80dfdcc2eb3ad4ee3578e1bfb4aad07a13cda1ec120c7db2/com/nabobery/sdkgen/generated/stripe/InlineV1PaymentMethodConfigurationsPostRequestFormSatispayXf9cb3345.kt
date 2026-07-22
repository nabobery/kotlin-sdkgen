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
import kotlin.Unit

/**
 * Satispay is a [single-use](/payments/payment-methods#usage) payment method where customers are required to
 * [authenticate](/payments/payment-methods#customer-actions) their payment. Customers pay by being redirected from your
 * website or app, authorizing the payment with Satispay, then returning to your website or app. You get [immediate
 * notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or failed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/satispay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormSatispayDisplayPreferenceXe77c13eb? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormSatispayDisplayPreferenceXe77c13eb? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345 =
            InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSatispayDisplayPreferenceXe77c13eb>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345 =
    InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345.build(block)
