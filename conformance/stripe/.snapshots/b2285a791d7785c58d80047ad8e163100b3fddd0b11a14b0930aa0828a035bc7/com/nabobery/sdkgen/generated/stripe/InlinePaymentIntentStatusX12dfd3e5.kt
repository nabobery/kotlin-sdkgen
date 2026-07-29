package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Status of this PaymentIntent, one of `requires_payment_method`, `requires_confirmation`, `requires_action`,
 * `processing`, `requires_capture`, `canceled`, or `succeeded`. Read more about each PaymentIntent
 * [status](https://docs.stripe.com/payments/intents#intent-statuses).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/status
 */
@Serializable(with = InlinePaymentIntentStatusX12dfd3e5.Serializer::class)
public sealed class InlinePaymentIntentStatusX12dfd3e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlinePaymentIntentStatusX12dfd3e5() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlinePaymentIntentStatusX12dfd3e5() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `requires_action`.
   */
  public data object RequiresAction : InlinePaymentIntentStatusX12dfd3e5() {
    public override val `value`: String = "requires_action"
  }

  /**
   * Documented value. Wire value: `requires_capture`.
   */
  public data object RequiresCapture : InlinePaymentIntentStatusX12dfd3e5() {
    public override val `value`: String = "requires_capture"
  }

  /**
   * Documented value. Wire value: `requires_confirmation`.
   */
  public data object RequiresConfirmation : InlinePaymentIntentStatusX12dfd3e5() {
    public override val `value`: String = "requires_confirmation"
  }

  /**
   * Documented value. Wire value: `requires_payment_method`.
   */
  public data object RequiresPaymentMethod : InlinePaymentIntentStatusX12dfd3e5() {
    public override val `value`: String = "requires_payment_method"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlinePaymentIntentStatusX12dfd3e5() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentStatusX12dfd3e5()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentStatusX12dfd3e5 = when (value) {
      Canceled.value -> Canceled
      Processing.value -> Processing
      RequiresAction.value -> RequiresAction
      RequiresCapture.value -> RequiresCapture
      RequiresConfirmation.value -> RequiresConfirmation
      RequiresPaymentMethod.value -> RequiresPaymentMethod
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentStatusX12dfd3e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentStatusX12dfd3e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentStatusX12dfd3e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentStatusX12dfd3e5) {
      encoder.encodeString(value.value)
    }
  }
}
