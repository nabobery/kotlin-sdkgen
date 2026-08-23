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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/3/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/3/properties/type
 */
@Serializable(with = InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968.Serializer::class)
public sealed class InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool`.
   */
  public data object Tool : InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968() {
    public override val `value`: String = "tool"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968 = when (value) {
      Tool.value -> Tool
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968) {
      encoder.encodeString(value.value)
    }
  }
}
