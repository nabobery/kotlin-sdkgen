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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentText/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentText/properties/type
 */
@Serializable(with = InlineChatContentTextTypeX3d55d141.Serializer::class)
public sealed class InlineChatContentTextTypeX3d55d141 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineChatContentTextTypeX3d55d141() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatContentTextTypeX3d55d141()

  public companion object {
    public fun fromValue(`value`: String): InlineChatContentTextTypeX3d55d141 = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatContentTextTypeX3d55d141> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatContentTextTypeX3d55d141", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatContentTextTypeX3d55d141 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatContentTextTypeX3d55d141) {
      encoder.encodeString(value.value)
    }
  }
}
