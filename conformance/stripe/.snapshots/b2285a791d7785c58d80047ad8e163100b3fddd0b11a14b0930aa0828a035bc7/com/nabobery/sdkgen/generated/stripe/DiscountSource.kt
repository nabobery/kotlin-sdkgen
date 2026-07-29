package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/discount_source
 */
@Serializable(with = DiscountSource.Serializer::class)
public class DiscountSource(
  /**
   * The source type of the discount.
   */
  public val type: InlineDiscountSourceTypeX7337b6b0,
  /**
   * The coupon that was redeemed to create this discount.
   */
  public val coupon: InlineDiscountSourceCouponX03063bd3? = null,
) {
  public class Builder {
    private var typeValue: InlineDiscountSourceTypeX7337b6b0? = null

    public var type: InlineDiscountSourceTypeX7337b6b0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The coupon that was redeemed to create this discount.
     */
    public var coupon: InlineDiscountSourceCouponX03063bd3? = null

    public fun build(): DiscountSource {
      check(typeValue != null) { "type is required" }
      return DiscountSource(
        type = type,
        coupon = coupon,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DiscountSource = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DiscountSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DiscountSource {
      val jsonDecoder = decoder.requireJsonDecoder("DiscountSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DiscountSource must be a JSON object")
      val type = json.decodeRequired<InlineDiscountSourceTypeX7337b6b0>(rawObject, "type")
      return DiscountSource(
        type = type,
        coupon = rawObject["coupon"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDiscountSourceCouponX03063bd3?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DiscountSource) {
      val jsonEncoder = encoder.requireJsonEncoder("DiscountSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.coupon?.let { put("coupon", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun discountSource(block: DiscountSource.Builder.() -> Unit): DiscountSource = DiscountSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DiscountSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
