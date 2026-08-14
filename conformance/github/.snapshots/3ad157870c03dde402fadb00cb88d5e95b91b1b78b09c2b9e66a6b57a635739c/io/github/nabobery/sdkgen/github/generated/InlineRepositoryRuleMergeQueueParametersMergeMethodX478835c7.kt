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
 * Method to use when merging changes from queued pull requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-merge-queue/properties/parameters/properties/merge_m
 * ethod
 */
@Serializable(with = InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7.Serializer::class)
public sealed class InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `MERGE`.
   */
  public data object Merge : InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7() {
    public override val `value`: String = "MERGE"
  }

  /**
   * Documented value. Wire value: `SQUASH`.
   */
  public data object Squash : InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7() {
    public override val `value`: String = "SQUASH"
  }

  /**
   * Documented value. Wire value: `REBASE`.
   */
  public data object Rebase : InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7() {
    public override val `value`: String = "REBASE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7) {
      encoder.encodeString(value.value)
    }
  }
}
