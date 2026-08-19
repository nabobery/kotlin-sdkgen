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
 * Constrains effort on reasoning for reasoning models
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/reasoning/properties/effort
 */
@Serializable(with = InlineChatRequestReasoningEffortX13ba2bc5.Serializer::class)
public sealed class InlineChatRequestReasoningEffortX13ba2bc5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineChatRequestReasoningEffortX13ba2bc5() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineChatRequestReasoningEffortX13ba2bc5() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineChatRequestReasoningEffortX13ba2bc5() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineChatRequestReasoningEffortX13ba2bc5() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineChatRequestReasoningEffortX13ba2bc5() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : InlineChatRequestReasoningEffortX13ba2bc5() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineChatRequestReasoningEffortX13ba2bc5() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatRequestReasoningEffortX13ba2bc5()

  public companion object {
    public fun fromValue(`value`: String): InlineChatRequestReasoningEffortX13ba2bc5 = when (value) {
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

  internal object Serializer : KSerializer<InlineChatRequestReasoningEffortX13ba2bc5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatRequestReasoningEffortX13ba2bc5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatRequestReasoningEffortX13ba2bc5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatRequestReasoningEffortX13ba2bc5) {
      encoder.encodeString(value.value)
    }
  }
}
