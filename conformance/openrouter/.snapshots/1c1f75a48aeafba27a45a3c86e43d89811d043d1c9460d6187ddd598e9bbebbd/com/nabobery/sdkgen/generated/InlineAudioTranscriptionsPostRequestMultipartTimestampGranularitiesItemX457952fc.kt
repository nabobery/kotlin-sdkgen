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
 * sdkgen://source/openapi.yaml#/paths/~1audio~1transcriptions/post/requestBody/content/multipart~1form-data/schema/prop
 * erties/timestamp_granularities[]/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1audio~1transcriptions/post/requestBody/content/multipart~1form-data/schema/prop
 * erties/timestamp_granularities[]/items
 */
@Serializable(with = InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc.Serializer::class)
public sealed class InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `word`.
   */
  public data object Word : InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc() {
    public override val `value`: String = "word"
  }

  /**
   * Documented value. Wire value: `segment`.
   */
  public data object Segment : InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc() {
    public override val `value`: String = "segment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc()

  public companion object {
    public fun fromValue(`value`: String): InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc = when (value) {
      Word.value -> Word
      Segment.value -> Segment
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc) {
      encoder.encodeString(value.value)
    }
  }
}
