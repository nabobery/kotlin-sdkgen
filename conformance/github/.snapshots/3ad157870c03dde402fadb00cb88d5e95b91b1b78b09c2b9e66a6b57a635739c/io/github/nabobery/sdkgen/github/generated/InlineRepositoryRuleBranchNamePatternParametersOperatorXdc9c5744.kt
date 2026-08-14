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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-branch-name-pattern/properties/parameters/properties
 * /operator
 */
@Serializable(with = InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744.Serializer::class)
public sealed class InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `starts_with`.
   */
  public data object StartsWith : InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744() {
    public override val `value`: String = "starts_with"
  }

  /**
   * Documented value. Wire value: `ends_with`.
   */
  public data object EndsWith : InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744() {
    public override val `value`: String = "ends_with"
  }

  /**
   * Documented value. Wire value: `contains`.
   */
  public data object Contains : InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744() {
    public override val `value`: String = "contains"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744() {
    public override val `value`: String = "regex"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744 = when (value) {
      StartsWith.value -> StartsWith
      EndsWith.value -> EndsWith
      Contains.value -> Contains
      Regex.value -> Regex
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleBranchNamePatternParametersOperatorXdc9c5744) {
      encoder.encodeString(value.value)
    }
  }
}
