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
 * - `PR_BODY` - default to the pull request's body.
 * - `COMMIT_MESSAGES` - default to the branch's commit messages.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-webhook/allOf/1/properties/squash_merge_commit_message
 */
@Serializable(with = InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac.Serializer::class)
public sealed class InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestWebhookAllOf2SquashMergeCommitMessageX5317a2ac) {
      encoder.encodeString(value.value)
    }
  }
}
