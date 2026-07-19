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
 * sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/mode/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0 = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasToolChoiceAllowedPropertiesModeAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
