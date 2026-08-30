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
 * Reasoning effort level for the subagent call.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SubagentReasoning/properties/effort
 */
@Serializable(with = InlineSubagentReasoningEffortX3a457c87.Serializer::class)
public sealed class InlineSubagentReasoningEffortX3a457c87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineSubagentReasoningEffortX3a457c87() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineSubagentReasoningEffortX3a457c87() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineSubagentReasoningEffortX3a457c87() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineSubagentReasoningEffortX3a457c87() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineSubagentReasoningEffortX3a457c87() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : InlineSubagentReasoningEffortX3a457c87() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineSubagentReasoningEffortX3a457c87() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubagentReasoningEffortX3a457c87()

  public companion object {
    public fun fromValue(`value`: String): InlineSubagentReasoningEffortX3a457c87 = when (value) {
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

  internal object Serializer : KSerializer<InlineSubagentReasoningEffortX3a457c87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineSubagentReasoningEffortX3a457c87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubagentReasoningEffortX3a457c87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubagentReasoningEffortX3a457c87) {
      encoder.encodeString(value.value)
    }
  }
}
