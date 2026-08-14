package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class InvoiceItemProrationCreditedItemsView(
  @SerialName("invoice_item")
  public val invoiceItem: String? = null,
  @SerialName("invoice_line_item_details")
  public val invoiceLineItemDetails: CreditedItemsInvoiceLineItems? = null,
  public val type: InlineInvoiceItemProrationCreditedItemsTypeX816d14e0,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_item_proration_credited_items
 */
@Serializable(with = InvoiceItemProrationCreditedItems.Serializer::class)
public class InvoiceItemProrationCreditedItems(
  /**
   * Whether the credit references a pending invoice item or one or more invoice line items on an invoice.
   */
  public val type: InlineInvoiceItemProrationCreditedItemsTypeX816d14e0,
  /**
   * When `type` is `invoice_item`, the invoice item id for the debited invoice item corresponding to this credit
   * proration.
   */
  public val invoiceItem: String? = null,
  public val invoiceLineItemDetails: CreditedItemsInvoiceLineItems? = null,
) {
  public class Builder {
    private var typeValue: InlineInvoiceItemProrationCreditedItemsTypeX816d14e0? = null

    public var type: InlineInvoiceItemProrationCreditedItemsTypeX816d14e0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * When `type` is `invoice_item`, the invoice item id for the debited invoice item corresponding to this credit
     * proration.
     */
    public var invoiceItem: String? = null

    public var invoiceLineItemDetails: CreditedItemsInvoiceLineItems? = null

    public fun build(): InvoiceItemProrationCreditedItems {
      check(typeValue != null) { "type is required" }
      return InvoiceItemProrationCreditedItems(
        type = type,
        invoiceItem = invoiceItem,
        invoiceLineItemDetails = invoiceLineItemDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceItemProrationCreditedItems = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoiceItemProrationCreditedItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceItemProrationCreditedItems {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceItemProrationCreditedItems")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceItemProrationCreditedItems must be a JSON object")
      val type = json.decodeRequired<InlineInvoiceItemProrationCreditedItemsTypeX816d14e0>(rawObject, "type")
      return InvoiceItemProrationCreditedItems(
        type = type,
        invoiceItem = rawObject["invoice_item"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceLineItemDetails = rawObject["invoice_line_item_details"]?.let { json.decodeFromJsonElement<CreditedItemsInvoiceLineItems>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceItemProrationCreditedItems) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceItemProrationCreditedItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.invoiceItem?.let { put("invoice_item", it) }
        value.invoiceLineItemDetails?.let { put("invoice_line_item_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceItemProrationCreditedItems(block: InvoiceItemProrationCreditedItems.Builder.() -> Unit): InvoiceItemProrationCreditedItems = InvoiceItemProrationCreditedItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoiceItemProrationCreditedItems is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
