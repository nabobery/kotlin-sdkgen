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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/m
 * erge_commit_title
 */
@Serializable(with = InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77.Serializer::class)
public sealed class InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77 = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5HeadRepoMergeCommitTitleX55941e77) {
      encoder.encodeString(value.value)
    }
  }
}
