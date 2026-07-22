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
 * Alipay is a digital wallet in China that has more than a billion active users worldwide. Alipay users can pay on the
 * web or on a mobile device using login credentials or their Alipay app. Alipay has a low dispute rate and reduces
 * fraud by authenticating payments using the customer's login credentials. Check this
 * [page](https://docs.stripe.com/payments/alipay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/alipay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormAlipayDisplayPreferenceXc78a4ac6? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormAlipayDisplayPreferenceXc78a4ac6? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff =
            InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAlipayDisplayPreferenceXc78a4ac6>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff =
    InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff.build(block)
