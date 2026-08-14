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
 * Source: sdkgen://source/openapi.json#/components/schemas/coupon_applies_to
 */
@Serializable(with = CouponAppliesTo.Serializer::class)
public class CouponAppliesTo(
  products: List<String>,
) {
  /**
   * A list of product IDs this coupon applies to
   */
  public val products: List<String> = products.toList()

  public class Builder {
    private var productsValue: List<String>? = null

    public var products: List<String>
      get() = requireNotNull(productsValue) { "products is required" }.toList()
      set(`value`) {
        productsValue = value.toList()
      }

    public fun build(): CouponAppliesTo {
      check(productsValue != null) { "products is required" }
      return CouponAppliesTo(
        products = products,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CouponAppliesTo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CouponAppliesTo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CouponAppliesTo {
      val jsonDecoder = decoder.requireJsonDecoder("CouponAppliesTo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CouponAppliesTo must be a JSON object")
      val products = json.decodeRequired<List<String>>(rawObject, "products")
      return CouponAppliesTo(
        products = products,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CouponAppliesTo) {
      val jsonEncoder = encoder.requireJsonEncoder("CouponAppliesTo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("products", json.encodeToJsonElement(value.products))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun couponAppliesTo(block: CouponAppliesTo.Builder.() -> Unit): CouponAppliesTo = CouponAppliesTo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CouponAppliesTo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
