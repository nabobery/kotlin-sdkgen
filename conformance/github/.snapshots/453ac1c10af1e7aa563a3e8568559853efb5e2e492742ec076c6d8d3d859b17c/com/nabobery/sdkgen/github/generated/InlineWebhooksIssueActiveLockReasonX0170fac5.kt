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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/active_lock_reason.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/active_lock_reason
 */
@Serializable(with = InlineWebhooksIssueActiveLockReasonX0170fac5.Serializer::class)
public sealed class InlineWebhooksIssueActiveLockReasonX0170fac5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhooksIssueActiveLockReasonX0170fac5() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineWebhooksIssueActiveLockReasonX0170fac5() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineWebhooksIssueActiveLockReasonX0170fac5() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineWebhooksIssueActiveLockReasonX0170fac5() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueActiveLockReasonX0170fac5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueActiveLockReasonX0170fac5 = when (value) {
      Resolved.value -> Resolved
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksIssueActiveLockReasonX0170fac5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssueActiveLockReasonX0170fac5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueActiveLockReasonX0170fac5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueActiveLockReasonX0170fac5) {
      encoder.encodeString(value.value)
    }
  }
}
