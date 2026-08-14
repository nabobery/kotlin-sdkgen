package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/adjustable_quantity.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/adjustable_quantity
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe(
  public val enabled: Boolean,
  public val maximum: Int? = null,
  public val minimum: Int? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var maximum: Int? = null

    public var minimum: Int? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe(
        enabled = enabled,
        maximum = maximum,
        minimum = minimum,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe(
        enabled = enabled,
        maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<Int>(it) },
        minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe(block: InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe = InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
