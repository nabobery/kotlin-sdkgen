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
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/background.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/background
 */
@Serializable(with = InlineImageGenerationServerToolBackgroundX59d8a548.Serializer::class)
public sealed class InlineImageGenerationServerToolBackgroundX59d8a548 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transparent`.
   */
  public data object Transparent : InlineImageGenerationServerToolBackgroundX59d8a548() {
    public override val `value`: String = "transparent"
  }

  /**
   * Documented value. Wire value: `opaque`.
   */
  public data object Opaque : InlineImageGenerationServerToolBackgroundX59d8a548() {
    public override val `value`: String = "opaque"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineImageGenerationServerToolBackgroundX59d8a548() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationServerToolBackgroundX59d8a548()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationServerToolBackgroundX59d8a548 = when (value) {
      Transparent.value -> Transparent
      Opaque.value -> Opaque
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolBackgroundX59d8a548> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineImageGenerationServerToolBackgroundX59d8a548", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolBackgroundX59d8a548 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolBackgroundX59d8a548) {
      encoder.encodeString(value.value)
    }
  }
}
