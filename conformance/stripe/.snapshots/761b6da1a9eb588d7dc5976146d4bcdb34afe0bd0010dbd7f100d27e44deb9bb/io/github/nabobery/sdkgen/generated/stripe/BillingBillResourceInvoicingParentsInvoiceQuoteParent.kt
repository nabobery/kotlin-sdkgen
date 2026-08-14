package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

@Serializable
public data class BillingBillResourceInvoicingParentsInvoiceQuoteParentView(
  public val quote: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_parents_invoice_quote_parent
 */
@Serializable(with = BillingBillResourceInvoicingParentsInvoiceQuoteParent.Serializer::class)
public class BillingBillResourceInvoicingParentsInvoiceQuoteParent(
  /**
   * The quote that generated this invoice
   */
  public val quote: String,
) {
  public class Builder {
    private var quoteValue: String? = null

    public var quote: String
      get() = requireNotNull(quoteValue) { "quote is required" }
      set(`value`) {
        quoteValue = value
      }

    public fun build(): BillingBillResourceInvoicingParentsInvoiceQuoteParent {
      check(quoteValue != null) { "quote is required" }
      return BillingBillResourceInvoicingParentsInvoiceQuoteParent(
        quote = quote,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingParentsInvoiceQuoteParent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingBillResourceInvoicingParentsInvoiceQuoteParent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingParentsInvoiceQuoteParent {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingParentsInvoiceQuoteParent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingParentsInvoiceQuoteParent must be a JSON object")
      val quote = json.decodeRequired<String>(rawObject, "quote")
      return BillingBillResourceInvoicingParentsInvoiceQuoteParent(
        quote = quote,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingParentsInvoiceQuoteParent) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingParentsInvoiceQuoteParent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("quote", value.quote)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingParentsInvoiceQuoteParent(block: BillingBillResourceInvoicingParentsInvoiceQuoteParent.Builder.() -> Unit): BillingBillResourceInvoicingParentsInvoiceQuoteParent = BillingBillResourceInvoicingParentsInvoiceQuoteParent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoicingParentsInvoiceQuoteParent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
