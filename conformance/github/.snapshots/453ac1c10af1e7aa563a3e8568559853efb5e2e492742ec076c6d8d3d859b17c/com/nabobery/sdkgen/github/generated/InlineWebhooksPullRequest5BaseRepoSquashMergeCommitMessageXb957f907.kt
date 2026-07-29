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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/base/properties/repo/properties/s
 * quash_merge_commit_message
 */
@Serializable(with = InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907.Serializer::class)
public sealed class InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5BaseRepoSquashMergeCommitMessageXb957f907) {
      encoder.encodeString(value.value)
    }
  }
}
