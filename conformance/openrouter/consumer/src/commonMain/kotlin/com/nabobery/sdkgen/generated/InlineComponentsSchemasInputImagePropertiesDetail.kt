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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputImage/properties/detail.
 */
@Serializable(with = InlineComponentsSchemasInputImagePropertiesDetail.Serializer::class)
public sealed class InlineComponentsSchemasInputImagePropertiesDetail {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasInputImagePropertiesDetail() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasInputImagePropertiesDetail() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasInputImagePropertiesDetail() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `original`.
   */
  public data object Original : InlineComponentsSchemasInputImagePropertiesDetail() {
    public override val `value`: String = "original"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputImagePropertiesDetail()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputImagePropertiesDetail = when (value) {
      Auto.value -> Auto
      High.value -> High
      Low.value -> Low
      Original.value -> Original
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputImagePropertiesDetail> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputImagePropertiesDetail",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputImagePropertiesDetail = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputImagePropertiesDetail) {
      encoder.encodeString(value.value)
    }
  }
}
