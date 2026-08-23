package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Whether to cancel subscriptions immediately or at the end of the billing period.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_cancel/properties/mode
 */
@Serializable(with = InlinePortalSubscriptionCancelModeX54b9776b.Serializer::class)
public sealed class InlinePortalSubscriptionCancelModeX54b9776b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `at_period_end`.
   */
  public data object AtPeriodEnd : InlinePortalSubscriptionCancelModeX54b9776b() {
    public override val `value`: String = "at_period_end"
  }

  /**
   * Documented value. Wire value: `immediately`.
   */
  public data object Immediately : InlinePortalSubscriptionCancelModeX54b9776b() {
    public override val `value`: String = "immediately"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalSubscriptionCancelModeX54b9776b()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalSubscriptionCancelModeX54b9776b = when (value) {
      AtPeriodEnd.value -> AtPeriodEnd
      Immediately.value -> Immediately
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePortalSubscriptionCancelModeX54b9776b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalSubscriptionCancelModeX54b9776b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalSubscriptionCancelModeX54b9776b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalSubscriptionCancelModeX54b9776b) {
      encoder.encodeString(value.value)
    }
  }
}
