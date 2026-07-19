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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/1/properties/t
 * ype.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_json_delta`.
   */
  public data object InputJsonDelta : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType() {
    public override val `value`: String = "input_json_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType = when (value) {
      InputJsonDelta.value -> InputJsonDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
