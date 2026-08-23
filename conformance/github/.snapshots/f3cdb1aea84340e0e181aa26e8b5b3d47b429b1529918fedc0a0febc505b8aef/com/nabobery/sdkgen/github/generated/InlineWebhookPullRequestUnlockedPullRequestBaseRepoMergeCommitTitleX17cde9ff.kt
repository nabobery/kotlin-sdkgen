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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/bas
 * e/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff.Serializer::class)
public sealed class InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestBaseRepoMergeCommitTitleX17cde9ff) {
      encoder.encodeString(value.value)
    }
  }
}
