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
 * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method. Revolut Pay uses the
 * customer’s stored balance or cards to fund the payment, and offers the option for non-Revolut customers to save their
 * details after their first purchase.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/revolut_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX5ae739b3? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX5ae739b3? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf =
            InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX5ae739b3>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf =
    InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX0ec08ecf.build(block)
