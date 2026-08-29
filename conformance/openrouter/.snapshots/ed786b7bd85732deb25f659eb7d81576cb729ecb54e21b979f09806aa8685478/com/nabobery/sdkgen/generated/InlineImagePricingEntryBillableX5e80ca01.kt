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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImagePricingEntry/properties/billable
 */
@Serializable(with = InlineImagePricingEntryBillableX5e80ca01.Serializer::class)
public sealed class InlineImagePricingEntryBillableX5e80ca01 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `output_image`.
   */
  public data object OutputImage : InlineImagePricingEntryBillableX5e80ca01() {
    public override val `value`: String = "output_image"
  }

  /**
   * Documented value. Wire value: `input_image`.
   */
  public data object InputImage : InlineImagePricingEntryBillableX5e80ca01() {
    public override val `value`: String = "input_image"
  }

  /**
   * Documented value. Wire value: `input_font`.
   */
  public data object InputFont : InlineImagePricingEntryBillableX5e80ca01() {
    public override val `value`: String = "input_font"
  }

  /**
   * Documented value. Wire value: `input_reference`.
   */
  public data object InputReference : InlineImagePricingEntryBillableX5e80ca01() {
    public override val `value`: String = "input_reference"
  }

  /**
   * Documented value. Wire value: `input_text`.
   */
  public data object InputText : InlineImagePricingEntryBillableX5e80ca01() {
    public override val `value`: String = "input_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImagePricingEntryBillableX5e80ca01()

  public companion object {
    public fun fromValue(`value`: String): InlineImagePricingEntryBillableX5e80ca01 = when (value) {
      OutputImage.value -> OutputImage
      InputImage.value -> InputImage
      InputFont.value -> InputFont
      InputReference.value -> InputReference
      InputText.value -> InputText
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImagePricingEntryBillableX5e80ca01> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImagePricingEntryBillableX5e80ca01", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImagePricingEntryBillableX5e80ca01 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImagePricingEntryBillableX5e80ca01) {
      encoder.encodeString(value.value)
    }
  }
}
