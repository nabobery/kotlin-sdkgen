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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ImagePricingEntry/properties/billable.
 */
@Serializable(with = InlineComponentsSchemasImagePricingEntryPropertiesBillable.Serializer::class)
public sealed class InlineComponentsSchemasImagePricingEntryPropertiesBillable {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `output_image`.
   */
  public data object OutputImage : InlineComponentsSchemasImagePricingEntryPropertiesBillable() {
    public override val `value`: String = "output_image"
  }

  /**
   * Documented value. Wire value: `input_image`.
   */
  public data object InputImage : InlineComponentsSchemasImagePricingEntryPropertiesBillable() {
    public override val `value`: String = "input_image"
  }

  /**
   * Documented value. Wire value: `input_font`.
   */
  public data object InputFont : InlineComponentsSchemasImagePricingEntryPropertiesBillable() {
    public override val `value`: String = "input_font"
  }

  /**
   * Documented value. Wire value: `input_reference`.
   */
  public data object InputReference : InlineComponentsSchemasImagePricingEntryPropertiesBillable() {
    public override val `value`: String = "input_reference"
  }

  /**
   * Documented value. Wire value: `input_text`.
   */
  public data object InputText : InlineComponentsSchemasImagePricingEntryPropertiesBillable() {
    public override val `value`: String = "input_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImagePricingEntryPropertiesBillable()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImagePricingEntryPropertiesBillable = when (value) {
      OutputImage.value -> OutputImage
      InputImage.value -> InputImage
      InputFont.value -> InputFont
      InputReference.value -> InputReference
      InputText.value -> InputText
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImagePricingEntryPropertiesBillable> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImagePricingEntryPropertiesBillable", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImagePricingEntryPropertiesBillable =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImagePricingEntryPropertiesBillable) {
      encoder.encodeString(value.value)
    }
  }
}
