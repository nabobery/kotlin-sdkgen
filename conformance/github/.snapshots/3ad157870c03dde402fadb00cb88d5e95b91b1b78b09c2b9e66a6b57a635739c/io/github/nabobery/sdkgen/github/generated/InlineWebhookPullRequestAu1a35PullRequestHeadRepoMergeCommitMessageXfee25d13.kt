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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/head/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13.Serializer::class)
public sealed class InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAu1a35PullRequestHeadRepoMergeCommitMessageXfee25d13) {
      encoder.encodeString(value.value)
    }
  }
}
