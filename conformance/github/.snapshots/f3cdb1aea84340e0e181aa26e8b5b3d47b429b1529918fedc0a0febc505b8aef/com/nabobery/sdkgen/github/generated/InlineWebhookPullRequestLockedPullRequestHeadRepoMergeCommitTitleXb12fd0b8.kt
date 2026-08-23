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
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/head/
 * properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestHeadRepoMergeCommitTitleXb12fd0b8) {
      encoder.encodeString(value.value)
    }
  }
}
