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
 * The type of image for the icon. Must be one of `file` or `url`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_branding_settings_icon/properties/typ
 * e
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b() {
    public override val `value`: String = "file"
  }

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b = when (value) {
      File.value -> File
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionBrandingSettingsIconTypeXcf20a31b) {
      encoder.encodeString(value.value)
    }
  }
}
