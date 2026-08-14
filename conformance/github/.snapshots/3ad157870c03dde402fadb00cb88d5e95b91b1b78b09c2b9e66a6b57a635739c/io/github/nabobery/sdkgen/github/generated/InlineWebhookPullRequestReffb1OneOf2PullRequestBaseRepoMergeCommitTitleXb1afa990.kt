package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/base/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990.Serializer::class)
public sealed class InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoMergeCommitTitleXb1afa990) {
      encoder.encodeString(value.value)
    }
  }
}
