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
 * The state of the milestone.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/milestone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc) {
      encoder.encodeString(value.value)
    }
  }
}
