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
 * sdkgen://source/openapi.yaml#/components/schemas/nullable-repository-webhooks/properties/template_repository/properti
 * es/merge_commit_title
 */
@Serializable(with = InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016.Serializer::class)
public sealed class InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitTitleX8dcc7016) {
      encoder.encodeString(value.value)
    }
  }
}
