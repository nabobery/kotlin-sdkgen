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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/a
 * ctive_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/a
 * ctive_lock_reason
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade.Serializer::class)
public sealed class InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade) {
      encoder.encodeString(value.value)
    }
  }
}
