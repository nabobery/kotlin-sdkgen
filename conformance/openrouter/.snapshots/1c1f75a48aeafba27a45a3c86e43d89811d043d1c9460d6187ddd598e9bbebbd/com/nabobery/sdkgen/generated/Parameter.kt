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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/Parameter.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Parameter
 */
@Serializable(with = Parameter.Serializer::class)
public sealed class Parameter {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `temperature`.
   */
  public data object Temperature : Parameter() {
    public override val `value`: String = "temperature"
  }

  /**
   * Documented value. Wire value: `top_p`.
   */
  public data object TopP : Parameter() {
    public override val `value`: String = "top_p"
  }

  /**
   * Documented value. Wire value: `top_k`.
   */
  public data object TopK : Parameter() {
    public override val `value`: String = "top_k"
  }

  /**
   * Documented value. Wire value: `min_p`.
   */
  public data object MinP : Parameter() {
    public override val `value`: String = "min_p"
  }

  /**
   * Documented value. Wire value: `top_a`.
   */
  public data object TopA : Parameter() {
    public override val `value`: String = "top_a"
  }

  /**
   * Documented value. Wire value: `frequency_penalty`.
   */
  public data object FrequencyPenalty : Parameter() {
    public override val `value`: String = "frequency_penalty"
  }

  /**
   * Documented value. Wire value: `presence_penalty`.
   */
  public data object PresencePenalty : Parameter() {
    public override val `value`: String = "presence_penalty"
  }

  /**
   * Documented value. Wire value: `repetition_penalty`.
   */
  public data object RepetitionPenalty : Parameter() {
    public override val `value`: String = "repetition_penalty"
  }

  /**
   * Documented value. Wire value: `max_tokens`.
   */
  public data object MaxTokens : Parameter() {
    public override val `value`: String = "max_tokens"
  }

  /**
   * Documented value. Wire value: `max_completion_tokens`.
   */
  public data object MaxCompletionTokens : Parameter() {
    public override val `value`: String = "max_completion_tokens"
  }

  /**
   * Documented value. Wire value: `logit_bias`.
   */
  public data object LogitBias : Parameter() {
    public override val `value`: String = "logit_bias"
  }

  /**
   * Documented value. Wire value: `logprobs`.
   */
  public data object Logprobs : Parameter() {
    public override val `value`: String = "logprobs"
  }

  /**
   * Documented value. Wire value: `top_logprobs`.
   */
  public data object TopLogprobs : Parameter() {
    public override val `value`: String = "top_logprobs"
  }

  /**
   * Documented value. Wire value: `prediction`.
   */
  public data object Prediction : Parameter() {
    public override val `value`: String = "prediction"
  }

  /**
   * Documented value. Wire value: `seed`.
   */
  public data object Seed : Parameter() {
    public override val `value`: String = "seed"
  }

  /**
   * Documented value. Wire value: `response_format`.
   */
  public data object ResponseFormat : Parameter() {
    public override val `value`: String = "response_format"
  }

  /**
   * Documented value. Wire value: `structured_outputs`.
   */
  public data object StructuredOutputs : Parameter() {
    public override val `value`: String = "structured_outputs"
  }

  /**
   * Documented value. Wire value: `stop`.
   */
  public data object Stop : Parameter() {
    public override val `value`: String = "stop"
  }

  /**
   * Documented value. Wire value: `tools`.
   */
  public data object Tools : Parameter() {
    public override val `value`: String = "tools"
  }

  /**
   * Documented value. Wire value: `tool_choice`.
   */
  public data object ToolChoice : Parameter() {
    public override val `value`: String = "tool_choice"
  }

  /**
   * Documented value. Wire value: `parallel_tool_calls`.
   */
  public data object ParallelToolCalls : Parameter() {
    public override val `value`: String = "parallel_tool_calls"
  }

  /**
   * Documented value. Wire value: `include_reasoning`.
   */
  public data object IncludeReasoning : Parameter() {
    public override val `value`: String = "include_reasoning"
  }

  /**
   * Documented value. Wire value: `reasoning`.
   */
  public data object Reasoning : Parameter() {
    public override val `value`: String = "reasoning"
  }

  /**
   * Documented value. Wire value: `reasoning_effort`.
   */
  public data object ReasoningEffort : Parameter() {
    public override val `value`: String = "reasoning_effort"
  }

  /**
   * Documented value. Wire value: `web_search_options`.
   */
  public data object WebSearchOptions : Parameter() {
    public override val `value`: String = "web_search_options"
  }

  /**
   * Documented value. Wire value: `verbosity`.
   */
  public data object Verbosity : Parameter() {
    public override val `value`: String = "verbosity"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : Parameter()

  public companion object {
    public fun fromValue(`value`: String): Parameter = when (value) {
      Temperature.value -> Temperature
      TopP.value -> TopP
      TopK.value -> TopK
      MinP.value -> MinP
      TopA.value -> TopA
      FrequencyPenalty.value -> FrequencyPenalty
      PresencePenalty.value -> PresencePenalty
      RepetitionPenalty.value -> RepetitionPenalty
      MaxTokens.value -> MaxTokens
      MaxCompletionTokens.value -> MaxCompletionTokens
      LogitBias.value -> LogitBias
      Logprobs.value -> Logprobs
      TopLogprobs.value -> TopLogprobs
      Prediction.value -> Prediction
      Seed.value -> Seed
      ResponseFormat.value -> ResponseFormat
      StructuredOutputs.value -> StructuredOutputs
      Stop.value -> Stop
      Tools.value -> Tools
      ToolChoice.value -> ToolChoice
      ParallelToolCalls.value -> ParallelToolCalls
      IncludeReasoning.value -> IncludeReasoning
      Reasoning.value -> Reasoning
      ReasoningEffort.value -> ReasoningEffort
      WebSearchOptions.value -> WebSearchOptions
      Verbosity.value -> Verbosity
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<Parameter> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.Parameter", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): Parameter = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: Parameter) {
      encoder.encodeString(value.value)
    }
  }
}
