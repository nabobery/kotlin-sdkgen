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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/he
 * ad/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e.Serializer::class)
public sealed class InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn950ePullRequestHeadSquashMergeCommitMessageX2596cd8e) {
      encoder.encodeString(value.value)
    }
  }
}
