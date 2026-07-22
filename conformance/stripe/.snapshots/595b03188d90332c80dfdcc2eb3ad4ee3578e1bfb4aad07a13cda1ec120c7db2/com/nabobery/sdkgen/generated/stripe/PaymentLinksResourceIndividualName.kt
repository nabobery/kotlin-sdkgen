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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_individual_name
 */
@Serializable(with = PaymentLinksResourceIndividualName.Serializer::class)
public class PaymentLinksResourceIndividualName(
    /**
     * Indicates whether individual name collection is enabled for the payment link.
     */
    public val enabled: Boolean,
    /**
     * Whether the customer is required to complete the field before checking out. Defaults to `false`.
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

        public fun build(): PaymentLinksResourceIndividualName {
            check(enabledValue != null) { "enabled is required" }
            check(optionalValue != null) { "optional is required" }
            return PaymentLinksResourceIndividualName(
                enabled = enabled,
                optional = optional,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentLinksResourceIndividualName = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentLinksResourceIndividualName> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentLinksResourceIndividualName {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceIndividualName")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentLinksResourceIndividualName must be a JSON object")
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            val optional = json.decodeRequired<Boolean>(rawObject, "optional")
            return PaymentLinksResourceIndividualName(
                enabled = enabled,
                optional = optional,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentLinksResourceIndividualName,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceIndividualName")
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

public fun paymentLinksResourceIndividualName(
    block: PaymentLinksResourceIndividualName.Builder.() -> Unit,
): PaymentLinksResourceIndividualName = PaymentLinksResourceIndividualName.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentLinksResourceIndividualName is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
