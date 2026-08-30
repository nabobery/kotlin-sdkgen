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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/template_repository/properties/squash
 * _merge_commit_message
 */
@Serializable(with = InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8.Serializer::class)
public sealed class InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8) {
      encoder.encodeString(value.value)
    }
  }
}
