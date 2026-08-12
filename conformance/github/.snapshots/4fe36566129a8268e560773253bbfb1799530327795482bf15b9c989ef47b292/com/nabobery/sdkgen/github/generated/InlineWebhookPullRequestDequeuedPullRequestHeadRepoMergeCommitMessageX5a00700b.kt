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
 * The default value for a merge commit message.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/hea
 * d/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestHeadRepoMergeCommitMessageX5a00700b) {
      encoder.encodeString(value.value)
    }
  }
}
