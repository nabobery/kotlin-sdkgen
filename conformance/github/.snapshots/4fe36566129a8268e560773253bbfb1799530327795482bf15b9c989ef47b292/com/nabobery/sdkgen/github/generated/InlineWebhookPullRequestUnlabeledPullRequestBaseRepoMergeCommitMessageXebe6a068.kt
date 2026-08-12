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
 * The default value for a merge commit message.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/ba
 * se/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068.Serializer::class)
public sealed class InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestBaseRepoMergeCommitMessageXebe6a068) {
      encoder.encodeString(value.value)
    }
  }
}
