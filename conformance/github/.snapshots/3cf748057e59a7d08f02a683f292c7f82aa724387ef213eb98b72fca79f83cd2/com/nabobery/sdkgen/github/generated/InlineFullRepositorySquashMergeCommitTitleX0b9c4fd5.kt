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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/full-repository/properties/squash_merge_commit_title
 */
@Serializable(with = InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5.Serializer::class)
public sealed class InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5()

  public companion object {
    public fun fromValue(`value`: String): InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5) {
      encoder.encodeString(value.value)
    }
  }
}
