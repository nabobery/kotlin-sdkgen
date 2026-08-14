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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/base/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae.Serializer::class)
public sealed class InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5d81PullRequestBaseSquashMergeCommitMessageX59eb06ae) {
      encoder.encodeString(value.value)
    }
  }
}
