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
import kotlin.String
import kotlin.Unit

@Serializable
public data class BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoidedView(
    public val invoice: InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e,
    @SerialName("invoice_line_item")
    public val invoiceLineItem: String,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_credits_application_invoice_v
 * oided
 */
@Serializable(with = BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided.Serializer::class)
public class BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided(
    /**
     * The invoice to which the reinstated billing credits were originally applied.
     */
    public val invoice: InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e,
    /**
     * The invoice line item to which the reinstated billing credits were originally applied.
     */
    public val invoiceLineItem: String,
) {
    public class Builder {
        private var invoiceValue: InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e? = null

        public var invoice: InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e
            get() = requireNotNull(invoiceValue) { "invoice is required" }
            set(`value`) {
                invoiceValue = value
            }

        private var invoiceLineItemValue: String? = null

        public var invoiceLineItem: String
            get() = requireNotNull(invoiceLineItemValue) { "invoiceLineItem is required" }
            set(`value`) {
                invoiceLineItemValue = value
            }

        public fun build(): BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided {
            check(invoiceValue != null) { "invoice is required" }
            check(invoiceLineItemValue != null) { "invoiceLineItem is required" }
            return BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided(
                invoice = invoice,
                invoiceLineItem = invoiceLineItem,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided must be a JSON object",
                    )
            val invoice = json.decodeRequired<InlineBillingCreditGrantsR0bf5InvoiceX20ca8d3e>(rawObject, "invoice")
            val invoiceLineItem = json.decodeRequired<String>(rawObject, "invoice_line_item")
            return BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided(
                invoice = invoice,
                invoiceLineItem = invoiceLineItem,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("invoice", json.encodeToJsonElement(value.invoice))
                    put("invoice_line_item", value.invoiceLineItem)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided(
    block: BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided.Builder.() -> Unit,
): BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided =
    BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
