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
 * When set to ALLGREEN, the merge commit created by merge queue for each PR in the group must pass all required checks
 * to merge. When set to HEADGREEN, only the commit at the head of the merge group, i.e. the commit containing changes
 * from all of the PRs in the group, must pass its required checks to merge.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-merge-queue/properties/parameters/properties/groupin
 * g_strategy
 */
@Serializable(with = InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a.Serializer::class)
public sealed class InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ALLGREEN`.
   */
  public data object Allgreen : InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a() {
    public override val `value`: String = "ALLGREEN"
  }

  /**
   * Documented value. Wire value: `HEADGREEN`.
   */
  public data object Headgreen : InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a() {
    public override val `value`: String = "HEADGREEN"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a = when (value) {
      Allgreen.value -> Allgreen
      Headgreen.value -> Headgreen
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a) {
      encoder.encodeString(value.value)
    }
  }
}
