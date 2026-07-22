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
 * Klarna gives customers a range of [payment options](https://docs.stripe.com/payments/klarna#payment-options) during
 * checkout. Available payment options vary depending on the customer's billing address and the transaction amount.
 * These payment options make it convenient for customers to purchase items in all price ranges. Check this
 * [page](https://docs.stripe.com/payments/klarna) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/klarna
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormKlarnaDisplayPreferenceX872735f7? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormKlarnaDisplayPreferenceX872735f7? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0 =
            InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormKlarnaDisplayPreferenceX872735f7>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0 =
    InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX5689f9f0.build(block)
