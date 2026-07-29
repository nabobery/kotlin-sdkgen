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
 * Controls whether the Payment Element displays a checkbox offering to save a new payment method. This parameter
 * defaults to `disabled`.
 *
 * If a customer checks the box, the
 * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay) value
 * on the PaymentMethod is set to `'always'` at confirmation time. For PaymentIntents, the
 * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage)
 * value is also set to the value defined in `payment_method_save_usage`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element_resour
 * ce_features/properties/payment_method_save
 */
@Serializable(with = InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf.Serializer::class)
public sealed class InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf) {
      encoder.encodeString(value.value)
    }
  }
}
