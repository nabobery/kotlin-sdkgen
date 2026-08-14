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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/base/properties/repo/properties/merge_commit_message
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4.Serializer::class)
public sealed class InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf1PullRequestBaseMergeCommitMessageXd5871cf4) {
      encoder.encodeString(value.value)
    }
  }
}
