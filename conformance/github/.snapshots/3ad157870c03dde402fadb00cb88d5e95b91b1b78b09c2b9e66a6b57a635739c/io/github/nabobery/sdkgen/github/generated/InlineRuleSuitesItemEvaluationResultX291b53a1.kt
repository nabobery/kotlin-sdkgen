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
 * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating
 * whether rules would pass or fail if all rules in the rule suite were `active`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suites/items/properties/evaluation_result
 */
@Serializable(with = InlineRuleSuitesItemEvaluationResultX291b53a1.Serializer::class)
public sealed class InlineRuleSuitesItemEvaluationResultX291b53a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineRuleSuitesItemEvaluationResultX291b53a1() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineRuleSuitesItemEvaluationResultX291b53a1() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `bypass`.
   */
  public data object Bypass : InlineRuleSuitesItemEvaluationResultX291b53a1() {
    public override val `value`: String = "bypass"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRuleSuitesItemEvaluationResultX291b53a1()

  public companion object {
    public fun fromValue(`value`: String): InlineRuleSuitesItemEvaluationResultX291b53a1 = when (value) {
      Pass.value -> Pass
      Fail.value -> Fail
      Bypass.value -> Bypass
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRuleSuitesItemEvaluationResultX291b53a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRuleSuitesItemEvaluationResultX291b53a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRuleSuitesItemEvaluationResultX291b53a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuitesItemEvaluationResultX291b53a1) {
      encoder.encodeString(value.value)
    }
  }
}
