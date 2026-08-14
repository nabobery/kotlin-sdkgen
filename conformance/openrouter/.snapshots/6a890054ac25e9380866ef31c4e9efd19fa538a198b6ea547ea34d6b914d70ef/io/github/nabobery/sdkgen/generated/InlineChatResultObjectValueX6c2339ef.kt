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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatResult/properties/object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatResult/properties/object
 */
@Serializable(with = InlineChatResultObjectValueX6c2339ef.Serializer::class)
public sealed class InlineChatResultObjectValueX6c2339ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `chat.completion`.
   */
  public data object ChatCompletion : InlineChatResultObjectValueX6c2339ef() {
    public override val `value`: String = "chat.completion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatResultObjectValueX6c2339ef()

  public companion object {
    public fun fromValue(`value`: String): InlineChatResultObjectValueX6c2339ef = when (value) {
      ChatCompletion.value -> ChatCompletion
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatResultObjectValueX6c2339ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatResultObjectValueX6c2339ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatResultObjectValueX6c2339ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatResultObjectValueX6c2339ef) {
      encoder.encodeString(value.value)
    }
  }
}
