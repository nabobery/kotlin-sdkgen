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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/miles
 * tone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestMilestoneStateX3b7a0e44) {
      encoder.encodeString(value.value)
    }
  }
}
