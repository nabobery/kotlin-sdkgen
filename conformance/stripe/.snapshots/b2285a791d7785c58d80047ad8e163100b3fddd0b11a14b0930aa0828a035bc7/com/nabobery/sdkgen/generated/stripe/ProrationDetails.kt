package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/proration_details
 */
@Serializable(with = ProrationDetails.Serializer::class)
public class ProrationDetails(
  discountAmounts: List<DiscountsResourceDiscountAmount>,
  /**
   * For a credit proration, links to the debit invoice line items or invoice item that the credit applies to.
   */
  public val creditedItems: InlineProrationDetailsCreditedItemsXce2017bd? = null,
) {
  /**
   * Discount amounts applied when the proration was created.
   */
  public val discountAmounts: List<DiscountsResourceDiscountAmount> = discountAmounts.toList()

  public class Builder {
    private var discountAmountsValue: List<DiscountsResourceDiscountAmount>? = null

    public var discountAmounts: List<DiscountsResourceDiscountAmount>
      get() = requireNotNull(discountAmountsValue) { "discountAmounts is required" }.toList()
      set(`value`) {
        discountAmountsValue = value.toList()
      }

    /**
     * For a credit proration, links to the debit invoice line items or invoice item that the credit applies to.
     */
    public var creditedItems: InlineProrationDetailsCreditedItemsXce2017bd? = null

    public fun build(): ProrationDetails {
      check(discountAmountsValue != null) { "discountAmounts is required" }
      return ProrationDetails(
        discountAmounts = discountAmounts,
        creditedItems = creditedItems,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProrationDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProrationDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProrationDetails {
      val jsonDecoder = decoder.requireJsonDecoder("ProrationDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProrationDetails must be a JSON object")
      val discountAmounts = json.decodeRequired<List<DiscountsResourceDiscountAmount>>(rawObject, "discount_amounts")
      return ProrationDetails(
        discountAmounts = discountAmounts,
        creditedItems = rawObject["credited_items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineProrationDetailsCreditedItemsXce2017bd?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProrationDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("ProrationDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("discount_amounts", json.encodeToJsonElement(value.discountAmounts))
        value.creditedItems?.let { put("credited_items", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun prorationDetails(block: ProrationDetails.Builder.() -> Unit): ProrationDetails = ProrationDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProrationDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
