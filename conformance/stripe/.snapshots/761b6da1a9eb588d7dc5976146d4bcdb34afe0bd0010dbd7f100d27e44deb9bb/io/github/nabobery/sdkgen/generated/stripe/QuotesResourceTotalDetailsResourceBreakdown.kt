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
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_total_details_resource_breakdown
 */
@Serializable(with = QuotesResourceTotalDetailsResourceBreakdown.Serializer::class)
public class QuotesResourceTotalDetailsResourceBreakdown(
  discounts: List<LineItemsDiscountAmount>,
  taxes: List<LineItemsTaxAmount>,
) {
  /**
   * The aggregated discounts.
   */
  public val discounts: List<LineItemsDiscountAmount> = discounts.toList()

  /**
   * The aggregated tax amounts by rate.
   */
  public val taxes: List<LineItemsTaxAmount> = taxes.toList()

  public class Builder {
    private var discountsValue: List<LineItemsDiscountAmount>? = null

    public var discounts: List<LineItemsDiscountAmount>
      get() = requireNotNull(discountsValue) { "discounts is required" }.toList()
      set(`value`) {
        discountsValue = value.toList()
      }

    private var taxesValue: List<LineItemsTaxAmount>? = null

    public var taxes: List<LineItemsTaxAmount>
      get() = requireNotNull(taxesValue) { "taxes is required" }.toList()
      set(`value`) {
        taxesValue = value.toList()
      }

    public fun build(): QuotesResourceTotalDetailsResourceBreakdown {
      check(discountsValue != null) { "discounts is required" }
      check(taxesValue != null) { "taxes is required" }
      return QuotesResourceTotalDetailsResourceBreakdown(
        discounts = discounts,
        taxes = taxes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceTotalDetailsResourceBreakdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<QuotesResourceTotalDetailsResourceBreakdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceTotalDetailsResourceBreakdown {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceTotalDetailsResourceBreakdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceTotalDetailsResourceBreakdown must be a JSON object")
      val discounts = json.decodeRequired<List<LineItemsDiscountAmount>>(rawObject, "discounts")
      val taxes = json.decodeRequired<List<LineItemsTaxAmount>>(rawObject, "taxes")
      return QuotesResourceTotalDetailsResourceBreakdown(
        discounts = discounts,
        taxes = taxes,
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceTotalDetailsResourceBreakdown) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceTotalDetailsResourceBreakdown")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("taxes", json.encodeToJsonElement(value.taxes))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceTotalDetailsResourceBreakdown(block: QuotesResourceTotalDetailsResourceBreakdown.Builder.() -> Unit): QuotesResourceTotalDetailsResourceBreakdown = QuotesResourceTotalDetailsResourceBreakdown.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceTotalDetailsResourceBreakdown is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
