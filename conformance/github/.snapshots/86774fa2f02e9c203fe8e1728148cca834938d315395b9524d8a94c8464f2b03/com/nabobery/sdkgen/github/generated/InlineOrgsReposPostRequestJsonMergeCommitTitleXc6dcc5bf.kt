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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/post/requestBody/content/application~1json/schema/properties
 * /merge_commit_title
 */
@Serializable(with = InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf.Serializer::class)
public sealed class InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposPostRequestJsonMergeCommitTitleXc6dcc5bf) {
      encoder.encodeString(value.value)
    }
  }
}
