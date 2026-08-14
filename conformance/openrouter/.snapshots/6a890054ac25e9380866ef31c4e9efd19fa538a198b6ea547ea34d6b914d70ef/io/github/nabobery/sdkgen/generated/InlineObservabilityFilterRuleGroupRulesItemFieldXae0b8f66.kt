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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/rules/items/properties/field
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/rules/items/properties/field
 */
@Serializable(with = InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66.Serializer::class)
public sealed class InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `model`.
   */
  public data object Model : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "model"
  }

  /**
   * Documented value. Wire value: `provider`.
   */
  public data object Provider : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "provider"
  }

  /**
   * Documented value. Wire value: `session_id`.
   */
  public data object SessionId : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "session_id"
  }

  /**
   * Documented value. Wire value: `user_id`.
   */
  public data object UserId : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "user_id"
  }

  /**
   * Documented value. Wire value: `api_key_name`.
   */
  public data object ApiKeyName : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "api_key_name"
  }

  /**
   * Documented value. Wire value: `finish_reason`.
   */
  public data object FinishReason : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "finish_reason"
  }

  /**
   * Documented value. Wire value: `input`.
   */
  public data object Input : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "input"
  }

  /**
   * Documented value. Wire value: `output`.
   */
  public data object Output : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "output"
  }

  /**
   * Documented value. Wire value: `total_cost`.
   */
  public data object TotalCost : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "total_cost"
  }

  /**
   * Documented value. Wire value: `total_tokens`.
   */
  public data object TotalTokens : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "total_tokens"
  }

  /**
   * Documented value. Wire value: `prompt_tokens`.
   */
  public data object PromptTokens : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "prompt_tokens"
  }

  /**
   * Documented value. Wire value: `completion_tokens`.
   */
  public data object CompletionTokens : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66() {
    public override val `value`: String = "completion_tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66 = when (value) {
      Model.value -> Model
      Provider.value -> Provider
      SessionId.value -> SessionId
      UserId.value -> UserId
      ApiKeyName.value -> ApiKeyName
      FinishReason.value -> FinishReason
      Input.value -> Input
      Output.value -> Output
      TotalCost.value -> TotalCost
      TotalTokens.value -> TotalTokens
      PromptTokens.value -> PromptTokens
      CompletionTokens.value -> CompletionTokens
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66) {
      encoder.encodeString(value.value)
    }
  }
}
