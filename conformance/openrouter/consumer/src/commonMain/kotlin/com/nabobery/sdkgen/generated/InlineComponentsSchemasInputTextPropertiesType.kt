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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputText/properties/type.
 */
@Serializable(with = InlineComponentsSchemasInputTextPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasInputTextPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_text`.
   */
  public data object InputText : InlineComponentsSchemasInputTextPropertiesType() {
    public override val `value`: String = "input_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputTextPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputTextPropertiesType = when (value) {
      InputText.value -> InputText
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputTextPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputTextPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputTextPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputTextPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
