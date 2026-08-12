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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/icon/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/icon/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f() {
    public override val `value`: String = "file"
  }

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f = when (value) {
      File.value -> File
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconTypeX17eba95f) {
      encoder.encodeString(value.value)
    }
  }
}
