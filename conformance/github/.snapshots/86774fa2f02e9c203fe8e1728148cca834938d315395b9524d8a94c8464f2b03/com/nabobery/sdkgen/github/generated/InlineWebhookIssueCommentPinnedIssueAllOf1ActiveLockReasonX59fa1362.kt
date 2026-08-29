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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/act
 * ive_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/act
 * ive_lock_reason
 */
@Serializable(with = InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362.Serializer::class)
public sealed class InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362 = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentPinnedIssueAllOf1ActiveLockReasonX59fa1362) {
      encoder.encodeString(value.value)
    }
  }
}
