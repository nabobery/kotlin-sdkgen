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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatStreamChunk/properties/object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamChunk/properties/object
 */
@Serializable(with = InlineChatStreamChunkObjectValueXf80c7bac.Serializer::class)
public sealed class InlineChatStreamChunkObjectValueXf80c7bac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `chat.completion.chunk`.
   */
  public data object ChatCompletionChunk : InlineChatStreamChunkObjectValueXf80c7bac() {
    public override val `value`: String = "chat.completion.chunk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatStreamChunkObjectValueXf80c7bac()

  public companion object {
    public fun fromValue(`value`: String): InlineChatStreamChunkObjectValueXf80c7bac = when (value) {
      ChatCompletionChunk.value -> ChatCompletionChunk
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatStreamChunkObjectValueXf80c7bac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatStreamChunkObjectValueXf80c7bac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatStreamChunkObjectValueXf80c7bac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatStreamChunkObjectValueXf80c7bac) {
      encoder.encodeString(value.value)
    }
  }
}
