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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-deleted/properties/issue/properties/milestone/propert
 * ies/state
 */
@Serializable(with = InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf.Serializer::class)
public sealed class InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDeletedIssueMilestoneStateX2d2bf5cf) {
      encoder.encodeString(value.value)
    }
  }
}
