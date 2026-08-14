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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/head/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b.Serializer::class)
public sealed class InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitTitleX9b20410b) {
      encoder.encodeString(value.value)
    }
  }
}
