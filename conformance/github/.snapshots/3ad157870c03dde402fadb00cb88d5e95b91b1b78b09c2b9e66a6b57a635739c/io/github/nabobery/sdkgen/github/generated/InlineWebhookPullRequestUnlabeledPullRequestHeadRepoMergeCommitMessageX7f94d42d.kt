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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/he
 * ad/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d.Serializer::class)
public sealed class InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestHeadRepoMergeCommitMessageX7f94d42d) {
      encoder.encodeString(value.value)
    }
  }
}
