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
 * The default value for a merge commit message title.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/he
 * ad/properties/repo/properties/merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a.Serializer::class)
public sealed class InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitTitleXdf17876a) {
      encoder.encodeString(value.value)
    }
  }
}
