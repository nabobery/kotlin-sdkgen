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
 * Restrict to models for a modality surface: `text` / `image_output` match output modality, `image` / `audio` match
 * input modality, and `tool_calling` keeps only rows that recorded at least one tool call. Exact dataset — cannot be
 * combined with `category` or `language_type`.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1datasets~1rankings-daily/get/parameters/3/schema
 */
@Serializable(with = InlineDatasetsRankingsDailyGetParameterXddc87925.Serializer::class)
public sealed class InlineDatasetsRankingsDailyGetParameterXddc87925 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineDatasetsRankingsDailyGetParameterXddc87925() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineDatasetsRankingsDailyGetParameterXddc87925() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `image_output`.
   */
  public data object ImageOutput : InlineDatasetsRankingsDailyGetParameterXddc87925() {
    public override val `value`: String = "image_output"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : InlineDatasetsRankingsDailyGetParameterXddc87925() {
    public override val `value`: String = "audio"
  }

  /**
   * Documented value. Wire value: `tool_calling`.
   */
  public data object ToolCalling : InlineDatasetsRankingsDailyGetParameterXddc87925() {
    public override val `value`: String = "tool_calling"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDatasetsRankingsDailyGetParameterXddc87925()

  public companion object {
    public fun fromValue(`value`: String): InlineDatasetsRankingsDailyGetParameterXddc87925 = when (value) {
      Text.value -> Text
      Image.value -> Image
      ImageOutput.value -> ImageOutput
      Audio.value -> Audio
      ToolCalling.value -> ToolCalling
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDatasetsRankingsDailyGetParameterXddc87925> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineDatasetsRankingsDailyGetParameterXddc87925", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDatasetsRankingsDailyGetParameterXddc87925 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDatasetsRankingsDailyGetParameterXddc87925) {
      encoder.encodeString(value.value)
    }
  }
}
