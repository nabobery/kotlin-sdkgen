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
 * lication~1x-www-form-urlencoded/schema/properties/link/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/link/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb(
    public val preference: InlineV1PaymentMethodConfidc49PostRequestFormLinkPreferenceXda19d345? = null,
) {
    public class Builder {
        public var preference: InlineV1PaymentMethodConfidc49PostRequestFormLinkPreferenceXda19d345? =
            null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb =
            InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb(
                preference = preference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb(
                preference =
                    rawObject["preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormLinkPreferenceXda19d345>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb =
    InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX0b2269eb.build(block)
