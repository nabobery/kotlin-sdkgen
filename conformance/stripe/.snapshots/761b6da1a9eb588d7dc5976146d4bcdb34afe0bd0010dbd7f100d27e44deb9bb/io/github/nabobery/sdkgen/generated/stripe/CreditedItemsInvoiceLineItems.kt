package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credited_items_invoice_line_items
 */
@Serializable(with = CreditedItemsInvoiceLineItems.Serializer::class)
public class CreditedItemsInvoiceLineItems(
  /**
   * The invoice id for the debited line item(s).
   */
  public val invoice: String,
  invoiceLineItems: List<String>,
) {
  /**
   * IDs of the debited invoice line item(s) on the invoice that correspond to the credit proration.
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
      get() = requireNotNull(invoiceLineItemsValue) { "invoiceLineItems is required" }.toList()
      set(`value`) {
        invoiceLineItemsValue = value.toList()
      }

    public fun build(): CreditedItemsInvoiceLineItems {
      check(invoiceValue != null) { "invoice is required" }
      check(invoiceLineItemsValue != null) { "invoiceLineItems is required" }
      return CreditedItemsInvoiceLineItems(
        invoice = invoice,
        invoiceLineItems = invoiceLineItems,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreditedItemsInvoiceLineItems = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreditedItemsInvoiceLineItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreditedItemsInvoiceLineItems {
      val jsonDecoder = decoder.requireJsonDecoder("CreditedItemsInvoiceLineItems")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreditedItemsInvoiceLineItems must be a JSON object")
      val invoice = json.decodeRequired<String>(rawObject, "invoice")
      val invoiceLineItems = json.decodeRequired<List<String>>(rawObject, "invoice_line_items")
      return CreditedItemsInvoiceLineItems(
        invoice = invoice,
        invoiceLineItems = invoiceLineItems,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreditedItemsInvoiceLineItems) {
      val jsonEncoder = encoder.requireJsonEncoder("CreditedItemsInvoiceLineItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("invoice", value.invoice)
        put("invoice_line_items", json.encodeToJsonElement(value.invoiceLineItems))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun creditedItemsInvoiceLineItems(block: CreditedItemsInvoiceLineItems.Builder.() -> Unit): CreditedItemsInvoiceLineItems = CreditedItemsInvoiceLineItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreditedItemsInvoiceLineItems is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
