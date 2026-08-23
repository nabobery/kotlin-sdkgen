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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/milestone/properti
 * es/state
 */
@Serializable(with = InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssueMilestoneStateXcb14d0ea) {
      encoder.encodeString(value.value)
    }
  }
}
