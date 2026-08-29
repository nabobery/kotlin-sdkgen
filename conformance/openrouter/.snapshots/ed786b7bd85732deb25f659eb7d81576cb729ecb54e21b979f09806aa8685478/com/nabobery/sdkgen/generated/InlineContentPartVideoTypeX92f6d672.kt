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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartVideo/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartVideo/properties/type
 */
@Serializable(with = InlineContentPartVideoTypeX92f6d672.Serializer::class)
public sealed class InlineContentPartVideoTypeX92f6d672 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `video_url`.
   */
  public data object VideoUrl : InlineContentPartVideoTypeX92f6d672() {
    public override val `value`: String = "video_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentPartVideoTypeX92f6d672()

  public companion object {
    public fun fromValue(`value`: String): InlineContentPartVideoTypeX92f6d672 = when (value) {
      VideoUrl.value -> VideoUrl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentPartVideoTypeX92f6d672> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineContentPartVideoTypeX92f6d672", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentPartVideoTypeX92f6d672 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentPartVideoTypeX92f6d672) {
      encoder.encodeString(value.value)
    }
  }
}
