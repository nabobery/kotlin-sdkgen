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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType = when (value) {
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
