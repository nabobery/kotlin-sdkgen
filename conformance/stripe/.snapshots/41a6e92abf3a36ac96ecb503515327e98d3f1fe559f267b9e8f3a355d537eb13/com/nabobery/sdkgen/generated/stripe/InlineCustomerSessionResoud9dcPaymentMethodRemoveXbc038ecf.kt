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
 * Controls whether the Payment Element displays the option to remove a saved payment method. This parameter defaults to
 * `disabled`.
 *
 * Allowing buyers to remove their saved payment methods impacts subscriptions that depend on that payment method.
 * Removing the payment method detaches the [`customer`
 * object](https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer) from that
 * [PaymentMethod](https://docs.stripe.com/api/payment_methods).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element_resour
 * ce_features/properties/payment_method_remove
 */
@Serializable(with = InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf.Serializer::class)
public sealed class InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf) {
      encoder.encodeString(value.value)
    }
  }
}
