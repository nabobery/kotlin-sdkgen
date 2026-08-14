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
 * The default value for a merge commit message.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/head/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db.Serializer::class)
public sealed class InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5d81PullRequestHeadRepoMergeCommitMessageX2b2cd8db) {
      encoder.encodeString(value.value)
    }
  }
}
