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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/oxxo/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/oxxo/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a(
    public val preference: InlineV1PaymentMethodConfidc49PostRequestFormOxxoPreferenceXa86f3a3b? = null,
) {
    public class Builder {
        public var preference: InlineV1PaymentMethodConfidc49PostRequestFormOxxoPreferenceXa86f3a3b? =
            null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a =
            InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a(
                preference = preference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a(
                preference =
                    rawObject["preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormOxxoPreferenceXa86f3a3b>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a =
    InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a.build(block)
