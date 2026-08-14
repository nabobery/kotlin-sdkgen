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
 * The result of the rule evaluations for rules with the `active` enforcement status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite/properties/result
 */
@Serializable(with = InlineRuleSuiteResultX0396aaab.Serializer::class)
public sealed class InlineRuleSuiteResultX0396aaab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineRuleSuiteResultX0396aaab() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineRuleSuiteResultX0396aaab() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `bypass`.
   */
  public data object Bypass : InlineRuleSuiteResultX0396aaab() {
    public override val `value`: String = "bypass"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRuleSuiteResultX0396aaab()

  public companion object {
    public fun fromValue(`value`: String): InlineRuleSuiteResultX0396aaab = when (value) {
      Pass.value -> Pass
      Fail.value -> Fail
      Bypass.value -> Bypass
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRuleSuiteResultX0396aaab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRuleSuiteResultX0396aaab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRuleSuiteResultX0396aaab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuiteResultX0396aaab) {
      encoder.encodeString(value.value)
    }
  }
}
