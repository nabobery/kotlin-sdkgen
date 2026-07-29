package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_upfront
 */
@Serializable(with = QuotesResourceUpfront.Serializer::class)
public class QuotesResourceUpfront(
  /**
   * Total before any discounts or taxes are applied.
   */
  public val amountSubtotal: Int,
  /**
   * Total after discounts and taxes are applied.
   */
  public val amountTotal: Int,
  public val totalDetails: QuotesResourceTotalDetails,
  /**
   * The line items that will appear on the next invoice after this quote is accepted. This does not include pending
   * invoice items that exist on the customer but may still be included in the next invoice.
   */
  public val lineItems: InlineQuotesResourceUpfrontLineItemsX66509c0b? = null,
) {
  public class Builder {
    private var amountSubtotalValue: Int? = null

    public var amountSubtotal: Int
      get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
      set(`value`) {
        amountSubtotalValue = value
      }

    private var amountTotalValue: Int? = null

    public var amountTotal: Int
      get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
      set(`value`) {
        amountTotalValue = value
      }

    private var totalDetailsValue: QuotesResourceTotalDetails? = null

    public var totalDetails: QuotesResourceTotalDetails
      get() = requireNotNull(totalDetailsValue) { "totalDetails is required" }
      set(`value`) {
        totalDetailsValue = value
      }

    /**
     * The line items that will appear on the next invoice after this quote is accepted. This does not include pending
     * invoice items that exist on the customer but may still be included in the next invoice.
     */
    public var lineItems: InlineQuotesResourceUpfrontLineItemsX66509c0b? = null

    public fun build(): QuotesResourceUpfront {
      check(amountSubtotalValue != null) { "amountSubtotal is required" }
      check(amountTotalValue != null) { "amountTotal is required" }
      check(totalDetailsValue != null) { "totalDetails is required" }
      return QuotesResourceUpfront(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        totalDetails = totalDetails,
        lineItems = lineItems,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceUpfront = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<QuotesResourceUpfront> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceUpfront {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceUpfront")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceUpfront must be a JSON object")
      val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
      val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
      val totalDetails = json.decodeRequired<QuotesResourceTotalDetails>(rawObject, "total_details")
      return QuotesResourceUpfront(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        totalDetails = totalDetails,
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlineQuotesResourceUpfrontLineItemsX66509c0b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceUpfront) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceUpfront")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
        put("amount_total", json.encodeToJsonElement(value.amountTotal))
        put("total_details", json.encodeToJsonElement(value.totalDetails))
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceUpfront(block: QuotesResourceUpfront.Builder.() -> Unit): QuotesResourceUpfront = QuotesResourceUpfront.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceUpfront is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
