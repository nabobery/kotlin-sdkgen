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
 * Source: sdkgen://source/openapi.json#/components/schemas/line_items_discount_amount
 */
@Serializable(with = LineItemsDiscountAmount.Serializer::class)
public class LineItemsDiscountAmount(
  /**
   * The amount discounted.
   */
  public val amount: Int,
  public val discount: Discount,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var discountValue: Discount? = null

    public var discount: Discount
      get() = requireNotNull(discountValue) { "discount is required" }
      set(`value`) {
        discountValue = value
      }

    public fun build(): LineItemsDiscountAmount {
      check(amountValue != null) { "amount is required" }
      check(discountValue != null) { "discount is required" }
      return LineItemsDiscountAmount(
        amount = amount,
        discount = discount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LineItemsDiscountAmount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LineItemsDiscountAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LineItemsDiscountAmount {
      val jsonDecoder = decoder.requireJsonDecoder("LineItemsDiscountAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LineItemsDiscountAmount must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val discount = json.decodeRequired<Discount>(rawObject, "discount")
      return LineItemsDiscountAmount(
        amount = amount,
        discount = discount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: LineItemsDiscountAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("LineItemsDiscountAmount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("discount", json.encodeToJsonElement(value.discount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun lineItemsDiscountAmount(block: LineItemsDiscountAmount.Builder.() -> Unit): LineItemsDiscountAmount = LineItemsDiscountAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LineItemsDiscountAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
