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
 * sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/0/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/0/properties/type
 */
@Serializable(with = InlineCustomToolFormatAnyOf1TypeX7b071c68.Serializer::class)
public sealed class InlineCustomToolFormatAnyOf1TypeX7b071c68 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineCustomToolFormatAnyOf1TypeX7b071c68() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomToolFormatAnyOf1TypeX7b071c68()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomToolFormatAnyOf1TypeX7b071c68 = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomToolFormatAnyOf1TypeX7b071c68> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCustomToolFormatAnyOf1TypeX7b071c68", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomToolFormatAnyOf1TypeX7b071c68 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolFormatAnyOf1TypeX7b071c68) {
      encoder.encodeString(value.value)
    }
  }
}
