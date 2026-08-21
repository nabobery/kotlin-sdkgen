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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-tag-name-pattern/properties/parameters/properties/op
 * erator
 */
@Serializable(with = InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e.Serializer::class)
public sealed class InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `starts_with`.
   */
  public data object StartsWith : InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e() {
    public override val `value`: String = "starts_with"
  }

  /**
   * Documented value. Wire value: `ends_with`.
   */
  public data object EndsWith : InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e() {
    public override val `value`: String = "ends_with"
  }

  /**
   * Documented value. Wire value: `contains`.
   */
  public data object Contains : InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e() {
    public override val `value`: String = "contains"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e() {
    public override val `value`: String = "regex"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e = when (value) {
      StartsWith.value -> StartsWith
      EndsWith.value -> EndsWith
      Contains.value -> Contains
      Regex.value -> Regex
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleTagNamePatternParametersOperatorXd290f36e) {
      encoder.encodeString(value.value)
    }
  }
}
