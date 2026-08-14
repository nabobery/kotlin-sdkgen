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
 * ded/schema/properties/branding_settings/properties/border_style.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/border_style
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `pill`.
   */
  public data object Pill : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360() {
    public override val `value`: String = "pill"
  }

  /**
   * Documented value. Wire value: `rectangular`.
   */
  public data object Rectangular : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360() {
    public override val `value`: String = "rectangular"
  }

  /**
   * Documented value. Wire value: `rounded`.
   */
  public data object Rounded : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360() {
    public override val `value`: String = "rounded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360 = when (value) {
      Value.value -> Value
      Pill.value -> Pill
      Rectangular.value -> Rectangular
      Rounded.value -> Rounded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360) {
      encoder.encodeString(value.value)
    }
  }
}
