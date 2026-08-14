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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/head/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf1PullRequestSquashMergeCommitMessageXc4f48891) {
      encoder.encodeString(value.value)
    }
  }
}
