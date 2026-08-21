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
 * How card details were read in this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_interac_present/properties/read_method
 */
@Serializable(with = InlinePaymentMethodInteracPresentReadMethodXb4618b29.Serializer::class)
public sealed class InlinePaymentMethodInteracPresentReadMethodXb4618b29 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `contact_emv`.
   */
  public data object ContactEmv : InlinePaymentMethodInteracPresentReadMethodXb4618b29() {
    public override val `value`: String = "contact_emv"
  }

  /**
   * Documented value. Wire value: `contactless_emv`.
   */
  public data object ContactlessEmv : InlinePaymentMethodInteracPresentReadMethodXb4618b29() {
    public override val `value`: String = "contactless_emv"
  }

  /**
   * Documented value. Wire value: `contactless_magstripe_mode`.
   */
  public data object ContactlessMagstripeMode : InlinePaymentMethodInteracPresentReadMethodXb4618b29() {
    public override val `value`: String = "contactless_magstripe_mode"
  }

  /**
   * Documented value. Wire value: `magnetic_stripe_fallback`.
   */
  public data object MagneticStripeFallback : InlinePaymentMethodInteracPresentReadMethodXb4618b29() {
    public override val `value`: String = "magnetic_stripe_fallback"
  }

  /**
   * Documented value. Wire value: `magnetic_stripe_track2`.
   */
  public data object MagneticStripeTrack2 : InlinePaymentMethodInteracPresentReadMethodXb4618b29() {
    public override val `value`: String = "magnetic_stripe_track2"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodInteracPresentReadMethodXb4618b29()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodInteracPresentReadMethodXb4618b29 = when (value) {
      ContactEmv.value -> ContactEmv
      ContactlessEmv.value -> ContactlessEmv
      ContactlessMagstripeMode.value -> ContactlessMagstripeMode
      MagneticStripeFallback.value -> MagneticStripeFallback
      MagneticStripeTrack2.value -> MagneticStripeTrack2
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodInteracPresentReadMethodXb4618b29> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodInteracPresentReadMethodXb4618b29", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodInteracPresentReadMethodXb4618b29 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodInteracPresentReadMethodXb4618b29) {
      encoder.encodeString(value.value)
    }
  }
}
