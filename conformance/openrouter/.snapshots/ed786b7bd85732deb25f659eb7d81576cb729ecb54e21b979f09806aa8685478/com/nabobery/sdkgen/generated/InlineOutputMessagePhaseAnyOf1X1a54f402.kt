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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/phase/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/phase/anyOf/0
 */
@Serializable(with = InlineOutputMessagePhaseAnyOf1X1a54f402.Serializer::class)
public sealed class InlineOutputMessagePhaseAnyOf1X1a54f402 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `commentary`.
   */
  public data object Commentary : InlineOutputMessagePhaseAnyOf1X1a54f402() {
    public override val `value`: String = "commentary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMessagePhaseAnyOf1X1a54f402()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMessagePhaseAnyOf1X1a54f402 = when (value) {
      Commentary.value -> Commentary
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessagePhaseAnyOf1X1a54f402> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputMessagePhaseAnyOf1X1a54f402", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMessagePhaseAnyOf1X1a54f402 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessagePhaseAnyOf1X1a54f402) {
      encoder.encodeString(value.value)
    }
  }
}
