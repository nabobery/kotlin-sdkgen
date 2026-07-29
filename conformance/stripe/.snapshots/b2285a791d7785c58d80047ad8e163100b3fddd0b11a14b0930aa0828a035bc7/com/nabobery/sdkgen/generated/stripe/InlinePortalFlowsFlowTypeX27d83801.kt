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
 * Type of flow that the customer will go through.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow/properties/type
 */
@Serializable(with = InlinePortalFlowsFlowTypeX27d83801.Serializer::class)
public sealed class InlinePortalFlowsFlowTypeX27d83801 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_method_update`.
   */
  public data object PaymentMethodUpdate : InlinePortalFlowsFlowTypeX27d83801() {
    public override val `value`: String = "payment_method_update"
  }

  /**
   * Documented value. Wire value: `subscription_cancel`.
   */
  public data object SubscriptionCancel : InlinePortalFlowsFlowTypeX27d83801() {
    public override val `value`: String = "subscription_cancel"
  }

  /**
   * Documented value. Wire value: `subscription_update`.
   */
  public data object SubscriptionUpdate : InlinePortalFlowsFlowTypeX27d83801() {
    public override val `value`: String = "subscription_update"
  }

  /**
   * Documented value. Wire value: `subscription_update_confirm`.
   */
  public data object SubscriptionUpdateConfirm : InlinePortalFlowsFlowTypeX27d83801() {
    public override val `value`: String = "subscription_update_confirm"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalFlowsFlowTypeX27d83801()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalFlowsFlowTypeX27d83801 = when (value) {
      PaymentMethodUpdate.value -> PaymentMethodUpdate
      SubscriptionCancel.value -> SubscriptionCancel
      SubscriptionUpdate.value -> SubscriptionUpdate
      SubscriptionUpdateConfirm.value -> SubscriptionUpdateConfirm
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePortalFlowsFlowTypeX27d83801> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalFlowsFlowTypeX27d83801", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowTypeX27d83801 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsFlowTypeX27d83801) {
      encoder.encodeString(value.value)
    }
  }
}
