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
 * Unified Payment Interface (UPI) is India's leading payment method with exponential growth since it launched in 2016.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/upi
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e(
    public val displayPreference: InlineV1PaymentMethodConfigurationsPostRequestFormUpiDisplayPreferenceX346c8730? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfigurationsPostRequestFormUpiDisplayPreferenceX346c8730? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e =
            InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormUpiDisplayPreferenceX346c8730>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e",
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

public fun inlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e =
    InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e.build(block)
