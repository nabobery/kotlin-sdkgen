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
 * Controls which reasoning is available to the model. `auto` uses the model default (same as omitting); `all_turns`
 * includes reasoning from earlier turns passed in input; `current_turn` limits to the current turn only. Only supported
 * by OpenAI GPT-5.6 and newer.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningContext
 */
@Serializable(with = ReasoningContext.Serializer::class)
public sealed class ReasoningContext {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : ReasoningContext() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `all_turns`.
   */
  public data object AllTurns : ReasoningContext() {
    public override val `value`: String = "all_turns"
  }

  /**
   * Documented value. Wire value: `current_turn`.
   */
  public data object CurrentTurn : ReasoningContext() {
    public override val `value`: String = "current_turn"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ReasoningContext()

  public companion object {
    public fun fromValue(`value`: String): ReasoningContext = when (value) {
      Auto.value -> Auto
      AllTurns.value -> AllTurns
      CurrentTurn.value -> CurrentTurn
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ReasoningContext> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.ReasoningContext", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ReasoningContext = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ReasoningContext) {
      encoder.encodeString(value.value)
    }
  }
}
