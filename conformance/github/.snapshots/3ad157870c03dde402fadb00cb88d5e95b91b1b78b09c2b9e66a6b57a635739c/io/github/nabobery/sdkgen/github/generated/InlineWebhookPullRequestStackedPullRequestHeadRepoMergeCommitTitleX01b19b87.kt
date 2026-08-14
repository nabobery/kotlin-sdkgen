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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/head
 * /properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestHeadRepoMergeCommitTitleX01b19b87) {
      encoder.encodeString(value.value)
    }
  }
}
