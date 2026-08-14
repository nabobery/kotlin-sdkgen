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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/base
 * /properties/repo/properties/squash_merge_commit_title
 */
@Serializable(with = InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d.Serializer::class)
public sealed class InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLa835fPullRequestBaseRepoSquashMergeCommitTitleX1f6cc60d) {
      encoder.encodeString(value.value)
    }
  }
}
