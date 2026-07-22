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
import kotlin.collections.List

@Serializable
public data class BillingBillResourceInvoicingLinesCommonCreditedItemsView(
    public val invoice: String,
    @SerialName("invoice_line_items")
    public val invoiceLineItems: List<String>,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_common_credited_items
 */
@Serializable(with = BillingBillResourceInvoicingLinesCommonCreditedItems.Serializer::class)
public class BillingBillResourceInvoicingLinesCommonCreditedItems(
    /**
     * Invoice containing the credited invoice line items
     */
    public val invoice: String,
    invoiceLineItems: List<String>,
) {
    /**
     * Credited invoice line items
     */
    public val invoiceLineItems: List<String> = invoiceLineItems.toList()

    public class Builder {
        private var invoiceValue: String? = null

        public var invoice: String
            get() = requireNotNull(invoiceValue) { "invoice is required" }
            set(`value`) {
                invoiceValue = value
            }

        private var invoiceLineItemsValue: List<String>? = null

        public var invoiceLineItems: List<String>
            get() = requireNotNull(invoiceLineItemsValue) { "invoiceLineItems is required" }
            set(`value`) {
                invoiceLineItemsValue = value
            }

        public fun build(): BillingBillResourceInvoicingLinesCommonCreditedItems {
            check(invoiceValue != null) { "invoice is required" }
            check(invoiceLineItemsValue != null) { "invoiceLineItems is required" }
            return BillingBillResourceInvoicingLinesCommonCreditedItems(
                invoice = invoice,
                invoiceLineItems = invoiceLineItems,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingLinesCommonCreditedItems =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingBillResourceInvoicingLinesCommonCreditedItems> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingLinesCommonCreditedItems {
            val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingLinesCommonCreditedItems")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "BillingBillResourceInvoicingLinesCommonCreditedItems must be a JSON object",
                    )
            val invoice = json.decodeRequired<String>(rawObject, "invoice")
            val invoiceLineItems = json.decodeRequired<List<String>>(rawObject, "invoice_line_items")
            return BillingBillResourceInvoicingLinesCommonCreditedItems(
                invoice = invoice,
                invoiceLineItems = invoiceLineItems,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingBillResourceInvoicingLinesCommonCreditedItems,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingLinesCommonCreditedItems")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("invoice", value.invoice)
                    put("invoice_line_items", json.encodeToJsonElement(value.invoiceLineItems))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingBillResourceInvoicingLinesCommonCreditedItems(
    block: BillingBillResourceInvoicingLinesCommonCreditedItems.Builder.() -> Unit,
): BillingBillResourceInvoicingLinesCommonCreditedItems =
    BillingBillResourceInvoicingLinesCommonCreditedItems.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingBillResourceInvoicingLinesCommonCreditedItems is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
