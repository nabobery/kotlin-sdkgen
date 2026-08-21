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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/rule-suite-result/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/rule-suite-result/schema
 */
@Serializable(with = InlineRuleSuiteResultParameterX50a8829c.Serializer::class)
public sealed class InlineRuleSuiteResultParameterX50a8829c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineRuleSuiteResultParameterX50a8829c() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineRuleSuiteResultParameterX50a8829c() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `bypass`.
   */
  public data object Bypass : InlineRuleSuiteResultParameterX50a8829c() {
    public override val `value`: String = "bypass"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineRuleSuiteResultParameterX50a8829c() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRuleSuiteResultParameterX50a8829c()

  public companion object {
    public fun fromValue(`value`: String): InlineRuleSuiteResultParameterX50a8829c = when (value) {
      Pass.value -> Pass
      Fail.value -> Fail
      Bypass.value -> Bypass
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRuleSuiteResultParameterX50a8829c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRuleSuiteResultParameterX50a8829c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRuleSuiteResultParameterX50a8829c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteResultParameterX50a8829c) {
      encoder.encodeString(value.value)
    }
  }
}
