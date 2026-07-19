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
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool`.
   */
  public data object Tool : InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType() {
    public override val `value`: String = "tool"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType = when (value) {
      Tool.value -> Tool
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
