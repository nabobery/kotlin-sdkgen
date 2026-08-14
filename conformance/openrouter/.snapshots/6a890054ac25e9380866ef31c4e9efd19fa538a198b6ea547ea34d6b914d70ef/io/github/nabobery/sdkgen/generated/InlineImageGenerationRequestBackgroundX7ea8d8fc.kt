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
 * Background treatment. `transparent` requires an output_format that supports alpha (png or webp).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationRequest/properties/background
 */
@Serializable(with = InlineImageGenerationRequestBackgroundX7ea8d8fc.Serializer::class)
public sealed class InlineImageGenerationRequestBackgroundX7ea8d8fc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineImageGenerationRequestBackgroundX7ea8d8fc() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `transparent`.
   */
  public data object Transparent : InlineImageGenerationRequestBackgroundX7ea8d8fc() {
    public override val `value`: String = "transparent"
  }

  /**
   * Documented value. Wire value: `opaque`.
   */
  public data object Opaque : InlineImageGenerationRequestBackgroundX7ea8d8fc() {
    public override val `value`: String = "opaque"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationRequestBackgroundX7ea8d8fc()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationRequestBackgroundX7ea8d8fc = when (value) {
      Auto.value -> Auto
      Transparent.value -> Transparent
      Opaque.value -> Opaque
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationRequestBackgroundX7ea8d8fc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineImageGenerationRequestBackgroundX7ea8d8fc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationRequestBackgroundX7ea8d8fc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationRequestBackgroundX7ea8d8fc) {
      encoder.encodeString(value.value)
    }
  }
}
