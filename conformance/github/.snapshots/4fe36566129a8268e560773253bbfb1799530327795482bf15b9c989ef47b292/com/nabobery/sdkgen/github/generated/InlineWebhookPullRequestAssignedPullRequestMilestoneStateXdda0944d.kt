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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/mil
 * estone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d.Serializer::class)
public sealed class InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestMilestoneStateXdda0944d) {
      encoder.encodeString(value.value)
    }
  }
}
