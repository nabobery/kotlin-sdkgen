package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_config_resource_payment_method_properties
 */
@Serializable(with = PaymentMethodConfigResourcePaymentMethodProperties.Serializer::class)
public class PaymentMethodConfigResourcePaymentMethodProperties(
    /**
     * Whether this payment method may be offered at checkout. True if `display_preference` is `on` and the payment
     * method's capability is active.
     */
    public val available: Boolean,
    public val displayPreference: PaymentMethodConfigResourceDisplayPreference,
) {
    public class Builder {
        private var availableValue: Boolean? = null

        public var available: Boolean
            get() = requireNotNull(availableValue) { "available is required" }
            set(`value`) {
                availableValue = value
            }

        private var displayPreferenceValue: PaymentMethodConfigResourceDisplayPreference? = null

        public var displayPreference: PaymentMethodConfigResourceDisplayPreference
            get() = requireNotNull(displayPreferenceValue) { "displayPreference is required" }
            set(`value`) {
                displayPreferenceValue = value
            }

        public fun build(): PaymentMethodConfigResourcePaymentMethodProperties {
            check(availableValue != null) { "available is required" }
            check(displayPreferenceValue != null) { "displayPreference is required" }
            return PaymentMethodConfigResourcePaymentMethodProperties(
                available = available,
                displayPreference = displayPreference,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodConfigResourcePaymentMethodProperties =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodConfigResourcePaymentMethodProperties> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodConfigResourcePaymentMethodProperties {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodConfigResourcePaymentMethodProperties")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentMethodConfigResourcePaymentMethodProperties must be a JSON object",
                    )
            val available = json.decodeRequired<Boolean>(rawObject, "available")
            val displayPreference =
                json.decodeRequired<PaymentMethodConfigResourceDisplayPreference>(
                    rawObject,
                    "display_preference",
                )
            return PaymentMethodConfigResourcePaymentMethodProperties(
                available = available,
                displayPreference = displayPreference,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodConfigResourcePaymentMethodProperties,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodConfigResourcePaymentMethodProperties")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("available", json.encodeToJsonElement(value.available))
                    put("display_preference", json.encodeToJsonElement(value.displayPreference))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodConfigResourcePaymentMethodProperties(
    block: PaymentMethodConfigResourcePaymentMethodProperties.Builder.() -> Unit,
): PaymentMethodConfigResourcePaymentMethodProperties = PaymentMethodConfigResourcePaymentMethodProperties.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentMethodConfigResourcePaymentMethodProperties is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
