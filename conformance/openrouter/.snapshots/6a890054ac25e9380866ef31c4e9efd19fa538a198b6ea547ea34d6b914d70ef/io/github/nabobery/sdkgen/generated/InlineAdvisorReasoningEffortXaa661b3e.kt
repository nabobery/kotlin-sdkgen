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
 * Reasoning effort level for the advisor call.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AdvisorReasoning/properties/effort
 */
@Serializable(with = InlineAdvisorReasoningEffortXaa661b3e.Serializer::class)
public sealed class InlineAdvisorReasoningEffortXaa661b3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineAdvisorReasoningEffortXaa661b3e() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineAdvisorReasoningEffortXaa661b3e() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineAdvisorReasoningEffortXaa661b3e() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineAdvisorReasoningEffortXaa661b3e() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineAdvisorReasoningEffortXaa661b3e() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : InlineAdvisorReasoningEffortXaa661b3e() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineAdvisorReasoningEffortXaa661b3e() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAdvisorReasoningEffortXaa661b3e()

  public companion object {
    public fun fromValue(`value`: String): InlineAdvisorReasoningEffortXaa661b3e = when (value) {
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

  internal object Serializer : KSerializer<InlineAdvisorReasoningEffortXaa661b3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAdvisorReasoningEffortXaa661b3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAdvisorReasoningEffortXaa661b3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAdvisorReasoningEffortXaa661b3e) {
      encoder.encodeString(value.value)
    }
  }
}
