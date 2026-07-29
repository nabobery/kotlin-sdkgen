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
 * Determines how to handle prorations resulting from subscription updates. Valid values are `none`,
 * `create_prorations`, and `always_invoice`. Defaults to a value of `none` if you don't set it during creation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_update/properties/proration_behavior
 */
@Serializable(with = InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809.Serializer::class)
public sealed class InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always_invoice`.
   */
  public data object AlwaysInvoice : InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809() {
    public override val `value`: String = "always_invoice"
  }

  /**
   * Documented value. Wire value: `create_prorations`.
   */
  public data object CreateProrations : InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809() {
    public override val `value`: String = "create_prorations"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809 = when (value) {
      AlwaysInvoice.value -> AlwaysInvoice
      CreateProrations.value -> CreateProrations
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809) {
      encoder.encodeString(value.value)
    }
  }
}
