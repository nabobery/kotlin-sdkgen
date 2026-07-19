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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorResponse/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesErrorResponsePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesErrorResponsePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineComponentsSchemasMessagesErrorResponsePropertiesType() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesErrorResponsePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesErrorResponsePropertiesType = when (value) {
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesErrorResponsePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesErrorResponsePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesErrorResponsePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesErrorResponsePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
