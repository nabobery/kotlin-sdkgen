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
 * The default value for a squash merge commit message:
 *
 * - `PR_BODY` - default to the pull request's body.
 * - `COMMIT_MESSAGES` - default to the branch's commit messages.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/bas
 * e/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069.Serializer::class)
public sealed class InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnd765PullRequestBaseSquashMergeCommitMessageX19e6a069) {
      encoder.encodeString(value.value)
    }
  }
}
