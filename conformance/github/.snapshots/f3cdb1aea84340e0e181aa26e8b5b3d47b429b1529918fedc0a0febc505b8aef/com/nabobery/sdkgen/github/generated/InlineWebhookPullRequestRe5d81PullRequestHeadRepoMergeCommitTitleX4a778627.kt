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
 * The default value for a merge commit title.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
 * branch-name).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/head/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627.Serializer::class)
public sealed class InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitTitleX4a778627) {
      encoder.encodeString(value.value)
    }
  }
}
