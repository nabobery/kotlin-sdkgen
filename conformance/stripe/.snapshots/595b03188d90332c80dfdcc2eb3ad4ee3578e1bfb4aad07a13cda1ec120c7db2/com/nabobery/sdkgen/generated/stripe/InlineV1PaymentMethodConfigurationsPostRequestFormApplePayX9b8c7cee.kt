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
 * Stripe users can accept [Apple Pay](https://stripe.com/payments/apple-pay) in iOS applications in iOS 9 and later,
 * and on the web in Safari starting with iOS 10 or macOS Sierra. There are no additional fees to process Apple Pay
 * payments, and the [pricing](https://stripe.com/pricing) is the same as other card transactions. Check this
 * [page](https://docs.stripe.com/apple-pay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/apple_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormApplePayDisplayPreferenceXfaa85a56? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormApplePayDisplayPreferenceXfaa85a56? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee =
            InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormApplePayDisplayPreferenceXfaa85a56>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee =
    InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX9b8c7cee.build(block)
