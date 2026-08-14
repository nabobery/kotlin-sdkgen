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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/s
 * quash_merge_commit_message
 */
@Serializable(with = InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce.Serializer::class)
public sealed class InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5HeadRepoSquashMergeCommitMessageX0a1bf6ce) {
      encoder.encodeString(value.value)
    }
  }
}
