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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/squash_merge_commit_message
 */
@Serializable(with = InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d.Serializer::class)
public sealed class InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksSquashMergeCommitMessageX8a8ef99d) {
      encoder.encodeString(value.value)
    }
  }
}
