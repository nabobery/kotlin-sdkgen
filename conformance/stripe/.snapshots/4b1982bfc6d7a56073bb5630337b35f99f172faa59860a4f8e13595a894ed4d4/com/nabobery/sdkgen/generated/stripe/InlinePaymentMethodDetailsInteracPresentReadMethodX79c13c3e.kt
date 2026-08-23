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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_interac_present/properties/read_method
 */
@Serializable(with = InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e.Serializer::class)
public sealed class InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `contact_emv`.
   */
  public data object ContactEmv : InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e() {
    public override val `value`: String = "contact_emv"
  }

  /**
   * Documented value. Wire value: `contactless_emv`.
   */
  public data object ContactlessEmv : InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e() {
    public override val `value`: String = "contactless_emv"
  }

  /**
   * Documented value. Wire value: `contactless_magstripe_mode`.
   */
  public data object ContactlessMagstripeMode : InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e() {
    public override val `value`: String = "contactless_magstripe_mode"
  }

  /**
   * Documented value. Wire value: `magnetic_stripe_fallback`.
   */
  public data object MagneticStripeFallback : InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e() {
    public override val `value`: String = "magnetic_stripe_fallback"
  }

  /**
   * Documented value. Wire value: `magnetic_stripe_track2`.
   */
  public data object MagneticStripeTrack2 : InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e() {
    public override val `value`: String = "magnetic_stripe_track2"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e = when (value) {
      ContactEmv.value -> ContactEmv
      ContactlessEmv.value -> ContactlessEmv
      ContactlessMagstripeMode.value -> ContactlessMagstripeMode
      MagneticStripeFallback.value -> MagneticStripeFallback
      MagneticStripeTrack2.value -> MagneticStripeTrack2
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsInteracPresentReadMethodX79c13c3e) {
      encoder.encodeString(value.value)
    }
  }
}
