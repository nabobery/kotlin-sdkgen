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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/active_lock_
 * reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/active_lock_
 * reason
 */
@Serializable(with = InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe.Serializer::class)
public sealed class InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilestonedIssueActiveLockReasonX16ea0cfe) {
      encoder.encodeString(value.value)
    }
  }
}
