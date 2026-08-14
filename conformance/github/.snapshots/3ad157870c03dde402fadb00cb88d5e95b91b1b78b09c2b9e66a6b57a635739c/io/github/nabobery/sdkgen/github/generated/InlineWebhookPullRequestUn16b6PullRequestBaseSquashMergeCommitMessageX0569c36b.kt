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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/b
 * ase/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b.Serializer::class)
public sealed class InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn16b6PullRequestBaseSquashMergeCommitMessageX0569c36b) {
      encoder.encodeString(value.value)
    }
  }
}
