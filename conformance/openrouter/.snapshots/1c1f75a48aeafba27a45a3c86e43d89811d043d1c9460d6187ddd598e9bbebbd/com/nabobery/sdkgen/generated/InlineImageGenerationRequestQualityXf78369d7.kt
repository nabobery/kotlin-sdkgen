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
 * Rendering quality. Providers without a quality knob ignore this.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationRequest/properties/quality
 */
@Serializable(with = InlineImageGenerationRequestQualityXf78369d7.Serializer::class)
public sealed class InlineImageGenerationRequestQualityXf78369d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineImageGenerationRequestQualityXf78369d7() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineImageGenerationRequestQualityXf78369d7() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineImageGenerationRequestQualityXf78369d7() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineImageGenerationRequestQualityXf78369d7() {
    public override val `value`: String = "high"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationRequestQualityXf78369d7()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationRequestQualityXf78369d7 = when (value) {
      Auto.value -> Auto
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationRequestQualityXf78369d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenerationRequestQualityXf78369d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationRequestQualityXf78369d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationRequestQualityXf78369d7) {
      encoder.encodeString(value.value)
    }
  }
}
