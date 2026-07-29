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
 * If `opt_in`, the customer consents to receiving promotional communications
 * from the merchant about this Checkout Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_consent/properties/promotions
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `opt_in`.
   */
  public data object OptIn : InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17() {
    public override val `value`: String = "opt_in"
  }

  /**
   * Documented value. Wire value: `opt_out`.
   */
  public data object OptOut : InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17() {
    public override val `value`: String = "opt_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17 = when (value) {
      OptIn.value -> OptIn
      OptOut.value -> OptOut
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17) {
      encoder.encodeString(value.value)
    }
  }
}
