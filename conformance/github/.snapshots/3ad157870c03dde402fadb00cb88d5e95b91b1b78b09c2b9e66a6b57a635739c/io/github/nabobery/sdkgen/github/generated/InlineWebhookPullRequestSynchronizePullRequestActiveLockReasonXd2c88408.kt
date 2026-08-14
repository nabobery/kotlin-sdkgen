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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * active_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * active_lock_reason
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408.Serializer::class)
public sealed class InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408 = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestActiveLockReasonXd2c88408) {
      encoder.encodeString(value.value)
    }
  }
}
