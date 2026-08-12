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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/milestone/properties/state
 */
@Serializable(with = InlineWebhooksIssue2MilestoneStateX7861ab72.Serializer::class)
public sealed class InlineWebhooksIssue2MilestoneStateX7861ab72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksIssue2MilestoneStateX7861ab72() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksIssue2MilestoneStateX7861ab72() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssue2MilestoneStateX7861ab72()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssue2MilestoneStateX7861ab72 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssue2MilestoneStateX7861ab72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssue2MilestoneStateX7861ab72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssue2MilestoneStateX7861ab72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssue2MilestoneStateX7861ab72) {
      encoder.encodeString(value.value)
    }
  }
}
