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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/hea
 * d/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b.Serializer::class)
public sealed class InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAsbb98PullRequestHeadSquashMergeCommitMessageX710f8a2b) {
      encoder.encodeString(value.value)
    }
  }
}
