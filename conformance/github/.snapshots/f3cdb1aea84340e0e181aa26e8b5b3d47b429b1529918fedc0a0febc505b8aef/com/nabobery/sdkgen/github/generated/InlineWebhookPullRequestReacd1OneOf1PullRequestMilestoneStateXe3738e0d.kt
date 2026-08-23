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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/milestone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf1PullRequestMilestoneStateXe3738e0d) {
      encoder.encodeString(value.value)
    }
  }
}
