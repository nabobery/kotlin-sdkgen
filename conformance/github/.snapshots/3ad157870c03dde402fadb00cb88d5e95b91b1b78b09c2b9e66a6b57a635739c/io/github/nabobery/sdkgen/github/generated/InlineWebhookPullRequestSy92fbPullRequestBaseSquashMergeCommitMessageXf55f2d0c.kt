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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * base/properties/repo/properties/squash_merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c.Serializer::class)
public sealed class InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSy92fbPullRequestBaseSquashMergeCommitMessageXf55f2d0c) {
      encoder.encodeString(value.value)
    }
  }
}
