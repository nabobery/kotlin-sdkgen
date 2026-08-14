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
 * The default value for a squash merge commit message:
 *
 * - `PR_BODY` - default to the pull request's body.
 * - `COMMIT_MESSAGES` - default to the branch's commit messages.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/head/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473.Serializer::class)
public sealed class InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRed95bPullRequestHeadSquashMergeCommitMessageX23a95473) {
      encoder.encodeString(value.value)
    }
  }
}
