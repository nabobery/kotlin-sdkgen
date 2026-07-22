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
 * sdkgen://source/openapi.yaml#/paths/~1user~1repos/post/requestBody/content/application~1json/schema/properties/merge_
 * commit_title
 */
@Serializable(with = InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf.Serializer::class)
public sealed class InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposPostRequestJsonMergeCommitTitleXc266eebf) {
      encoder.encodeString(value.value)
    }
  }
}
