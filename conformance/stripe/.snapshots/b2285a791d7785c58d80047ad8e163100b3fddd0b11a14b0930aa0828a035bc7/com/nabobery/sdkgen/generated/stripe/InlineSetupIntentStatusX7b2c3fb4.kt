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
 * [Status](https://docs.stripe.com/payments/intents#intent-statuses) of this SetupIntent, one of
 * `requires_payment_method`, `requires_confirmation`, `requires_action`, `processing`, `canceled`, or `succeeded`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/status
 */
@Serializable(with = InlineSetupIntentStatusX7b2c3fb4.Serializer::class)
public sealed class InlineSetupIntentStatusX7b2c3fb4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineSetupIntentStatusX7b2c3fb4() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineSetupIntentStatusX7b2c3fb4() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `requires_action`.
   */
  public data object RequiresAction : InlineSetupIntentStatusX7b2c3fb4() {
    public override val `value`: String = "requires_action"
  }

  /**
   * Documented value. Wire value: `requires_confirmation`.
   */
  public data object RequiresConfirmation : InlineSetupIntentStatusX7b2c3fb4() {
    public override val `value`: String = "requires_confirmation"
  }

  /**
   * Documented value. Wire value: `requires_payment_method`.
   */
  public data object RequiresPaymentMethod : InlineSetupIntentStatusX7b2c3fb4() {
    public override val `value`: String = "requires_payment_method"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineSetupIntentStatusX7b2c3fb4() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentStatusX7b2c3fb4()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentStatusX7b2c3fb4 = when (value) {
      Canceled.value -> Canceled
      Processing.value -> Processing
      RequiresAction.value -> RequiresAction
      RequiresConfirmation.value -> RequiresConfirmation
      RequiresPaymentMethod.value -> RequiresPaymentMethod
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentStatusX7b2c3fb4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentStatusX7b2c3fb4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentStatusX7b2c3fb4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentStatusX7b2c3fb4) {
      encoder.encodeString(value.value)
    }
  }
}
