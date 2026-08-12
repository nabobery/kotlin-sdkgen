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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase/anyOf/0
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612.Serializer::class)
public sealed class InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commentary`.
   */
  public data object Commentary : InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612() {
    public override val `value`: String = "commentary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612 = when (value) {
      Commentary.value -> Commentary
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612) {
      encoder.encodeString(value.value)
    }
  }
}
