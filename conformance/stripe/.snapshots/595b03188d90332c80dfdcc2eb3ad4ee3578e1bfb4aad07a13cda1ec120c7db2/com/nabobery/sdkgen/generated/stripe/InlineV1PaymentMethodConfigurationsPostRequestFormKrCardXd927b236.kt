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
 * Korean cards let users pay using locally issued cards from South Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/kr_card
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormKrCardDisplayPreferenceXee500429? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormKrCardDisplayPreferenceXee500429? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236 =
            InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormKrCardDisplayPreferenceXee500429>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236 =
    InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd927b236.build(block)
