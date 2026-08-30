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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/1/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/1/properties/type
 */
@Serializable(with = InlineMessagesRequestThinkingOneOf2TypeX650a8d42.Serializer::class)
public sealed class InlineMessagesRequestThinkingOneOf2TypeX650a8d42 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineMessagesRequestThinkingOneOf2TypeX650a8d42() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestThinkingOneOf2TypeX650a8d42()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestThinkingOneOf2TypeX650a8d42 = when (value) {
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestThinkingOneOf2TypeX650a8d42> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestThinkingOneOf2TypeX650a8d42", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestThinkingOneOf2TypeX650a8d42 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestThinkingOneOf2TypeX650a8d42) {
      encoder.encodeString(value.value)
    }
  }
}
