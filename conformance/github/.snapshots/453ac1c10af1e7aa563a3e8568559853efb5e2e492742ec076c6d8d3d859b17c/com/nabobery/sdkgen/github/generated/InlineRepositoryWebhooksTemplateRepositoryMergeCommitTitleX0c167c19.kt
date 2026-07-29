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
 * The default value for a merge commit title.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
 * branch-name).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/template_repository/properties/merge_
 * commit_title
 */
@Serializable(with = InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19.Serializer::class)
public sealed class InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19) {
      encoder.encodeString(value.value)
    }
  }
}
