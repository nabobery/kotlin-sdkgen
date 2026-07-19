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
 */
@Serializable(with = InlineComponentsSchemasImagePricingEntryPropertiesUnit.Serializer::class)
public sealed class InlineComponentsSchemasImagePricingEntryPropertiesUnit {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineComponentsSchemasImagePricingEntryPropertiesUnit() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `megapixel`.
   */
  public data object Megapixel : InlineComponentsSchemasImagePricingEntryPropertiesUnit() {
    public override val `value`: String = "megapixel"
  }

  /**
   * Documented value. Wire value: `token`.
   */
  public data object Token : InlineComponentsSchemasImagePricingEntryPropertiesUnit() {
    public override val `value`: String = "token"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImagePricingEntryPropertiesUnit()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImagePricingEntryPropertiesUnit = when (value) {
      Image.value -> Image
      Megapixel.value -> Megapixel
      Token.value -> Token
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImagePricingEntryPropertiesUnit> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImagePricingEntryPropertiesUnit", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImagePricingEntryPropertiesUnit =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImagePricingEntryPropertiesUnit) {
      encoder.encodeString(value.value)
    }
  }
}
