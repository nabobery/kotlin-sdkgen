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
 * Shorthand for setting reasoning effort. Equivalent to setting reasoning.effort. Cannot be used simultaneously with
 * reasoning.effort if they differ.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/reasoning_effort
 */
@Serializable(with = InlineChatRequestReasoningEffortXe2ef18af.Serializer::class)
public sealed class InlineChatRequestReasoningEffortXe2ef18af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineChatRequestReasoningEffortXe2ef18af() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineChatRequestReasoningEffortXe2ef18af() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineChatRequestReasoningEffortXe2ef18af() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineChatRequestReasoningEffortXe2ef18af() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineChatRequestReasoningEffortXe2ef18af() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : InlineChatRequestReasoningEffortXe2ef18af() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineChatRequestReasoningEffortXe2ef18af() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatRequestReasoningEffortXe2ef18af()

  public companion object {
    public fun fromValue(`value`: String): InlineChatRequestReasoningEffortXe2ef18af = when (value) {
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

  internal object Serializer : KSerializer<InlineChatRequestReasoningEffortXe2ef18af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatRequestReasoningEffortXe2ef18af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatRequestReasoningEffortXe2ef18af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatRequestReasoningEffortXe2ef18af) {
      encoder.encodeString(value.value)
    }
  }
}
