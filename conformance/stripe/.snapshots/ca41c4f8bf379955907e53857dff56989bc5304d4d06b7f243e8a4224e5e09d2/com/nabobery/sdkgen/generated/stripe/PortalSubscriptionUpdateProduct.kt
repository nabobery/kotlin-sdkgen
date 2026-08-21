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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_update_product
 */
@Serializable(with = PortalSubscriptionUpdateProduct.Serializer::class)
public class PortalSubscriptionUpdateProduct(
  public val adjustableQuantity: PortalSubscriptionUpdateProductAdjustableQuantity,
  prices: List<String>,
  /**
   * The product ID.
   */
  public val product: String,
) {
  /**
   * The list of price IDs which, when subscribed to, a subscription can be updated.
   */
  public val prices: List<String> = prices.toList()

  public class Builder {
    private var adjustableQuantityValue: PortalSubscriptionUpdateProductAdjustableQuantity? = null

    public var adjustableQuantity: PortalSubscriptionUpdateProductAdjustableQuantity
      get() = requireNotNull(adjustableQuantityValue) { "adjustableQuantity is required" }
      set(`value`) {
        adjustableQuantityValue = value
      }

    private var pricesValue: List<String>? = null

    public var prices: List<String>
      get() = requireNotNull(pricesValue) { "prices is required" }.toList()
      set(`value`) {
        pricesValue = value.toList()
      }

    private var productValue: String? = null

    public var product: String
      get() = requireNotNull(productValue) { "product is required" }
      set(`value`) {
        productValue = value
      }

    public fun build(): PortalSubscriptionUpdateProduct {
      check(adjustableQuantityValue != null) { "adjustableQuantity is required" }
      check(pricesValue != null) { "prices is required" }
      check(productValue != null) { "product is required" }
      return PortalSubscriptionUpdateProduct(
        adjustableQuantity = adjustableQuantity,
        prices = prices,
        product = product,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalSubscriptionUpdateProduct = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalSubscriptionUpdateProduct> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalSubscriptionUpdateProduct {
      val jsonDecoder = decoder.requireJsonDecoder("PortalSubscriptionUpdateProduct")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalSubscriptionUpdateProduct must be a JSON object")
      val adjustableQuantity = json.decodeRequired<PortalSubscriptionUpdateProductAdjustableQuantity>(rawObject, "adjustable_quantity")
      val prices = json.decodeRequired<List<String>>(rawObject, "prices")
      val product = json.decodeRequired<String>(rawObject, "product")
      return PortalSubscriptionUpdateProduct(
        adjustableQuantity = adjustableQuantity,
        prices = prices,
        product = product,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalSubscriptionUpdateProduct) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalSubscriptionUpdateProduct")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("adjustable_quantity", json.encodeToJsonElement(value.adjustableQuantity))
        put("prices", json.encodeToJsonElement(value.prices))
        put("product", value.product)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalSubscriptionUpdateProduct(block: PortalSubscriptionUpdateProduct.Builder.() -> Unit): PortalSubscriptionUpdateProduct = PortalSubscriptionUpdateProduct.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalSubscriptionUpdateProduct is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
