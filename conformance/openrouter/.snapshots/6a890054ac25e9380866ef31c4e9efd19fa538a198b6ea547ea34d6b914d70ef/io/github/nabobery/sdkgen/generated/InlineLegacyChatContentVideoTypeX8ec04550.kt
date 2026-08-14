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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/Legacy_ChatContentVideo/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Legacy_ChatContentVideo/properties/type
 */
@Serializable(with = InlineLegacyChatContentVideoTypeX8ec04550.Serializer::class)
public sealed class InlineLegacyChatContentVideoTypeX8ec04550 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_video`.
   */
  public data object InputVideo : InlineLegacyChatContentVideoTypeX8ec04550() {
    public override val `value`: String = "input_video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLegacyChatContentVideoTypeX8ec04550()

  public companion object {
    public fun fromValue(`value`: String): InlineLegacyChatContentVideoTypeX8ec04550 = when (value) {
      InputVideo.value -> InputVideo
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLegacyChatContentVideoTypeX8ec04550> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineLegacyChatContentVideoTypeX8ec04550", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLegacyChatContentVideoTypeX8ec04550 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLegacyChatContentVideoTypeX8ec04550) {
      encoder.encodeString(value.value)
    }
  }
}
