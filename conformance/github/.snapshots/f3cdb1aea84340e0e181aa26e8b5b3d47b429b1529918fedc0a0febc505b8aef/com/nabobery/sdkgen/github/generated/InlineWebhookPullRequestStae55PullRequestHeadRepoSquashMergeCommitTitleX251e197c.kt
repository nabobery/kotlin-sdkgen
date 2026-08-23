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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/head
 * /properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c.Serializer::class)
public sealed class InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStae55PullRequestHeadRepoSquashMergeCommitTitleX251e197c) {
      encoder.encodeString(value.value)
    }
  }
}
