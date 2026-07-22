package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
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
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_payment_method_update
 */
@Serializable(with = PortalPaymentMethodUpdate.Serializer::class)
public class PortalPaymentMethodUpdate(
    /**
     * Whether the feature is enabled.
     */
    public val enabled: Boolean,
    /**
     * The [Payment Method Configuration](/api/payment_method_configurations) to use for this portal session. When
     * specified, customers will be able to update their payment method to one of the options specified by the payment
     * method configuration. If not set, the default payment method configuration is used.
     */
    public val paymentMethodConfiguration: String? = null,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        /**
         * The [Payment Method Configuration](/api/payment_method_configurations) to use for this portal session. When
         * specified, customers will be able to update their payment method to one of the options specified by the payment
         * method configuration. If not set, the default payment method configuration is used.
         */
        public var paymentMethodConfiguration: String? = null

        public fun build(): PortalPaymentMethodUpdate {
            check(enabledValue != null) { "enabled is required" }
            return PortalPaymentMethodUpdate(
                enabled = enabled,
                paymentMethodConfiguration = paymentMethodConfiguration,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PortalPaymentMethodUpdate = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PortalPaymentMethodUpdate> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PortalPaymentMethodUpdate {
            val jsonDecoder = decoder.requireJsonDecoder("PortalPaymentMethodUpdate")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PortalPaymentMethodUpdate must be a JSON object")
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            return PortalPaymentMethodUpdate(
                enabled = enabled,
                paymentMethodConfiguration =
                    rawObject["payment_method_configuration"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PortalPaymentMethodUpdate,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PortalPaymentMethodUpdate")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    value.paymentMethodConfiguration?.let { put("payment_method_configuration", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun portalPaymentMethodUpdate(block: PortalPaymentMethodUpdate.Builder.() -> Unit): PortalPaymentMethodUpdate =
    PortalPaymentMethodUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("PortalPaymentMethodUpdate is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
