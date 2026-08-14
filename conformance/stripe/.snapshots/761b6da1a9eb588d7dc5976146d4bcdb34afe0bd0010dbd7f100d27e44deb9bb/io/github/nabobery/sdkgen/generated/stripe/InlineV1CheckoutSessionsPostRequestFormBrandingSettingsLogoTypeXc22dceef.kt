package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/logo/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/logo/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef() {
    public override val `value`: String = "file"
  }

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef = when (value) {
      File.value -> File
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef) {
      encoder.encodeString(value.value)
    }
  }
}
