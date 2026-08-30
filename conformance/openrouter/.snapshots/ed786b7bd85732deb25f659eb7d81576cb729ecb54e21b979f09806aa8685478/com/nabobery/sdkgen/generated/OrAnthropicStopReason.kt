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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicStopReason.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicStopReason
 */
@Serializable(with = OrAnthropicStopReason.Serializer::class)
public sealed class OrAnthropicStopReason {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `end_turn`.
   */
  public data object EndTurn : OrAnthropicStopReason() {
    public override val `value`: String = "end_turn"
  }

  /**
   * Documented value. Wire value: `max_tokens`.
   */
  public data object MaxTokens : OrAnthropicStopReason() {
    public override val `value`: String = "max_tokens"
  }

  /**
   * Documented value. Wire value: `stop_sequence`.
   */
  public data object StopSequence : OrAnthropicStopReason() {
    public override val `value`: String = "stop_sequence"
  }

  /**
   * Documented value. Wire value: `tool_use`.
   */
  public data object ToolUse : OrAnthropicStopReason() {
    public override val `value`: String = "tool_use"
  }

  /**
   * Documented value. Wire value: `pause_turn`.
   */
  public data object PauseTurn : OrAnthropicStopReason() {
    public override val `value`: String = "pause_turn"
  }

  /**
   * Documented value. Wire value: `refusal`.
   */
  public data object Refusal : OrAnthropicStopReason() {
    public override val `value`: String = "refusal"
  }

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : OrAnthropicStopReason() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : OrAnthropicStopReason()

  public companion object {
    public fun fromValue(`value`: String): OrAnthropicStopReason = when (value) {
      EndTurn.value -> EndTurn
      MaxTokens.value -> MaxTokens
      StopSequence.value -> StopSequence
      ToolUse.value -> ToolUse
      PauseTurn.value -> PauseTurn
      Refusal.value -> Refusal
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<OrAnthropicStopReason> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.OrAnthropicStopReason", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): OrAnthropicStopReason = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: OrAnthropicStopReason) {
      encoder.encodeString(value.value)
    }
  }
}
