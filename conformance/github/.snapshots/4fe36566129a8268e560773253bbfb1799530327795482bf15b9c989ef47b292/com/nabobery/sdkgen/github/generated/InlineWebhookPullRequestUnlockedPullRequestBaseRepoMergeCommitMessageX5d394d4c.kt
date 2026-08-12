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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/bas
 * e/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c.Serializer::class)
public sealed class InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitMessageX5d394d4c) {
      encoder.encodeString(value.value)
    }
  }
}
