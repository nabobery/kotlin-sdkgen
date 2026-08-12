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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/active_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/active_lock_reason
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf1PullRequestActiveLockReasonX9665d82c) {
      encoder.encodeString(value.value)
    }
  }
}
