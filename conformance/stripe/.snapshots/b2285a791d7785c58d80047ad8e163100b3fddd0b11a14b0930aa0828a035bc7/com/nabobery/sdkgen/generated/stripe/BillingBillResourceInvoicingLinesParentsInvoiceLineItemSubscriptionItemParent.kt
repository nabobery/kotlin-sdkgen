package com.nabobery.sdkgen.generated.stripe

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
public data class BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParentView(
  @SerialName("invoice_item")
  public val invoiceItem: String? = null,
  public val proration: Boolean,
  @SerialName("proration_details")
  public val prorationDetails: InlineBillingBillResourceIe69bProrationDetailsX714c269c? = null,
  public val subscription: String? = null,
  @SerialName("subscription_item")
  public val subscriptionItem: String,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_subs
 * cription_item_parent
 */
@Serializable(with = BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent.Serializer::class)
public class BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent(
  /**
   * Whether this is a proration
   */
  public val proration: Boolean,
  /**
   * The subscription item that generated this line item
   */
  public val subscriptionItem: String,
  /**
   * The invoice item that generated this line item
   */
  public val invoiceItem: String? = null,
  /**
   * Additional details for proration line items
   */
  public val prorationDetails: InlineBillingBillResourceIe69bProrationDetailsX714c269c? = null,
  /**
   * The subscription that the subscription item belongs to
   */
  public val subscription: String? = null,
) {
  public class Builder {
    private var prorationValue: Boolean? = null

    public var proration: Boolean
      get() = requireNotNull(prorationValue) { "proration is required" }
      set(`value`) {
        prorationValue = value
      }

    private var subscriptionItemValue: String? = null

    public var subscriptionItem: String
      get() = requireNotNull(subscriptionItemValue) { "subscriptionItem is required" }
      set(`value`) {
        subscriptionItemValue = value
      }

    /**
     * The invoice item that generated this line item
     */
    public var invoiceItem: String? = null

    /**
     * Additional details for proration line items
     */
    public var prorationDetails: InlineBillingBillResourceIe69bProrationDetailsX714c269c? = null

    /**
     * The subscription that the subscription item belongs to
     */
    public var subscription: String? = null

    public fun build(): BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent {
      check(prorationValue != null) { "proration is required" }
      check(subscriptionItemValue != null) { "subscriptionItem is required" }
      return BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent(
        proration = proration,
        subscriptionItem = subscriptionItem,
        invoiceItem = invoiceItem,
        prorationDetails = prorationDetails,
        subscription = subscription,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent must be a JSON object")
      val proration = json.decodeRequired<Boolean>(rawObject, "proration")
      val subscriptionItem = json.decodeRequired<String>(rawObject, "subscription_item")
      return BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent(
        proration = proration,
        subscriptionItem = subscriptionItem,
        invoiceItem = rawObject["invoice_item"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        prorationDetails = rawObject["proration_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceIe69bProrationDetailsX714c269c?>(element) },
        subscription = rawObject["subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("proration", json.encodeToJsonElement(value.proration))
        put("subscription_item", value.subscriptionItem)
        value.invoiceItem?.let { put("invoice_item", it) }
        value.prorationDetails?.let { put("proration_details", json.encodeToJsonElement(it)) }
        value.subscription?.let { put("subscription", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent(block: BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent.Builder.() -> Unit): BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent = BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoicingLinesParentsInvoiceLineItemSubscriptionItemParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
