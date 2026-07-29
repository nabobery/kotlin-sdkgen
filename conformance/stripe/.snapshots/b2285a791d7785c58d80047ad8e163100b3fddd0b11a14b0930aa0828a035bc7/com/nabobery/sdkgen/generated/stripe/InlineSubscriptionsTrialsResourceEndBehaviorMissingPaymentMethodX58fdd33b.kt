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
 * Indicates how the subscription should change when the trial ends if the user did not provide a payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_trials_resource_end_behavior/properties/missing_paymen
 * t_method
 */
@Serializable(with = InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b.Serializer::class)
public sealed class InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b() {
    public override val `value`: String = "cancel"
  }

  /**
   * Documented value. Wire value: `create_invoice`.
   */
  public data object CreateInvoice : InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b() {
    public override val `value`: String = "create_invoice"
  }

  /**
   * Documented value. Wire value: `pause`.
   */
  public data object Pause : InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b() {
    public override val `value`: String = "pause"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b = when (value) {
      Cancel.value -> Cancel
      CreateInvoice.value -> CreateInvoice
      Pause.value -> Pause
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b) {
      encoder.encodeString(value.value)
    }
  }
}
