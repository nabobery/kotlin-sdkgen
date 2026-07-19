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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatStreamChunk/properties/object.
 */
@Serializable(with = InlineComponentsSchemasChatStreamChunkPropertiesObject.Serializer::class)
public sealed class InlineComponentsSchemasChatStreamChunkPropertiesObject {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `chat.completion.chunk`.
   */
  public data object ChatCompletionChunk : InlineComponentsSchemasChatStreamChunkPropertiesObject() {
    public override val `value`: String = "chat.completion.chunk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatStreamChunkPropertiesObject()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatStreamChunkPropertiesObject = when (value) {
      ChatCompletionChunk.value -> ChatCompletionChunk
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatStreamChunkPropertiesObject> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatStreamChunkPropertiesObject", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatStreamChunkPropertiesObject =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatStreamChunkPropertiesObject) {
      encoder.encodeString(value.value)
    }
  }
}
