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
 * The response format. "json" (default) returns { text, usage }; "verbose_json" additionally returns task, language,
 * duration, and segment-level timestamps (OpenAI-compatible providers only).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1audio~1transcriptions/post/requestBody/content/multipart~1form-data/schema/prop
 * erties/response_format
 */
@Serializable(with = InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791.Serializer::class)
public sealed class InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json`.
   */
  public data object Json : InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791() {
    public override val `value`: String = "json"
  }

  /**
   * Documented value. Wire value: `verbose_json`.
   */
  public data object VerboseJson : InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791() {
    public override val `value`: String = "verbose_json"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791()

  public companion object {
    public fun fromValue(`value`: String): InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791 = when (value) {
      Json.value -> Json
      VerboseJson.value -> VerboseJson
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791) {
      encoder.encodeString(value.value)
    }
  }
}
