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
 * PromptPay is a Thailand-based payment method that allows customers to make a payment using their preferred app from
 * participating banks. Check this [page](https://docs.stripe.com/payments/promptpay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/promptpay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11(
    public val displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPromptpayDisplayPreferenceX75e3e155? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormPromptpayDisplayPreferenceX75e3e155? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11 =
            InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPromptpayDisplayPreferenceX75e3e155>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11 =
    InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11.build(block)
