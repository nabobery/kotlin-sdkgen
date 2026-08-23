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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FormatJsonObjectConfig/properties/type
 */
@Serializable(with = InlineFormatJsonObjectConfigTypeXcd522ef8.Serializer::class)
public sealed class InlineFormatJsonObjectConfigTypeXcd522ef8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_object`.
   */
  public data object JsonObject : InlineFormatJsonObjectConfigTypeXcd522ef8() {
    public override val `value`: String = "json_object"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFormatJsonObjectConfigTypeXcd522ef8()

  public companion object {
    public fun fromValue(`value`: String): InlineFormatJsonObjectConfigTypeXcd522ef8 = when (value) {
      JsonObject.value -> JsonObject
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFormatJsonObjectConfigTypeXcd522ef8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFormatJsonObjectConfigTypeXcd522ef8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFormatJsonObjectConfigTypeXcd522ef8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFormatJsonObjectConfigTypeXcd522ef8) {
      encoder.encodeString(value.value)
    }
  }
}
