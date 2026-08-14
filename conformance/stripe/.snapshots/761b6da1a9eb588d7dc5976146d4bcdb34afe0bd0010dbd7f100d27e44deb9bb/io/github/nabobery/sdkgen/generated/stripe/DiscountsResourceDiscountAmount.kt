package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/discounts_resource_discount_amount
 */
@Serializable(with = DiscountsResourceDiscountAmount.Serializer::class)
public class DiscountsResourceDiscountAmount(
  /**
   * The amount, in cents (or local equivalent), of the discount.
   */
  public val amount: Int,
  /**
   * The discount that was applied to get this discount amount.
   */
  public val discount: InlineDiscountsResourceDiscountAmountDiscountX681ee1a4,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var discountValue: InlineDiscountsResourceDiscountAmountDiscountX681ee1a4? = null

    public var discount: InlineDiscountsResourceDiscountAmountDiscountX681ee1a4
      get() = requireNotNull(discountValue) { "discount is required" }
      set(`value`) {
        discountValue = value
      }

    public fun build(): DiscountsResourceDiscountAmount {
      check(amountValue != null) { "amount is required" }
      check(discountValue != null) { "discount is required" }
      return DiscountsResourceDiscountAmount(
        amount = amount,
        discount = discount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DiscountsResourceDiscountAmount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DiscountsResourceDiscountAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DiscountsResourceDiscountAmount {
      val jsonDecoder = decoder.requireJsonDecoder("DiscountsResourceDiscountAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DiscountsResourceDiscountAmount must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val discount = json.decodeRequired<InlineDiscountsResourceDiscountAmountDiscountX681ee1a4>(rawObject, "discount")
      return DiscountsResourceDiscountAmount(
        amount = amount,
        discount = discount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DiscountsResourceDiscountAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("DiscountsResourceDiscountAmount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("discount", json.encodeToJsonElement(value.discount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun discountsResourceDiscountAmount(block: DiscountsResourceDiscountAmount.Builder.() -> Unit): DiscountsResourceDiscountAmount = DiscountsResourceDiscountAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DiscountsResourceDiscountAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
