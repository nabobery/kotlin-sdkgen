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
 * The category of the rule used to detect the finding.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-finding-rule/properties/category
 */
@Serializable(with = InlineCodeQualityFindingRuleCategoryXc5efce73.Serializer::class)
public sealed class InlineCodeQualityFindingRuleCategoryXc5efce73 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineCodeQualityFindingRuleCategoryXc5efce73() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `maintainability`.
   */
  public data object Maintainability : InlineCodeQualityFindingRuleCategoryXc5efce73() {
    public override val `value`: String = "maintainability"
  }

  /**
   * Documented value. Wire value: `reliability`.
   */
  public data object Reliability : InlineCodeQualityFindingRuleCategoryXc5efce73() {
    public override val `value`: String = "reliability"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualityFindingRuleCategoryXc5efce73()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualityFindingRuleCategoryXc5efce73 = when (value) {
      None.value -> None
      Maintainability.value -> Maintainability
      Reliability.value -> Reliability
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeQualityFindingRuleCategoryXc5efce73> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeQualityFindingRuleCategoryXc5efce73", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualityFindingRuleCategoryXc5efce73 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualityFindingRuleCategoryXc5efce73) {
      encoder.encodeString(value.value)
    }
  }
}
