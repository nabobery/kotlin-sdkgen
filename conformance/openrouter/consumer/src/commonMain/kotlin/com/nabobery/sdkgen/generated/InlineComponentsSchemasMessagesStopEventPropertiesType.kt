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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesStopEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesStopEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesStopEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message_stop`.
   */
  public data object MessageStop : InlineComponentsSchemasMessagesStopEventPropertiesType() {
    public override val `value`: String = "message_stop"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesStopEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesStopEventPropertiesType = when (value) {
      MessageStop.value -> MessageStop
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesStopEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesStopEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesStopEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesStopEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
