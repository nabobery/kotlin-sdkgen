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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/head/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009.Serializer::class)
public sealed class InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8581PullRequestHeadRepoMergeCommitMessageXd5840009) {
      encoder.encodeString(value.value)
    }
  }
}
