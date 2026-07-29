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

@Serializable
public data class PaymentPagesCheckoutSessionManagedPaymentsView(
  public val enabled: Boolean,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_managed_payments
 */
@Serializable(with = PaymentPagesCheckoutSessionManagedPayments.Serializer::class)
public class PaymentPagesCheckoutSessionManagedPayments(
  /**
   * Set to `true` to enable [Managed Payments](https://docs.stripe.com/payments/managed-payments), Stripe's merchant of
   * record solution, for this session.
   */
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionManagedPayments {
      check(enabledValue != null) { "enabled is required" }
      return PaymentPagesCheckoutSessionManagedPayments(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionManagedPayments = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionManagedPayments> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionManagedPayments {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionManagedPayments")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionManagedPayments must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentPagesCheckoutSessionManagedPayments(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionManagedPayments) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionManagedPayments")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionManagedPayments(block: PaymentPagesCheckoutSessionManagedPayments.Builder.() -> Unit): PaymentPagesCheckoutSessionManagedPayments = PaymentPagesCheckoutSessionManagedPayments.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionManagedPayments is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
