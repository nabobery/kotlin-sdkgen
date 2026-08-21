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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_present/properties/read_method
 */
@Serializable(with = InlinePaymentMethodCardPresentReadMethodX5352686b.Serializer::class)
public sealed class InlinePaymentMethodCardPresentReadMethodX5352686b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `contact_emv`.
   */
  public data object ContactEmv : InlinePaymentMethodCardPresentReadMethodX5352686b() {
    public override val `value`: String = "contact_emv"
  }

  /**
   * Documented value. Wire value: `contactless_emv`.
   */
  public data object ContactlessEmv : InlinePaymentMethodCardPresentReadMethodX5352686b() {
    public override val `value`: String = "contactless_emv"
  }

  /**
   * Documented value. Wire value: `contactless_magstripe_mode`.
   */
  public data object ContactlessMagstripeMode : InlinePaymentMethodCardPresentReadMethodX5352686b() {
    public override val `value`: String = "contactless_magstripe_mode"
  }

  /**
   * Documented value. Wire value: `magnetic_stripe_fallback`.
   */
  public data object MagneticStripeFallback : InlinePaymentMethodCardPresentReadMethodX5352686b() {
    public override val `value`: String = "magnetic_stripe_fallback"
  }

  /**
   * Documented value. Wire value: `magnetic_stripe_track2`.
   */
  public data object MagneticStripeTrack2 : InlinePaymentMethodCardPresentReadMethodX5352686b() {
    public override val `value`: String = "magnetic_stripe_track2"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodCardPresentReadMethodX5352686b()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodCardPresentReadMethodX5352686b = when (value) {
      ContactEmv.value -> ContactEmv
      ContactlessEmv.value -> ContactlessEmv
      ContactlessMagstripeMode.value -> ContactlessMagstripeMode
      MagneticStripeFallback.value -> MagneticStripeFallback
      MagneticStripeTrack2.value -> MagneticStripeTrack2
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardPresentReadMethodX5352686b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodCardPresentReadMethodX5352686b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardPresentReadMethodX5352686b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardPresentReadMethodX5352686b) {
      encoder.encodeString(value.value)
    }
  }
}
