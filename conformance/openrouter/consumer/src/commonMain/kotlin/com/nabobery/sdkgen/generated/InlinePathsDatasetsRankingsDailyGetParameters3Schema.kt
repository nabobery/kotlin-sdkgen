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
 * Restrict to models for a modality surface: `text` / `image_output` match output modality, `image` / `audio` match
 * input modality, and `tool_calling` keeps only rows that recorded at least one tool call. Exact dataset — cannot be
 * combined with `category` or `language_type`.
 */
@Serializable(with = InlinePathsDatasetsRankingsDailyGetParameters3Schema.Serializer::class)
public sealed class InlinePathsDatasetsRankingsDailyGetParameters3Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlinePathsDatasetsRankingsDailyGetParameters3Schema() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlinePathsDatasetsRankingsDailyGetParameters3Schema() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `image_output`.
   */
  public data object ImageOutput : InlinePathsDatasetsRankingsDailyGetParameters3Schema() {
    public override val `value`: String = "image_output"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : InlinePathsDatasetsRankingsDailyGetParameters3Schema() {
    public override val `value`: String = "audio"
  }

  /**
   * Documented value. Wire value: `tool_calling`.
   */
  public data object ToolCalling : InlinePathsDatasetsRankingsDailyGetParameters3Schema() {
    public override val `value`: String = "tool_calling"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsDatasetsRankingsDailyGetParameters3Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsDatasetsRankingsDailyGetParameters3Schema = when (value) {
      Text.value -> Text
      Image.value -> Image
      ImageOutput.value -> ImageOutput
      Audio.value -> Audio
      ToolCalling.value -> ToolCalling
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsDatasetsRankingsDailyGetParameters3Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters3Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsDatasetsRankingsDailyGetParameters3Schema =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsDatasetsRankingsDailyGetParameters3Schema) {
      encoder.encodeString(value.value)
    }
  }
}
