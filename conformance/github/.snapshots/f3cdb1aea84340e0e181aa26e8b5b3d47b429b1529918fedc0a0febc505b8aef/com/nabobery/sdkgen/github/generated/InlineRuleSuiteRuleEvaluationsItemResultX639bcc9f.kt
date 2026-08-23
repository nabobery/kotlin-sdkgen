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
 * The result of the evaluation of the individual rule.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/rule_evaluations/items/properties/result
 */
@Serializable(with = InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f.Serializer::class)
public sealed class InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f() {
    public override val `value`: String = "fail"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f()

  public companion object {
    public fun fromValue(`value`: String): InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f = when (value) {
      Pass.value -> Pass
      Fail.value -> Fail
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteRuleEvaluationsItemResultX639bcc9f) {
      encoder.encodeString(value.value)
    }
  }
}
