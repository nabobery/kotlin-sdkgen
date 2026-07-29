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
 * Whether to create prorations when canceling subscriptions. Possible values are `none` and `create_prorations`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_cancel/properties/proration_behavior
 */
@Serializable(with = InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50.Serializer::class)
public sealed class InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always_invoice`.
   */
  public data object AlwaysInvoice : InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50() {
    public override val `value`: String = "always_invoice"
  }

  /**
   * Documented value. Wire value: `create_prorations`.
   */
  public data object CreateProrations : InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50() {
    public override val `value`: String = "create_prorations"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50 = when (value) {
      AlwaysInvoice.value -> AlwaysInvoice
      CreateProrations.value -> CreateProrations
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalSubscriptionCancelProrationBehaviorX1f0eff50) {
      encoder.encodeString(value.value)
    }
  }
}
