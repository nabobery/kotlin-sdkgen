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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputVideo/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputVideo/properties/type
 */
@Serializable(with = InlineInputVideoTypeX11ff9998.Serializer::class)
public sealed class InlineInputVideoTypeX11ff9998 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_video`.
   */
  public data object InputVideo : InlineInputVideoTypeX11ff9998() {
    public override val `value`: String = "input_video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputVideoTypeX11ff9998()

  public companion object {
    public fun fromValue(`value`: String): InlineInputVideoTypeX11ff9998 = when (value) {
      InputVideo.value -> InputVideo
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputVideoTypeX11ff9998> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputVideoTypeX11ff9998", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputVideoTypeX11ff9998 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputVideoTypeX11ff9998) {
      encoder.encodeString(value.value)
    }
  }
}
