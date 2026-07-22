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
 * The operator to use for matching.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-committer-email-pattern/properties/parameters/proper
 * ties/operator
 */
@Serializable(with = InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0.Serializer::class)
public sealed class InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `starts_with`.
   */
  public data object StartsWith : InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0() {
    public override val `value`: String = "starts_with"
  }

  /**
   * Documented value. Wire value: `ends_with`.
   */
  public data object EndsWith : InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0() {
    public override val `value`: String = "ends_with"
  }

  /**
   * Documented value. Wire value: `contains`.
   */
  public data object Contains : InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0() {
    public override val `value`: String = "contains"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0() {
    public override val `value`: String = "regex"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0 = when (value) {
      StartsWith.value -> StartsWith
      EndsWith.value -> EndsWith
      Contains.value -> Contains
      Regex.value -> Regex
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitterEmailPatternParametersOperatorX732607d0) {
      encoder.encodeString(value.value)
    }
  }
}
