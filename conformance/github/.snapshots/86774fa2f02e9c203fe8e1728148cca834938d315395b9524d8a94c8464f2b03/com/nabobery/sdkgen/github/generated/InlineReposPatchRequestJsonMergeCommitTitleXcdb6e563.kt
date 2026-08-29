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
 * Required when using `merge_commit_message`.
 *
 * The default value for a merge commit title.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
 * branch-name).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/merge_commit_title
 */
@Serializable(with = InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563.Serializer::class)
public sealed class InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563) {
      encoder.encodeString(value.value)
    }
  }
}
