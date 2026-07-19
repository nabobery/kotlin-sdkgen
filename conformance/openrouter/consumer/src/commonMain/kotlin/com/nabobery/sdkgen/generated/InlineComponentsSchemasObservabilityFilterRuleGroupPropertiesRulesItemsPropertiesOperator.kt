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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/rules/items/properties/opera
 * tor.
 */
@Serializable(with = InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator
  .Serializer::class)
public sealed class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `equals`.
   */
  public data object Equals : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "equals"
  }

  /**
   * Documented value. Wire value: `not_equals`.
   */
  public data object NotEquals : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "not_equals"
  }

  /**
   * Documented value. Wire value: `contains`.
   */
  public data object Contains : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "contains"
  }

  /**
   * Documented value. Wire value: `not_contains`.
   */
  public data object NotContains : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "not_contains"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "regex"
  }

  /**
   * Documented value. Wire value: `starts_with`.
   */
  public data object StartsWith : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "starts_with"
  }

  /**
   * Documented value. Wire value: `ends_with`.
   */
  public data object EndsWith : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "ends_with"
  }

  /**
   * Documented value. Wire value: `gt`.
   */
  public data object Gt : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "gt"
  }

  /**
   * Documented value. Wire value: `lt`.
   */
  public data object Lt : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "lt"
  }

  /**
   * Documented value. Wire value: `gte`.
   */
  public data object Gte : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "gte"
  }

  /**
   * Documented value. Wire value: `lte`.
   */
  public data object Lte : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "lte"
  }

  /**
   * Documented value. Wire value: `exists`.
   */
  public data object Exists : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "exists"
  }

  /**
   * Documented value. Wire value: `not_exists`.
   */
  public data object NotExists : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator() {
    public override val `value`: String = "not_exists"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator = when (value) {
      Equals.value -> Equals
      NotEquals.value -> NotEquals
      Contains.value -> Contains
      NotContains.value -> NotContains
      Regex.value -> Regex
      StartsWith.value -> StartsWith
      EndsWith.value -> EndsWith
      Gt.value -> Gt
      Lt.value -> Lt
      Gte.value -> Gte
      Lte.value -> Lte
      Exists.value -> Exists
      NotExists.value -> NotExists
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator) {
      encoder.encodeString(value.value)
    }
  }
}
