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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_update_product_adjustable_quantity
 */
@Serializable(with = PortalSubscriptionUpdateProductAdjustableQuantity.Serializer::class)
public class PortalSubscriptionUpdateProductAdjustableQuantity(
  /**
   * If true, the quantity can be adjusted to any non-negative integer.
   */
  public val enabled: Boolean,
  /**
   * The minimum quantity that can be set for the product.
   */
  public val minimum: Int,
  /**
   * The maximum quantity that can be set for the product.
   */
  public val maximum: Int? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var minimumValue: Int? = null

    public var minimum: Int
      get() = requireNotNull(minimumValue) { "minimum is required" }
      set(`value`) {
        minimumValue = value
      }

    /**
     * The maximum quantity that can be set for the product.
     */
    public var maximum: Int? = null

    public fun build(): PortalSubscriptionUpdateProductAdjustableQuantity {
      check(enabledValue != null) { "enabled is required" }
      check(minimumValue != null) { "minimum is required" }
      return PortalSubscriptionUpdateProductAdjustableQuantity(
        enabled = enabled,
        minimum = minimum,
        maximum = maximum,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalSubscriptionUpdateProductAdjustableQuantity = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalSubscriptionUpdateProductAdjustableQuantity> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalSubscriptionUpdateProductAdjustableQuantity {
      val jsonDecoder = decoder.requireJsonDecoder("PortalSubscriptionUpdateProductAdjustableQuantity")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalSubscriptionUpdateProductAdjustableQuantity must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val minimum = json.decodeRequired<Int>(rawObject, "minimum")
      return PortalSubscriptionUpdateProductAdjustableQuantity(
        enabled = enabled,
        minimum = minimum,
        maximum = rawObject["maximum"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalSubscriptionUpdateProductAdjustableQuantity) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalSubscriptionUpdateProductAdjustableQuantity")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("minimum", json.encodeToJsonElement(value.minimum))
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalSubscriptionUpdateProductAdjustableQuantity(block: PortalSubscriptionUpdateProductAdjustableQuantity.Builder.() -> Unit): PortalSubscriptionUpdateProductAdjustableQuantity = PortalSubscriptionUpdateProductAdjustableQuantity.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalSubscriptionUpdateProductAdjustableQuantity is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
