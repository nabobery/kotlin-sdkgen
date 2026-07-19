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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStopEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_stop`.
   */
  public data object ContentBlockStop : InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType() {
    public override val `value`: String = "content_block_stop"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType =
      when (value) {
      ContentBlockStop.value -> ContentBlockStop
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockStopEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
