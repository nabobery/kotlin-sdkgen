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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A hash containing directions for what this Coupon will apply discounts to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/applies_to
 */
@Serializable(with = InlineV1CouponsPostRequestFormAppliesToXceb8e268.Serializer::class)
public class InlineV1CouponsPostRequestFormAppliesToXceb8e268(
  products: List<String>? = null,
) {
  public val products: List<String>? = products?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var productsValue: List<String>? = null

    public var products: List<String>?
      get() = productsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        productsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CouponsPostRequestFormAppliesToXceb8e268 = InlineV1CouponsPostRequestFormAppliesToXceb8e268(
      products = products,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CouponsPostRequestFormAppliesToXceb8e268 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CouponsPostRequestFormAppliesToXceb8e268> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormAppliesToXceb8e268 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CouponsPostRequestFormAppliesToXceb8e268")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CouponsPostRequestFormAppliesToXceb8e268 must be a JSON object")
      return InlineV1CouponsPostRequestFormAppliesToXceb8e268(
        products = rawObject["products"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormAppliesToXceb8e268) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CouponsPostRequestFormAppliesToXceb8e268")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.products?.let { put("products", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CouponsPostRequestFormAppliesToXceb8e268(block: InlineV1CouponsPostRequestFormAppliesToXceb8e268.Builder.() -> Unit): InlineV1CouponsPostRequestFormAppliesToXceb8e268 = InlineV1CouponsPostRequestFormAppliesToXceb8e268.build(block)
