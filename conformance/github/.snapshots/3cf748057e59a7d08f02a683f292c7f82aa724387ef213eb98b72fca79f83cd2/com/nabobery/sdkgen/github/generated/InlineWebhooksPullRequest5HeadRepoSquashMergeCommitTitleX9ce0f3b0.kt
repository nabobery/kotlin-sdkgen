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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/s
 * quash_merge_commit_title
 */
@Serializable(with = InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0.Serializer::class)
public sealed class InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5HeadRepoSquashMergeCommitTitleX9ce0f3b0) {
      encoder.encodeString(value.value)
    }
  }
}
