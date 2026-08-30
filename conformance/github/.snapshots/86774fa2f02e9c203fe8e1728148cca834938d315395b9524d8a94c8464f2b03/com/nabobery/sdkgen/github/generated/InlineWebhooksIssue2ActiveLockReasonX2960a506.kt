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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/active_lock_reason.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_2/properties/active_lock_reason
 */
@Serializable(with = InlineWebhooksIssue2ActiveLockReasonX2960a506.Serializer::class)
public sealed class InlineWebhooksIssue2ActiveLockReasonX2960a506 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhooksIssue2ActiveLockReasonX2960a506() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhooksIssue2ActiveLockReasonX2960a506() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhooksIssue2ActiveLockReasonX2960a506() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhooksIssue2ActiveLockReasonX2960a506() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssue2ActiveLockReasonX2960a506()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssue2ActiveLockReasonX2960a506 = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssue2ActiveLockReasonX2960a506> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssue2ActiveLockReasonX2960a506", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssue2ActiveLockReasonX2960a506 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssue2ActiveLockReasonX2960a506) {
      encoder.encodeString(value.value)
    }
  }
}
