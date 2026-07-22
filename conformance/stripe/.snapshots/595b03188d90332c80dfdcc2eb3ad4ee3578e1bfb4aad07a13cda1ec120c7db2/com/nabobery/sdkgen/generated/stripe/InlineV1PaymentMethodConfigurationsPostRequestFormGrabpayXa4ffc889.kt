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
 * GrabPay is a payment method developed by [Grab](https://www.grab.com/sg/consumer/finance/pay/). GrabPay is a digital
 * wallet - customers maintain a balance in their wallets that they pay out with. Check this
 * [page](https://docs.stripe.com/payments/grabpay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/grabpay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormGrabpayDisplayPreferenceXbf94a739? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormGrabpayDisplayPreferenceXbf94a739? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889 =
            InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormGrabpayDisplayPreferenceXbf94a739>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889 =
    InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889.build(block)
