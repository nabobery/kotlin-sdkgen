package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentPagesCheckoutSessionInvoiceCreationView(
    public val enabled: Boolean,
    @SerialName("invoice_data")
    public val invoiceData: PaymentPagesCheckoutSessionInvoiceSettings,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_invoice_creation
 */
@Serializable(with = PaymentPagesCheckoutSessionInvoiceCreation.Serializer::class)
public class PaymentPagesCheckoutSessionInvoiceCreation(
    /**
     * Indicates whether invoice creation is enabled for the Checkout Session.
     */
    public val enabled: Boolean,
    public val invoiceData: PaymentPagesCheckoutSessionInvoiceSettings,
) {
    public class Builder {
        private var enabledValue: Boolean? = null

        public var enabled: Boolean
            get() = requireNotNull(enabledValue) { "enabled is required" }
            set(`value`) {
                enabledValue = value
            }

        private var invoiceDataValue: PaymentPagesCheckoutSessionInvoiceSettings? = null

        public var invoiceData: PaymentPagesCheckoutSessionInvoiceSettings
            get() = requireNotNull(invoiceDataValue) { "invoiceData is required" }
            set(`value`) {
                invoiceDataValue = value
            }

        public fun build(): PaymentPagesCheckoutSessionInvoiceCreation {
            check(enabledValue != null) { "enabled is required" }
            check(invoiceDataValue != null) { "invoiceData is required" }
            return PaymentPagesCheckoutSessionInvoiceCreation(
                enabled = enabled,
                invoiceData = invoiceData,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionInvoiceCreation =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionInvoiceCreation> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionInvoiceCreation {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionInvoiceCreation")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentPagesCheckoutSessionInvoiceCreation must be a JSON object")
            val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
            val invoiceData = json.decodeRequired<PaymentPagesCheckoutSessionInvoiceSettings>(rawObject, "invoice_data")
            return PaymentPagesCheckoutSessionInvoiceCreation(
                enabled = enabled,
                invoiceData = invoiceData,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionInvoiceCreation,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionInvoiceCreation")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enabled", json.encodeToJsonElement(value.enabled))
                    put("invoice_data", json.encodeToJsonElement(value.invoiceData))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentPagesCheckoutSessionInvoiceCreation(
    block: PaymentPagesCheckoutSessionInvoiceCreation.Builder.() -> Unit,
): PaymentPagesCheckoutSessionInvoiceCreation = PaymentPagesCheckoutSessionInvoiceCreation.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentPagesCheckoutSessionInvoiceCreation is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
