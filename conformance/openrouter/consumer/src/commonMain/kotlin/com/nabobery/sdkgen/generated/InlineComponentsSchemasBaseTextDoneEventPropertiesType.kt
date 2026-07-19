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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseTextDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseTextDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseTextDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_text.done`.
   */
  public data object ResponseOutputTextDone : InlineComponentsSchemasBaseTextDoneEventPropertiesType() {
    public override val `value`: String = "response.output_text.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseTextDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseTextDoneEventPropertiesType = when (value) {
      ResponseOutputTextDone.value -> ResponseOutputTextDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseTextDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseTextDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseTextDoneEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseTextDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
