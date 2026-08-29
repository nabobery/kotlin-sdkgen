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
 * If set to `required`, it requires customers to accept the terms of service before being able to pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_consent_collection/properties/terms_o
 * f_service
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e = when (value) {
      None.value -> None
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionConsentCollectionTermsOfServiceX0312229e) {
      encoder.encodeString(value.value)
    }
  }
}
