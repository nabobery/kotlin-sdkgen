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
 * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil. Check this
 * [page](https://docs.stripe.com/payments/boleto) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/boleto
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormBoletoDisplayPreferenceX8bf0fe24? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormBoletoDisplayPreferenceX8bf0fe24? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225 =
            InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBoletoDisplayPreferenceX8bf0fe24>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225 =
    InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225.build(block)
