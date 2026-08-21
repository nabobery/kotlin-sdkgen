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
 * The generation phase this chunk belongs to. `content` is the renderable output; `reasoning` and `draft` are
 * intermediate provider phases.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenTextChunkEvent/properties/phase
 */
@Serializable(with = InlineImageGenTextChunkEventPhaseXf0bed070.Serializer::class)
public sealed class InlineImageGenTextChunkEventPhaseXf0bed070 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content`.
   */
  public data object Content : InlineImageGenTextChunkEventPhaseXf0bed070() {
    public override val `value`: String = "content"
  }

  /**
   * Documented value. Wire value: `reasoning`.
   */
  public data object Reasoning : InlineImageGenTextChunkEventPhaseXf0bed070() {
    public override val `value`: String = "reasoning"
  }

  /**
   * Documented value. Wire value: `draft`.
   */
  public data object Draft : InlineImageGenTextChunkEventPhaseXf0bed070() {
    public override val `value`: String = "draft"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenTextChunkEventPhaseXf0bed070()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenTextChunkEventPhaseXf0bed070 = when (value) {
      Content.value -> Content
      Reasoning.value -> Reasoning
      Draft.value -> Draft
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenTextChunkEventPhaseXf0bed070> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenTextChunkEventPhaseXf0bed070", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenTextChunkEventPhaseXf0bed070 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenTextChunkEventPhaseXf0bed070) {
      encoder.encodeString(value.value)
    }
  }
}
