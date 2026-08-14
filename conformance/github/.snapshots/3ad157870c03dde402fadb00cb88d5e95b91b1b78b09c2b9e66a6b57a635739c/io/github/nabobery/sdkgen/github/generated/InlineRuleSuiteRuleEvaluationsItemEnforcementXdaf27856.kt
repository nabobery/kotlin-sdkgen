package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The enforcement level of this rule source.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/rule_evaluations/items/properties/enforcement
 */
@Serializable(with = InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856.Serializer::class)
public sealed class InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `evaluate`.
   */
  public data object Evaluate : InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856() {
    public override val `value`: String = "evaluate"
  }

  /**
   * Documented value. Wire value: `deleted ruleset`.
   */
  public data object DeletedRuleset : InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856() {
    public override val `value`: String = "deleted ruleset"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856()

  public companion object {
    public fun fromValue(`value`: String): InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856 = when (value) {
      Active.value -> Active
      Evaluate.value -> Evaluate
      DeletedRuleset.value -> DeletedRuleset
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteRuleEvaluationsItemEnforcementXdaf27856) {
      encoder.encodeString(value.value)
    }
  }
}
