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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message_delta`.
   */
  public data object MessageDelta : InlineComponentsSchemasMessagesDeltaEventPropertiesType() {
    public override val `value`: String = "message_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesDeltaEventPropertiesType = when (value) {
      MessageDelta.value -> MessageDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesDeltaEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
