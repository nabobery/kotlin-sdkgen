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

@Serializable
public data class PaymentPagesCheckoutSessionOptionalItemAdjustableQuantityView(
  public val enabled: Boolean,
  public val maximum: Int? = null,
  public val minimum: Int? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_optional_item_adjustable_quantity
 */
@Serializable(with = PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity.Serializer::class)
public class PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity(
  /**
   * Set to true if the quantity can be adjusted to any non-negative integer.
   */
  public val enabled: Boolean,
  /**
   * The maximum quantity of this item the customer can purchase. By default this value is 99. You can specify a value
   * up to 999999.
   */
  public val maximum: Int? = null,
  /**
   * The minimum quantity of this item the customer must purchase, if they choose to purchase it. Because this item is
   * optional, the customer will always be able to remove it from their order, even if the `minimum` configured here is
   * greater than 0. By default this value is 0.
   */
  public val minimum: Int? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * The maximum quantity of this item the customer can purchase. By default this value is 99. You can specify a value
     * up to 999999.
     */
    public var maximum: Int? = null

    /**
     * The minimum quantity of this item the customer must purchase, if they choose to purchase it. Because this item is
     * optional, the customer will always be able to remove it from their order, even if the `minimum` configured here
     * is greater than 0. By default this value is 0.
     */
    public var minimum: Int? = null

    public fun build(): PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity {
      check(enabledValue != null) { "enabled is required" }
      return PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity(
        enabled = enabled,
        maximum = maximum,
        minimum = minimum,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity(
        enabled = enabled,
        maximum = rawObject["maximum"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        minimum = rawObject["minimum"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity")
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

public fun paymentPagesCheckoutSessionOptionalItemAdjustableQuantity(block: PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity.Builder.() -> Unit): PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity = PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
