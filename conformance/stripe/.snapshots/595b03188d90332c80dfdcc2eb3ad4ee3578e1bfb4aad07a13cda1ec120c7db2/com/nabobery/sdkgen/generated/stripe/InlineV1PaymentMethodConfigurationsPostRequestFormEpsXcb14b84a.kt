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
 * EPS is an Austria-based payment method that allows customers to complete transactions online using their bank
 * credentials. EPS is supported by all Austrian banks and is accepted by over 80% of Austrian online retailers. Check
 * this [page](https://docs.stripe.com/payments/eps) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/eps
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a(
    public val displayPreference: InlineV1PaymentMethodConfigurationsPostRequestFormEpsDisplayPreferenceXf7412289? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfigurationsPostRequestFormEpsDisplayPreferenceXf7412289? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a =
            InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormEpsDisplayPreferenceXf7412289>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a =
    InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a.build(block)
