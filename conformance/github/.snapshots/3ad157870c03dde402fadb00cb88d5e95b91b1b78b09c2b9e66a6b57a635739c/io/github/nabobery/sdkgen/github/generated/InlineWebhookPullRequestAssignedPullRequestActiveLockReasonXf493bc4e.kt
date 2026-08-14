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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/act
 * ive_lock_reason.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/act
 * ive_lock_reason
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e.Serializer::class)
public sealed class InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestActiveLockReasonXf493bc4e) {
      encoder.encodeString(value.value)
    }
  }
}
