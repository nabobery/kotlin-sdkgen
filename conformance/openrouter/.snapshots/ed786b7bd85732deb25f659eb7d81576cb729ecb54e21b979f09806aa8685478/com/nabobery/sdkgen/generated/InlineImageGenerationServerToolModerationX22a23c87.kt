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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/moderation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/moderation
 */
@Serializable(with = InlineImageGenerationServerToolModerationX22a23c87.Serializer::class)
public sealed class InlineImageGenerationServerToolModerationX22a23c87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineImageGenerationServerToolModerationX22a23c87() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineImageGenerationServerToolModerationX22a23c87() {
    public override val `value`: String = "low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationServerToolModerationX22a23c87()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationServerToolModerationX22a23c87 = when (value) {
      Auto.value -> Auto
      Low.value -> Low
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolModerationX22a23c87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenerationServerToolModerationX22a23c87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolModerationX22a23c87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolModerationX22a23c87) {
      encoder.encodeString(value.value)
    }
  }
}
