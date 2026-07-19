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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items/anyOf/2/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_reference`.
   */
  public data object ToolReference : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4() {
    public override val `value`: String = "tool_reference"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4 = when (value) {
      ToolReference.value -> ToolReference
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro10072ad4) {
      encoder.encodeString(value.value)
    }
  }
}
