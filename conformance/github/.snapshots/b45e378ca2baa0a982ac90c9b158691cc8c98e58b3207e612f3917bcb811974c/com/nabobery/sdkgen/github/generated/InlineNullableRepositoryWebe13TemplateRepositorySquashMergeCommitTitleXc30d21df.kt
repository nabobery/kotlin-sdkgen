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
 * sdkgen://source/openapi.yaml#/components/schemas/nullable-repository-webhooks/properties/template_repository/properti
 * es/squash_merge_commit_title
 */
@Serializable(with = InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df.Serializer::class)
public sealed class InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryWebe13TemplateRepositorySquashMergeCommitTitleXc30d21df) {
      encoder.encodeString(value.value)
    }
  }
}
