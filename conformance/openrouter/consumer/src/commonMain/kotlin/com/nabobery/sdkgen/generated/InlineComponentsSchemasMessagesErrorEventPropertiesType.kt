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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesErrorEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesErrorEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineComponentsSchemasMessagesErrorEventPropertiesType() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesErrorEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesErrorEventPropertiesType = when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesErrorEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesErrorEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesErrorEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesErrorEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
