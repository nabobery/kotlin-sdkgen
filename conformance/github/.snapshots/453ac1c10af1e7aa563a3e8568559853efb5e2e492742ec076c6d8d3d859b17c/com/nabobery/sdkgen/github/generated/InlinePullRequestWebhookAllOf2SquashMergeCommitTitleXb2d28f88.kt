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
 * The default value for a squash merge commit title:
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-webhook/allOf/1/properties/squash_merge_commit_title
 */
@Serializable(with = InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88.Serializer::class)
public sealed class InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestWebhookAllOf2SquashMergeCommitTitleXb2d28f88) {
      encoder.encodeString(value.value)
    }
  }
}
