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
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/base/properties/repo/properties/m
 * erge_commit_message
 */
@Serializable(with = InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be.Serializer::class)
public sealed class InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5BaseRepoMergeCommitMessageXe4b325be) {
      encoder.encodeString(value.value)
    }
  }
}
