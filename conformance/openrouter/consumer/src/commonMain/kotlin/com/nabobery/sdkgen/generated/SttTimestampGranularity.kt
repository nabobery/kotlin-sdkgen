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
 * A timestamp detail level for verbose_json transcription responses.
 */
@Serializable(with = SttTimestampGranularity.Serializer::class)
public sealed class SttTimestampGranularity {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `word`.
   */
  public data object Word : SttTimestampGranularity() {
    public override val `value`: String = "word"
  }

  /**
   * Documented value. Wire value: `segment`.
   */
  public data object Segment : SttTimestampGranularity() {
    public override val `value`: String = "segment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SttTimestampGranularity()

  public companion object {
    public fun fromValue(`value`: String): SttTimestampGranularity = when (value) {
      Word.value -> Word
      Segment.value -> Segment
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<SttTimestampGranularity> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.SttTimestampGranularity", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SttTimestampGranularity = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SttTimestampGranularity) {
      encoder.encodeString(value.value)
    }
  }
}
