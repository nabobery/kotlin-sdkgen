package com.nabobery.sdkgen.generated.stripe

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
public data class BillingBillResourceInvoicingLinesParentsInvoiceLineItemParentView(
  @SerialName("invoice_item_details")
  public val invoiceItemDetails: InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9? = null,
  @SerialName("subscription_item_details")
  public val subscriptionItemDetails:
      InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48? = null,
  public val type: InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_pare
 * nt
 */
@Serializable(with = BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent.Serializer::class)
public class BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent(
  /**
   * The type of parent that generated this line item
   */
  public val type: InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03,
  /**
   * Details about the invoice item that generated this line item
   */
  public val invoiceItemDetails: InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9? = null,
  /**
   * Details about the subscription item that generated this line item
   */
  public val subscriptionItemDetails:
      InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48? = null,
) {
  public class Builder {
    private var typeValue:
        InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03? = null

    public var type:
        InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Details about the invoice item that generated this line item
     */
    public var invoiceItemDetails: InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9? = null

    /**
     * Details about the subscription item that generated this line item
     */
    public var subscriptionItemDetails:
        InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48? = null

    public fun build(): BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent {
      check(typeValue != null) { "type is required" }
      return BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent(
        type = type,
        invoiceItemDetails = invoiceItemDetails,
        subscriptionItemDetails = subscriptionItemDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent must be a JSON object")
      val type = json.decodeRequired<InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03>(rawObject, "type")
      return BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent(
        type = type,
        invoiceItemDetails = rawObject["invoice_item_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceId011InvoiceItemDetailsX9fadf1d9?>(element) },
        subscriptionItemDetails = rawObject["subscription_item_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingBillResourceId011SubscriptionItemDetailsXc7f77d48?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.invoiceItemDetails?.let { put("invoice_item_details", json.encodeToJsonElement(it)) }
        value.subscriptionItemDetails?.let { put("subscription_item_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingLinesParentsInvoiceLineItemParent(block: BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent.Builder.() -> Unit): BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent = BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
