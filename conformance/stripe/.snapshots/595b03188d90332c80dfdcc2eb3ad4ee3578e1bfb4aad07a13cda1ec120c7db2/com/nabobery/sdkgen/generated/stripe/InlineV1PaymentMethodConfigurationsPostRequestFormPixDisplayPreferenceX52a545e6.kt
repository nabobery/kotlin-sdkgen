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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/pix/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/pix/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6(
    public val preference: InlineV1PaymentMethodConfidc49PostRequestFormPixPreferenceX677b2c88? = null,
) {
    public class Builder {
        public var preference: InlineV1PaymentMethodConfidc49PostRequestFormPixPreferenceX677b2c88? =
            null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6 =
            InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6(
                preference = preference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6(
                preference =
                    rawObject["preference"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPixPreferenceX677b2c88>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6 =
    InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6.build(block)
