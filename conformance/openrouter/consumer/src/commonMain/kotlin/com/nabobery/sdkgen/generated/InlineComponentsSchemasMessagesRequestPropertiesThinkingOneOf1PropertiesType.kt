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
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType = when (value) {
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
