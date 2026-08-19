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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/mode/anyOf/0
 */
@Serializable(with = InlineToolChoiceAllowedModeAnyOf1Xd1439a46.Serializer::class)
public sealed class InlineToolChoiceAllowedModeAnyOf1Xd1439a46 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineToolChoiceAllowedModeAnyOf1Xd1439a46() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineToolChoiceAllowedModeAnyOf1Xd1439a46()

  public companion object {
    public fun fromValue(`value`: String): InlineToolChoiceAllowedModeAnyOf1Xd1439a46 = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineToolChoiceAllowedModeAnyOf1Xd1439a46> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineToolChoiceAllowedModeAnyOf1Xd1439a46", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineToolChoiceAllowedModeAnyOf1Xd1439a46 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineToolChoiceAllowedModeAnyOf1Xd1439a46) {
      encoder.encodeString(value.value)
    }
  }
}
