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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileBucket.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileBucket
 */
@Serializable(with = FileBucket.Serializer::class)
public sealed class FileBucket {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `hot`.
   */
  public data object Hot : FileBucket() {
    public override val `value`: String = "hot"
  }

  /**
   * Documented value. Wire value: `cold`.
   */
  public data object Cold : FileBucket() {
    public override val `value`: String = "cold"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : FileBucket()

  public companion object {
    public fun fromValue(`value`: String): FileBucket = when (value) {
      Hot.value -> Hot
      Cold.value -> Cold
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<FileBucket> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.FileBucket", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): FileBucket = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: FileBucket) {
      encoder.encodeString(value.value)
    }
  }
}
