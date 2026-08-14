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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputVideo/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputVideo/properties/type
 */
@Serializable(with = InlineContentPartInputVideoTypeXc13a2526.Serializer::class)
public sealed class InlineContentPartInputVideoTypeXc13a2526 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_video`.
   */
  public data object InputVideo : InlineContentPartInputVideoTypeXc13a2526() {
    public override val `value`: String = "input_video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentPartInputVideoTypeXc13a2526()

  public companion object {
    public fun fromValue(`value`: String): InlineContentPartInputVideoTypeXc13a2526 = when (value) {
      InputVideo.value -> InputVideo
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentPartInputVideoTypeXc13a2526> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineContentPartInputVideoTypeXc13a2526", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentPartInputVideoTypeXc13a2526 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentPartInputVideoTypeXc13a2526) {
      encoder.encodeString(value.value)
    }
  }
}
