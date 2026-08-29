package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_card_await_notification
 */
@Serializable(with = PaymentIntentNextActionCardAwaitNotification.Serializer::class)
public class PaymentIntentNextActionCardAwaitNotification(
  /**
   * The time that payment will be attempted. If customer approval is required, they need to provide approval before
   * this time.
   */
  public val chargeAttemptAt: Int? = null,
  /**
   * For payments greater than INR 15000, the customer must provide explicit approval of the payment with their bank.
   * For payments of lower amount, no customer action is required.
   */
  public val customerApprovalRequired: Boolean? = null,
) {
  public class Builder {
    /**
     * The time that payment will be attempted. If customer approval is required, they need to provide approval before
     * this time.
     */
    public var chargeAttemptAt: Int? = null

    /**
     * For payments greater than INR 15000, the customer must provide explicit approval of the payment with their bank.
     * For payments of lower amount, no customer action is required.
     */
    public var customerApprovalRequired: Boolean? = null

    public fun build(): PaymentIntentNextActionCardAwaitNotification = PaymentIntentNextActionCardAwaitNotification(
      chargeAttemptAt = chargeAttemptAt,
      customerApprovalRequired = customerApprovalRequired,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionCardAwaitNotification = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionCardAwaitNotification> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionCardAwaitNotification {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionCardAwaitNotification")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionCardAwaitNotification must be a JSON object")
      return PaymentIntentNextActionCardAwaitNotification(
        chargeAttemptAt = rawObject["charge_attempt_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        customerApprovalRequired = rawObject["customer_approval_required"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionCardAwaitNotification) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionCardAwaitNotification")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.chargeAttemptAt?.let { put("charge_attempt_at", json.encodeToJsonElement(it)) }
        value.customerApprovalRequired?.let { put("customer_approval_required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionCardAwaitNotification(block: PaymentIntentNextActionCardAwaitNotification.Builder.() -> Unit): PaymentIntentNextActionCardAwaitNotification = PaymentIntentNextActionCardAwaitNotification.build(block)
