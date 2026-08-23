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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FormatTextConfig/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FormatTextConfig/properties/type
 */
@Serializable(with = InlineFormatTextConfigTypeX219eccdd.Serializer::class)
public sealed class InlineFormatTextConfigTypeX219eccdd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineFormatTextConfigTypeX219eccdd() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFormatTextConfigTypeX219eccdd()

  public companion object {
    public fun fromValue(`value`: String): InlineFormatTextConfigTypeX219eccdd = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFormatTextConfigTypeX219eccdd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFormatTextConfigTypeX219eccdd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFormatTextConfigTypeX219eccdd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFormatTextConfigTypeX219eccdd) {
      encoder.encodeString(value.value)
    }
  }
}
