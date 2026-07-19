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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/0/properties/t
 * ype.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_delta`.
   */
  public data object TextDelta : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType() {
    public override val `value`: String = "text_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType = when (value) {
      TextDelta.value -> TextDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
