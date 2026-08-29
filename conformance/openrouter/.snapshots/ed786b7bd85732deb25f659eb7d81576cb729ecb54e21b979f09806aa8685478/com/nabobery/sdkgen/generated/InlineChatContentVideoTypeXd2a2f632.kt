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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentVideo/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentVideo/properties/type
 */
@Serializable(with = InlineChatContentVideoTypeXd2a2f632.Serializer::class)
public sealed class InlineChatContentVideoTypeXd2a2f632 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `video_url`.
   */
  public data object VideoUrl : InlineChatContentVideoTypeXd2a2f632() {
    public override val `value`: String = "video_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatContentVideoTypeXd2a2f632()

  public companion object {
    public fun fromValue(`value`: String): InlineChatContentVideoTypeXd2a2f632 = when (value) {
      VideoUrl.value -> VideoUrl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatContentVideoTypeXd2a2f632> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatContentVideoTypeXd2a2f632", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatContentVideoTypeXd2a2f632 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatContentVideoTypeXd2a2f632) {
      encoder.encodeString(value.value)
    }
  }
}
