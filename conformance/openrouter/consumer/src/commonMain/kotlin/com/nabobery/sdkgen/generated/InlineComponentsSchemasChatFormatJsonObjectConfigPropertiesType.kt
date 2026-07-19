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
 * sdkgen://source/openapi.yaml#/components/schemas/ChatFormatJsonObjectConfig/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_object`.
   */
  public data object JsonObject : InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType() {
    public override val `value`: String = "json_object"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType =
      when (value) {
      JsonObject.value -> JsonObject
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
