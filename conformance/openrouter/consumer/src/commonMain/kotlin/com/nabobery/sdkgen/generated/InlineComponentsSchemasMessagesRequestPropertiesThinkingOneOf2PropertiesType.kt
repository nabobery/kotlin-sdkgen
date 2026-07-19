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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/2/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adaptive`.
   */
  public data object Adaptive : InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType() {
    public override val `value`: String = "adaptive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType = when (value) {
      Adaptive.value -> Adaptive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
