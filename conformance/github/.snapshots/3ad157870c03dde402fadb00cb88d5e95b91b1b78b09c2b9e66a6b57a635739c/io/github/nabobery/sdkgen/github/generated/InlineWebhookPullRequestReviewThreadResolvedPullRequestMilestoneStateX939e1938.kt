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
 * The state of the milestone.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/milestone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedPullRequestMilestoneStateX939e1938) {
      encoder.encodeString(value.value)
    }
  }
}
