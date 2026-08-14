package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/quality.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/quality
 */
@Serializable(with = InlineImageGenerationServerToolQualityX0adf64a7.Serializer::class)
public sealed class InlineImageGenerationServerToolQualityX0adf64a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineImageGenerationServerToolQualityX0adf64a7() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineImageGenerationServerToolQualityX0adf64a7() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineImageGenerationServerToolQualityX0adf64a7() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineImageGenerationServerToolQualityX0adf64a7() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationServerToolQualityX0adf64a7()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationServerToolQualityX0adf64a7 = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolQualityX0adf64a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineImageGenerationServerToolQualityX0adf64a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolQualityX0adf64a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolQualityX0adf64a7) {
      encoder.encodeString(value.value)
    }
  }
}
