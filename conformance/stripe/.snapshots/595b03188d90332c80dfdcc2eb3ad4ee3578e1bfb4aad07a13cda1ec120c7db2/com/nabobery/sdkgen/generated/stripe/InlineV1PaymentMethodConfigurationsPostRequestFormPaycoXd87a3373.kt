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
 * PAYCO is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet available in South Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payco
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373(
    public val displayPreference: InlineV1PaymentMethodConfidc49PostRequestFormPaycoDisplayPreferenceXd69e7046? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfidc49PostRequestFormPaycoDisplayPreferenceXd69e7046? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373 =
            InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPaycoDisplayPreferenceXd69e7046>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373 =
    InlineV1PaymentMethodConfigurationsPostRequestFormPaycoXd87a3373.build(block)
