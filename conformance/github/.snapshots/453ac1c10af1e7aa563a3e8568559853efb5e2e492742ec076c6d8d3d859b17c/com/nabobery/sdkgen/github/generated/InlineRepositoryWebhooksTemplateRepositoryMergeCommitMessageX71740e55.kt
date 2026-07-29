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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/template_repository/properties/merge_
 * commit_message
 */
@Serializable(with = InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55.Serializer::class)
public sealed class InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55) {
      encoder.encodeString(value.value)
    }
  }
}
