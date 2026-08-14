package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Controls whether the mobile payment element displays a checkbox offering to save a new payment method.
 *
 * If a customer checks the box, the
 * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay) value
 * on the PaymentMethod is set to `'always'` at confirmation time. For PaymentIntents, the
 * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage)
 * value is also set to the value defined in `payment_method_save_usage`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * _resource_features/properties/payment_method_save
 */
@Serializable(with = InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa.Serializer::class)
public sealed class InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa) {
      encoder.encodeString(value.value)
    }
  }
}
