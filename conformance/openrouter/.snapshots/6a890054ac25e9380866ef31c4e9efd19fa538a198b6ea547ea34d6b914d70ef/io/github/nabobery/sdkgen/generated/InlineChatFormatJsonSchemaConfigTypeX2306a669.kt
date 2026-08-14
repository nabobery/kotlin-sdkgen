package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ChatFormatJsonSchemaConfig/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatJsonSchemaConfig/properties/type
 */
@Serializable(with = InlineChatFormatJsonSchemaConfigTypeX2306a669.Serializer::class)
public sealed class InlineChatFormatJsonSchemaConfigTypeX2306a669 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_schema`.
   */
  public data object JsonSchema : InlineChatFormatJsonSchemaConfigTypeX2306a669() {
    public override val `value`: String = "json_schema"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatFormatJsonSchemaConfigTypeX2306a669()

  public companion object {
    public fun fromValue(`value`: String): InlineChatFormatJsonSchemaConfigTypeX2306a669 = when (value) {
      JsonSchema.value -> JsonSchema
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatFormatJsonSchemaConfigTypeX2306a669> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatFormatJsonSchemaConfigTypeX2306a669", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatFormatJsonSchemaConfigTypeX2306a669 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatFormatJsonSchemaConfigTypeX2306a669) {
      encoder.encodeString(value.value)
    }
  }
}
