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
 * [Link](https://docs.stripe.com/payments/link) is a payment method network. With Link, users save their payment
 * details once, then reuse that information to pay with one click for any business on the network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/link
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb(
    public val displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb =
            InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb =
    InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb.build(block)
