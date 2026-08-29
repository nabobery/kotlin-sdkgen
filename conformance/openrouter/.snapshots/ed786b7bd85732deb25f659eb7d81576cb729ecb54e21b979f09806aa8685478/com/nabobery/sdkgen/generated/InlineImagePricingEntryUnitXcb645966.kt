package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ImagePricingEntry/properties/unit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImagePricingEntry/properties/unit
 */
@Serializable(with = InlineImagePricingEntryUnitXcb645966.Serializer::class)
public sealed class InlineImagePricingEntryUnitXcb645966 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineImagePricingEntryUnitXcb645966() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `megapixel`.
   */
  public data object Megapixel : InlineImagePricingEntryUnitXcb645966() {
    public override val `value`: String = "megapixel"
  }

  /**
   * Documented value. Wire value: `token`.
   */
  public data object Token : InlineImagePricingEntryUnitXcb645966() {
    public override val `value`: String = "token"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImagePricingEntryUnitXcb645966()

  public companion object {
    public fun fromValue(`value`: String): InlineImagePricingEntryUnitXcb645966 = when (value) {
      Image.value -> Image
      Megapixel.value -> Megapixel
      Token.value -> Token
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImagePricingEntryUnitXcb645966> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImagePricingEntryUnitXcb645966", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImagePricingEntryUnitXcb645966 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImagePricingEntryUnitXcb645966) {
      encoder.encodeString(value.value)
    }
  }
}
