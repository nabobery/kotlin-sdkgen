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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/type
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486.Serializer::class)
public sealed class InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_method_update`.
   */
  public data object PaymentMethodUpdate : InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486() {
    public override val `value`: String = "payment_method_update"
  }

  /**
   * Documented value. Wire value: `subscription_cancel`.
   */
  public data object SubscriptionCancel : InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486() {
    public override val `value`: String = "subscription_cancel"
  }

  /**
   * Documented value. Wire value: `subscription_update`.
   */
  public data object SubscriptionUpdate : InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486() {
    public override val `value`: String = "subscription_update"
  }

  /**
   * Documented value. Wire value: `subscription_update_confirm`.
   */
  public data object SubscriptionUpdateConfirm : InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486() {
    public override val `value`: String = "subscription_update_confirm"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486 = when (value) {
      PaymentMethodUpdate.value -> PaymentMethodUpdate
      SubscriptionCancel.value -> SubscriptionCancel
      SubscriptionUpdate.value -> SubscriptionUpdate
      SubscriptionUpdateConfirm.value -> SubscriptionUpdateConfirm
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486) {
      encoder.encodeString(value.value)
    }
  }
}
