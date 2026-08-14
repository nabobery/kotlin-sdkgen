package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParentView(
  @SerialName("invoice_item")
  public val invoiceItem: String,
  public val proration: Boolean,
  @SerialName("proration_details")
  public val prorationDetails: InlineBillingBillResourceI03fcProrationDetailsX7d0edd12? = null,
  public val subscription: String? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_invo
 * ice_item_parent
 */
@Serializable(with = BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent.Serializer::class)
public class BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent(
  /**
   * The invoice item that generated this line item
   */
  public val invoiceItem: String,
  /**
   * Whether this is a proration
   */
  public val proration: Boolean,
  /**
   * Additional details for proration line items
   */
  public val prorationDetails: InlineBillingBillResourceI03fcProrationDetailsX7d0edd12? = null,
  /**
   * The subscription that the invoice item belongs to
   */
  public val subscription: String? = null,
) {
  public class Builder {
    private var invoiceItemValue: String? = null

    public var invoiceItem: String
      get() = requireNotNull(invoiceItemValue) { "invoiceItem is required" }
      set(`value`) {
        invoiceItemValue = value
      }

    private var prorationValue: Boolean? = null

    public var proration: Boolean
      get() = requireNotNull(prorationValue) { "proration is required" }
      set(`value`) {
        prorationValue = value
      }

    /**
     * Additional details for proration line items
     */
    public var prorationDetails: InlineBillingBillResourceI03fcProrationDetailsX7d0edd12? = null

    /**
     * The subscription that the invoice item belongs to
     */
    public var subscription: String? = null

    public fun build(): BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent {
      check(invoiceItemValue != null) { "invoiceItem is required" }
      check(prorationValue != null) { "proration is required" }
      return BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent(
        invoiceItem = invoiceItem,
        proration = proration,
        prorationDetails = prorationDetails,
        subscription = subscription,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent must be a JSON object")
      val invoiceItem = json.decodeRequired<String>(rawObject, "invoice_item")
      val proration = json.decodeRequired<Boolean>(rawObject, "proration")
      return BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent(
        invoiceItem = invoiceItem,
        proration = proration,
        prorationDetails = rawObject["proration_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceI03fcProrationDetailsX7d0edd12?>(element) },
        subscription = rawObject["subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("invoice_item", value.invoiceItem)
        put("proration", json.encodeToJsonElement(value.proration))
        value.prorationDetails?.let { put("proration_details", json.encodeToJsonElement(it)) }
        value.subscription?.let { put("subscription", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent(block: BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent.Builder.() -> Unit): BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent = BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoicingLinesParentsInvoiceLineItemInvoiceItemParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
