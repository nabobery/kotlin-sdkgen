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
 * Controls whether the customer sheet displays the option to remove a saved payment method."
 *
 * Allowing buyers to remove their saved payment methods impacts subscriptions that depend on that payment method.
 * Removing the payment method detaches the [`customer`
 * object](https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer) from that
 * [PaymentMethod](https://docs.stripe.com/api/payment_methods).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_customer_sheet_resourc
 * e_features/properties/payment_method_remove
 */
@Serializable(with = InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1.Serializer::class)
public sealed class InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1 = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResou1a5dPaymentMethodRemoveXdde9e2a1) {
      encoder.encodeString(value.value)
    }
  }
}
