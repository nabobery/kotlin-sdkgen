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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputText/properties/type
 */
@Serializable(with = InlineInputTextTypeX6c23df33.Serializer::class)
public sealed class InlineInputTextTypeX6c23df33 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_text`.
   */
  public data object InputText : InlineInputTextTypeX6c23df33() {
    public override val `value`: String = "input_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputTextTypeX6c23df33()

  public companion object {
    public fun fromValue(`value`: String): InlineInputTextTypeX6c23df33 = when (value) {
      InputText.value -> InputText
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputTextTypeX6c23df33> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineInputTextTypeX6c23df33", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputTextTypeX6c23df33 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputTextTypeX6c23df33) {
      encoder.encodeString(value.value)
    }
  }
}
