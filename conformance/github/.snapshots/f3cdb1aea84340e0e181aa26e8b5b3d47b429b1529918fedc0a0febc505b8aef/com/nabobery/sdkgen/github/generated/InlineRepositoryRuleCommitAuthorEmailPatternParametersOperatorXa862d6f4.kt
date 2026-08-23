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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-author-email-pattern/properties/parameters/pr
 * operties/operator
 */
@Serializable(with = InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4.Serializer::class)
public sealed class InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `starts_with`.
   */
  public data object StartsWith : InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4() {
    public override val `value`: String = "starts_with"
  }

  /**
   * Documented value. Wire value: `ends_with`.
   */
  public data object EndsWith : InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4() {
    public override val `value`: String = "ends_with"
  }

  /**
   * Documented value. Wire value: `contains`.
   */
  public data object Contains : InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4() {
    public override val `value`: String = "contains"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4() {
    public override val `value`: String = "regex"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4 = when (value) {
      StartsWith.value -> StartsWith
      EndsWith.value -> EndsWith
      Contains.value -> Contains
      Regex.value -> Regex
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitAuthorEmailPatternParametersOperatorXa862d6f4) {
      encoder.encodeString(value.value)
    }
  }
}
