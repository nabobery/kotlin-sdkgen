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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/base/
 * properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestBaseRepoSquashMergeCommitTitleX015b49ef) {
      encoder.encodeString(value.value)
    }
  }
}
