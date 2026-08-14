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
 * The default value for a merge commit title.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
 * branch-name).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/h
 * ead/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146.Serializer::class)
public sealed class InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestHeadRepoMergeCommitTitleX58bd2146) {
      encoder.encodeString(value.value)
    }
  }
}
