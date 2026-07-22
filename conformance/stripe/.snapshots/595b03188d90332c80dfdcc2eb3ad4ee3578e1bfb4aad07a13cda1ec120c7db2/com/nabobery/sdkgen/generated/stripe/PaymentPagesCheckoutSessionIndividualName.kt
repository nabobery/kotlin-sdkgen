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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_individual_name
 */
@Serializable(with = PaymentPagesCheckoutSessionIndividualName.Serializer::class)
public class PaymentPagesCheckoutSessionIndividualName(
    /**
     * Indicates whether individual name collection is enabled for the session
     */
    public val enabled: Boolean,
    /**
     * Whether the customer is required to complete the field before completing the Checkout Session. Defaults to `false`.
     */
    public val optional: Boolean,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        private var optionalValue: Boolean? = null

        public var optional: Boolean
            get() = requireNotNull(optionalValue) { "optional is required" }
            set(`value`) {
                optionalValue = value
            }

        public fun build(): PaymentPagesCheckoutSessionIndividualName {
            check(enabledValue != null) { "enabled is required" }
            check(optionalValue != null) { "optional is required" }
            return PaymentPagesCheckoutSessionIndividualName(
                enabled = enabled,
                optional = optional,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionIndividualName =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionIndividualName> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionIndividualName {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionIndividualName")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentPagesCheckoutSessionIndividualName must be a JSON object")
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            val optional = json.decodeRequired<Boolean>(rawObject, "optional")
            return PaymentPagesCheckoutSessionIndividualName(
                enabled = enabled,
                optional = optional,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionIndividualName,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionIndividualName")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    put("optional", json.encodeToJsonElement(value.optional))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentPagesCheckoutSessionIndividualName(
    block: PaymentPagesCheckoutSessionIndividualName.Builder.() -> Unit,
): PaymentPagesCheckoutSessionIndividualName = PaymentPagesCheckoutSessionIndividualName.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentPagesCheckoutSessionIndividualName is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
