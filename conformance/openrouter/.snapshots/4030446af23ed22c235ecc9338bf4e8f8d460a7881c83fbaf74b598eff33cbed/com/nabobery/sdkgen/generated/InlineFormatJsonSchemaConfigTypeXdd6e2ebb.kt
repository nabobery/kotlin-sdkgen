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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FormatJsonSchemaConfig/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FormatJsonSchemaConfig/properties/type
 */
@Serializable(with = InlineFormatJsonSchemaConfigTypeXdd6e2ebb.Serializer::class)
public sealed class InlineFormatJsonSchemaConfigTypeXdd6e2ebb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_schema`.
   */
  public data object JsonSchema : InlineFormatJsonSchemaConfigTypeXdd6e2ebb() {
    public override val `value`: String = "json_schema"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFormatJsonSchemaConfigTypeXdd6e2ebb()

  public companion object {
    public fun fromValue(`value`: String): InlineFormatJsonSchemaConfigTypeXdd6e2ebb = when (value) {
      JsonSchema.value -> JsonSchema
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFormatJsonSchemaConfigTypeXdd6e2ebb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFormatJsonSchemaConfigTypeXdd6e2ebb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFormatJsonSchemaConfigTypeXdd6e2ebb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFormatJsonSchemaConfigTypeXdd6e2ebb) {
      encoder.encodeString(value.value)
    }
  }
}
