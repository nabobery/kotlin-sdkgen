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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/6/proper
 * ties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `redacted_thinking`.
   */
  public data object RedactedThinking : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de() {
    public override val `value`: String = "redacted_thinking"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de = when (value) {
      RedactedThinking.value -> RedactedThinking
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de) {
      encoder.encodeString(value.value)
    }
  }
}
