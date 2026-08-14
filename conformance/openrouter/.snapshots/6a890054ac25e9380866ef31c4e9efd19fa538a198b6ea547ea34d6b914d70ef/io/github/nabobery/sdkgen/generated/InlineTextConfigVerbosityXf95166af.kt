package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/TextConfig/properties/verbosity.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TextConfig/properties/verbosity
 */
@Serializable(with = InlineTextConfigVerbosityXf95166af.Serializer::class)
public sealed class InlineTextConfigVerbosityXf95166af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineTextConfigVerbosityXf95166af() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineTextConfigVerbosityXf95166af() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineTextConfigVerbosityXf95166af() {
    public override val `value`: String = "medium"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTextConfigVerbosityXf95166af()

  public companion object {
    public fun fromValue(`value`: String): InlineTextConfigVerbosityXf95166af = when (value) {
      High.value -> High
      Low.value -> Low
      Medium.value -> Medium
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTextConfigVerbosityXf95166af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineTextConfigVerbosityXf95166af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTextConfigVerbosityXf95166af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTextConfigVerbosityXf95166af) {
      encoder.encodeString(value.value)
    }
  }
}
