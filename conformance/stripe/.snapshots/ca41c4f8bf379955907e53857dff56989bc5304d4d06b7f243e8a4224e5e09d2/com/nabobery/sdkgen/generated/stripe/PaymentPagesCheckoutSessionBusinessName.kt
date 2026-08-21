package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_business_name
 */
@Serializable(with = PaymentPagesCheckoutSessionBusinessName.Serializer::class)
public class PaymentPagesCheckoutSessionBusinessName(
  /**
   * Indicates whether business name collection is enabled for the session
   */
  public val enabled: Boolean,
  /**
   * Whether the customer is required to complete the field before completing the Checkout Session. Defaults to `false`.
   */
  public val optional: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var optionalValue: Boolean? = null

    public var optional: Boolean
      get() = requireNotNull(optionalValue) { "optional is required" }
      set(`value`) {
        optionalValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionBusinessName {
      check(enabledValue != null) { "enabled is required" }
      check(optionalValue != null) { "optional is required" }
      return PaymentPagesCheckoutSessionBusinessName(
        enabled = enabled,
        optional = optional,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionBusinessName = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionBusinessName> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionBusinessName {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionBusinessName")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionBusinessName must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val optional = json.decodeRequired<Boolean>(rawObject, "optional")
      return PaymentPagesCheckoutSessionBusinessName(
        enabled = enabled,
        optional = optional,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionBusinessName) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionBusinessName")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("optional", json.encodeToJsonElement(value.optional))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionBusinessName(block: PaymentPagesCheckoutSessionBusinessName.Builder.() -> Unit): PaymentPagesCheckoutSessionBusinessName = PaymentPagesCheckoutSessionBusinessName.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionBusinessName is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
