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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/format/properties/type.
 */
@Serializable(with = InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_schema`.
   */
  public data object JsonSchema : InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType() {
    public override val `value`: String = "json_schema"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType =
      when (value) {
      JsonSchema.value -> JsonSchema
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesOutputConfigPropertiesFormatPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
