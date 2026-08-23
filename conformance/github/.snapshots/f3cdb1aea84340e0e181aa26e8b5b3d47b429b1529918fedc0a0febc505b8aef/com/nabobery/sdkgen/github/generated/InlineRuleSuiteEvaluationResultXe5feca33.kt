package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating
 * whether rules would pass or fail if all rules in the rule suite were `active`. Null if no rules with `evaluate`
 * enforcement status were run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/evaluation_result
 */
@Serializable(with = InlineRuleSuiteEvaluationResultXe5feca33.Serializer::class)
public sealed class InlineRuleSuiteEvaluationResultXe5feca33 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineRuleSuiteEvaluationResultXe5feca33() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineRuleSuiteEvaluationResultXe5feca33() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `bypass`.
   */
  public data object Bypass : InlineRuleSuiteEvaluationResultXe5feca33() {
    public override val `value`: String = "bypass"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRuleSuiteEvaluationResultXe5feca33()

  public companion object {
    public fun fromValue(`value`: String): InlineRuleSuiteEvaluationResultXe5feca33 = when (value) {
      Pass.value -> Pass
      Fail.value -> Fail
      Bypass.value -> Bypass
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRuleSuiteEvaluationResultXe5feca33> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRuleSuiteEvaluationResultXe5feca33", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRuleSuiteEvaluationResultXe5feca33 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteEvaluationResultXe5feca33) {
      encoder.encodeString(value.value)
    }
  }
}
