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
 * JCB is a credit card company based in Japan. JCB is currently available in Japan to businesses approved by JCB, and
 * available to all businesses in Australia, Canada, Hong Kong, Japan, New Zealand, Singapore, Switzerland, United
 * Kingdom, United States, and all countries in the European Economic Area except Iceland. Check this
 * [page](https://support.stripe.com/questions/accepting-japan-credit-bureau-%28jcb%29-payments) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/jcb
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92(
    public val displayPreference: InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92 =
            InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92 =
    InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92.build(block)
