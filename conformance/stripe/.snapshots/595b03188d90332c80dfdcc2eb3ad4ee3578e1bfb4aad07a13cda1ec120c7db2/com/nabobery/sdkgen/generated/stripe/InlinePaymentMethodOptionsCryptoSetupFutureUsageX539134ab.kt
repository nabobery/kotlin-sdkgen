package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_crypto/properties/setup_future_usage
 */
@Serializable(with = InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab.Serializer::class)
public sealed class InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab =
            when (value) {
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsCryptoSetupFutureUsageX539134ab,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
