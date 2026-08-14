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
 * The operator to use for matching.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-commit-message-pattern/properties/parameters/propert
 * ies/operator
 */
@Serializable(with = InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a.Serializer::class)
public sealed class InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `starts_with`.
   */
  public data object StartsWith : InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a() {
    public override val `value`: String = "starts_with"
  }

  /**
   * Documented value. Wire value: `ends_with`.
   */
  public data object EndsWith : InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a() {
    public override val `value`: String = "ends_with"
  }

  /**
   * Documented value. Wire value: `contains`.
   */
  public data object Contains : InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a() {
    public override val `value`: String = "contains"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a() {
    public override val `value`: String = "regex"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a = when (value) {
      StartsWith.value -> StartsWith
      EndsWith.value -> EndsWith
      Contains.value -> Contains
      Regex.value -> Regex
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCommitMessagePatternParametersOperatorX4421979a) {
      encoder.encodeString(value.value)
    }
  }
}
