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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/template_repository/properties/squash
 * _merge_commit_title
 */
@Serializable(with = InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e.Serializer::class)
public sealed class InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e) {
      encoder.encodeString(value.value)
    }
  }
}
