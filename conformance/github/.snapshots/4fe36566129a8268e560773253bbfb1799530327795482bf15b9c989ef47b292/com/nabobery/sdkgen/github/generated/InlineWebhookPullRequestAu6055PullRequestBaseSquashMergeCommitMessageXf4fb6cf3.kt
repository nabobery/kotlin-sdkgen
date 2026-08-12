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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/base/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3.Serializer::class)
public sealed class InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAu6055PullRequestBaseSquashMergeCommitMessageXf4fb6cf3) {
      encoder.encodeString(value.value)
    }
  }
}
