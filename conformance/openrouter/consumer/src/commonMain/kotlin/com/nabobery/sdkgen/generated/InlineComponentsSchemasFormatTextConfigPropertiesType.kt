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
 */
@Serializable(with = InlineComponentsSchemasFormatTextConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFormatTextConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineComponentsSchemasFormatTextConfigPropertiesType() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFormatTextConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFormatTextConfigPropertiesType = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFormatTextConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFormatTextConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFormatTextConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFormatTextConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
