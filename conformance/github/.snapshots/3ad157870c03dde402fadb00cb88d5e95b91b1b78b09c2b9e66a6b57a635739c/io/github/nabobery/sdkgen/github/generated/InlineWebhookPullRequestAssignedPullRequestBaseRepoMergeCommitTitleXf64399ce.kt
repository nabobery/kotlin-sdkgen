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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/bas
 * e/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce.Serializer::class)
public sealed class InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestBaseRepoMergeCommitTitleXf64399ce) {
      encoder.encodeString(value.value)
    }
  }
}
