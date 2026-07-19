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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/mode/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1 = when (value) {
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
