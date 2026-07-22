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
 * [Affirm](https://www.affirm.com/) gives your customers a way to split purchases over a series of payments. Depending
 * on the purchase, they can pay with four interest-free payments (Split Pay) or pay over a longer term (Installments),
 * which might include interest. Check this [page](https://docs.stripe.com/payments/affirm) for more details like
 * country availability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/affirm
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormAffirmDisplayPreferenceXb99d8217? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormAffirmDisplayPreferenceXb99d8217? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08 =
            InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAffirmDisplayPreferenceXb99d8217>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08 =
    InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXc4c91e08.build(block)
