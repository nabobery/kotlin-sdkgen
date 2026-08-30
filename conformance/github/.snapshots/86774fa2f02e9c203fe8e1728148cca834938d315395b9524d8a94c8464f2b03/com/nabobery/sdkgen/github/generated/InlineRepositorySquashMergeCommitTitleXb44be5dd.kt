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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository/properties/squash_merge_commit_title
 */
@Serializable(with = InlineRepositorySquashMergeCommitTitleXb44be5dd.Serializer::class)
public sealed class InlineRepositorySquashMergeCommitTitleXb44be5dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineRepositorySquashMergeCommitTitleXb44be5dd() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineRepositorySquashMergeCommitTitleXb44be5dd() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositorySquashMergeCommitTitleXb44be5dd()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositorySquashMergeCommitTitleXb44be5dd = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositorySquashMergeCommitTitleXb44be5dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositorySquashMergeCommitTitleXb44be5dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositorySquashMergeCommitTitleXb44be5dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositorySquashMergeCommitTitleXb44be5dd) {
      encoder.encodeString(value.value)
    }
  }
}
