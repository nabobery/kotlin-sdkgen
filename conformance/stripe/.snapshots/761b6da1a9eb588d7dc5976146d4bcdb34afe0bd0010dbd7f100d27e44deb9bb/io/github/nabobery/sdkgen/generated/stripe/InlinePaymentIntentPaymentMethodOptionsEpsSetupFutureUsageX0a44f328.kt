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
 * Indicates that you intend to make future payments with this PaymentIntent's payment method.
 *
 * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
 * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
 * completes any required actions. If you don't provide a Customer, you can still [attach](/api/payment_methods/attach)
 * the payment method to a Customer after the transaction completes.
 *
 * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
 * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment method
 * representing the card to the Customer instead.
 *
 * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
 * network rules, such as [SCA](/strong-customer-authentication).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_eps/properties/setup_future_us
 * age
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328 = when (value) {
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsEpsSetupFutureUsageX0a44f328) {
      encoder.encodeString(value.value)
    }
  }
}
