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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/milestone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestMilestoneStateX15eba71c) {
      encoder.encodeString(value.value)
    }
  }
}
