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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/milestone/properties/state
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestMilestoneStateX5834d373) {
      encoder.encodeString(value.value)
    }
  }
}
