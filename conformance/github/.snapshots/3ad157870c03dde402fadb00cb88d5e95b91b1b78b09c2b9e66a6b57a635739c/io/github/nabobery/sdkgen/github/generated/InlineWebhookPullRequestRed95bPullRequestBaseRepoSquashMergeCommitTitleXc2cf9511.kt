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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/base/properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511.Serializer::class)
public sealed class InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRed95bPullRequestBaseRepoSquashMergeCommitTitleXc2cf9511) {
      encoder.encodeString(value.value)
    }
  }
}
