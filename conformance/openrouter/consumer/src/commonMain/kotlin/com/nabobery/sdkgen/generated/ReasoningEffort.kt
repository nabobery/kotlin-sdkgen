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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningEffort.
 */
@Serializable(with = ReasoningEffort.Serializer::class)
public sealed class ReasoningEffort {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : ReasoningEffort() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : ReasoningEffort() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : ReasoningEffort() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : ReasoningEffort() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : ReasoningEffort() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : ReasoningEffort() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : ReasoningEffort() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ReasoningEffort()

  public companion object {
    public fun fromValue(`value`: String): ReasoningEffort = when (value) {
      Max.value -> Max
      Xhigh.value -> Xhigh
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      Minimal.value -> Minimal
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<ReasoningEffort> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ReasoningEffort", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ReasoningEffort = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ReasoningEffort) {
      encoder.encodeString(value.value)
    }
  }
}
