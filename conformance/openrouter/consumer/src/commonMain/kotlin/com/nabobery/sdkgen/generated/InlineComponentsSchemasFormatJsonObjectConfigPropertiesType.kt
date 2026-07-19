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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FormatJsonObjectConfig/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFormatJsonObjectConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFormatJsonObjectConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_object`.
   */
  public data object JsonObject : InlineComponentsSchemasFormatJsonObjectConfigPropertiesType() {
    public override val `value`: String = "json_object"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFormatJsonObjectConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFormatJsonObjectConfigPropertiesType = when (value) {
      JsonObject.value -> JsonObject
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFormatJsonObjectConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFormatJsonObjectConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFormatJsonObjectConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFormatJsonObjectConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
