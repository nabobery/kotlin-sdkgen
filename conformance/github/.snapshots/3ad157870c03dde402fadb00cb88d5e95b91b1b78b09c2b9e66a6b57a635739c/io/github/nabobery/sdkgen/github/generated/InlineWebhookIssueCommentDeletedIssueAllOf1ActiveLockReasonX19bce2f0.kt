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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/ac
 * tive_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/ac
 * tive_lock_reason
 */
@Serializable(with = InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0.Serializer::class)
public sealed class InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0 = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedIssueAllOf1ActiveLockReasonX19bce2f0) {
      encoder.encodeString(value.value)
    }
  }
}
