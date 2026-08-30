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
 * The type of image for the logo. Must be one of `file` or `url`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_branding_settings_logo/properties/typ
 * e
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc() {
    public override val `value`: String = "file"
  }

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc = when (value) {
      File.value -> File
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc) {
      encoder.encodeString(value.value)
    }
  }
}
