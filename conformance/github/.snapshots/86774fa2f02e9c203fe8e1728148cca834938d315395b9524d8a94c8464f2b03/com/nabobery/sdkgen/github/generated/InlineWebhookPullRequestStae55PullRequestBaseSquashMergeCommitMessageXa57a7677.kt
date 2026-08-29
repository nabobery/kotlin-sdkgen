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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/base
 * /properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677.Serializer::class)
public sealed class InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStae55PullRequestBaseSquashMergeCommitMessageXa57a7677) {
      encoder.encodeString(value.value)
    }
  }
}
