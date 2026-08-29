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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/base/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c.Serializer::class)
public sealed class InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAu1a35PullRequestBaseRepoMergeCommitTitleX28b44c4c) {
      encoder.encodeString(value.value)
    }
  }
}
