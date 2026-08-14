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
 * The default value for a merge commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * head/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8.Serializer::class)
public sealed class InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSy92fbPullRequestHeadRepoMergeCommitMessageX169ab7a8) {
      encoder.encodeString(value.value)
    }
  }
}
