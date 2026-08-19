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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningSummaryVerbosity.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningSummaryVerbosity
 */
@Serializable(with = ReasoningSummaryVerbosity.Serializer::class)
public sealed class ReasoningSummaryVerbosity {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : ReasoningSummaryVerbosity() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `concise`.
   */
  public data object Concise : ReasoningSummaryVerbosity() {
    public override val `value`: String = "concise"
  }

  /**
   * Documented value. Wire value: `detailed`.
   */
  public data object Detailed : ReasoningSummaryVerbosity() {
    public override val `value`: String = "detailed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ReasoningSummaryVerbosity()

  public companion object {
    public fun fromValue(`value`: String): ReasoningSummaryVerbosity = when (value) {
      Auto.value -> Auto
      Concise.value -> Concise
      Detailed.value -> Detailed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ReasoningSummaryVerbosity> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ReasoningSummaryVerbosity", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ReasoningSummaryVerbosity = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ReasoningSummaryVerbosity) {
      encoder.encodeString(value.value)
    }
  }
}
