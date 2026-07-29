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
 * Required when using `squash_merge_commit_message`.
 *
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1repos/post/requestBody/content/application~1json/schema/properties/squash
 * _merge_commit_title
 */
@Serializable(with = InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741.Serializer::class)
public sealed class InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposPostRequestJsonSquashMergeCommitTitleXb0d25741) {
      encoder.encodeString(value.value)
    }
  }
}
