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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/mode/anyOf/1
 */
@Serializable(with = InlineToolChoiceAllowedModeAnyOf2Xd9d0df50.Serializer::class)
public sealed class InlineToolChoiceAllowedModeAnyOf2Xd9d0df50 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineToolChoiceAllowedModeAnyOf2Xd9d0df50() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineToolChoiceAllowedModeAnyOf2Xd9d0df50()

  public companion object {
    public fun fromValue(`value`: String): InlineToolChoiceAllowedModeAnyOf2Xd9d0df50 = when (value) {
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineToolChoiceAllowedModeAnyOf2Xd9d0df50> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineToolChoiceAllowedModeAnyOf2Xd9d0df50", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineToolChoiceAllowedModeAnyOf2Xd9d0df50 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineToolChoiceAllowedModeAnyOf2Xd9d0df50) {
      encoder.encodeString(value.value)
    }
  }
}
