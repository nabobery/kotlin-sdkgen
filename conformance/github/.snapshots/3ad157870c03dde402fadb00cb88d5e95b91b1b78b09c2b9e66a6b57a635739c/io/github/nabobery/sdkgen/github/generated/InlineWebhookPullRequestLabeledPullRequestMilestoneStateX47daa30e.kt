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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/mile
 * stone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e.Serializer::class)
public sealed class InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestMilestoneStateX47daa30e) {
      encoder.encodeString(value.value)
    }
  }
}
