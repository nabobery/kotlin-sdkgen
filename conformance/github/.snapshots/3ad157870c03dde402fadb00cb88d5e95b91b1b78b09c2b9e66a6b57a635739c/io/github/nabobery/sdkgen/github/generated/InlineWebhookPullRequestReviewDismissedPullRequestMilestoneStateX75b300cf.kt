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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/milestone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestMilestoneStateX75b300cf) {
      encoder.encodeString(value.value)
    }
  }
}
