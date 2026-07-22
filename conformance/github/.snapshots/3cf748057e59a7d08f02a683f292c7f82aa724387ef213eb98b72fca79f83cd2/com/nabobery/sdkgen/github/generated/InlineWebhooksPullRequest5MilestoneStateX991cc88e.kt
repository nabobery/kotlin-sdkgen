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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/milestone/properties/state
 */
@Serializable(with = InlineWebhooksPullRequest5MilestoneStateX991cc88e.Serializer::class)
public sealed class InlineWebhooksPullRequest5MilestoneStateX991cc88e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksPullRequest5MilestoneStateX991cc88e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksPullRequest5MilestoneStateX991cc88e() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5MilestoneStateX991cc88e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5MilestoneStateX991cc88e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5MilestoneStateX991cc88e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5MilestoneStateX991cc88e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5MilestoneStateX991cc88e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5MilestoneStateX991cc88e) {
      encoder.encodeString(value.value)
    }
  }
}
