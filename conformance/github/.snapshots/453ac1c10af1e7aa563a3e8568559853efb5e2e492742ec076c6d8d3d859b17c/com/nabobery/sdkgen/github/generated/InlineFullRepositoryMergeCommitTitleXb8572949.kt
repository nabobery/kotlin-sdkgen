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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/full-repository/properties/merge_commit_title
 */
@Serializable(with = InlineFullRepositoryMergeCommitTitleXb8572949.Serializer::class)
public sealed class InlineFullRepositoryMergeCommitTitleXb8572949 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineFullRepositoryMergeCommitTitleXb8572949() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineFullRepositoryMergeCommitTitleXb8572949() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFullRepositoryMergeCommitTitleXb8572949()

  public companion object {
    public fun fromValue(`value`: String): InlineFullRepositoryMergeCommitTitleXb8572949 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineFullRepositoryMergeCommitTitleXb8572949> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineFullRepositoryMergeCommitTitleXb8572949", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFullRepositoryMergeCommitTitleXb8572949 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFullRepositoryMergeCommitTitleXb8572949) {
      encoder.encodeString(value.value)
    }
  }
}
