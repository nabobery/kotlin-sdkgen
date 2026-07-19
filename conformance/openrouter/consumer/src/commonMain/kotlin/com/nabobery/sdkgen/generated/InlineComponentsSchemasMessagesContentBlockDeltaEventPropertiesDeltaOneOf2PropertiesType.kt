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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/2/properties/t
 * ype.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `thinking_delta`.
   */
  public data object ThinkingDelta : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType() {
    public override val `value`: String = "thinking_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType = when (value) {
      ThinkingDelta.value -> ThinkingDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
