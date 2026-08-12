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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/act
 * ive_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/act
 * ive_lock_reason
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e.Serializer::class)
public sealed class InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestActiveLockReasonX66e8e94e) {
      encoder.encodeString(value.value)
    }
  }
}
