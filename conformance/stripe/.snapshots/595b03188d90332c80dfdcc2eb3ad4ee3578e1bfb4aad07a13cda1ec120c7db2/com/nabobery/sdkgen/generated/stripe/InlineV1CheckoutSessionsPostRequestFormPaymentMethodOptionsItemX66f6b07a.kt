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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/properties/p
 * ermissions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/properties/p
 * ermissions/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `balances`.
     */
    public data object Balances : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a() {
        public override val `value`: String = "balances"
    }

    /**
     * Documented value. Wire value: `ownership`.
     */
    public data object Ownership : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a() {
        public override val `value`: String = "ownership"
    }

    /**
     * Documented value. Wire value: `payment_method`.
     */
    public data object PaymentMethod : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a() {
        public override val `value`: String = "payment_method"
    }

    /**
     * Documented value. Wire value: `transactions`.
     */
    public data object Transactions : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a() {
        public override val `value`: String = "transactions"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a =
            when (value) {
                Balances.value -> Balances
                Ownership.value -> Ownership
                PaymentMethod.value -> PaymentMethod
                Transactions.value -> Transactions
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX66f6b07a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
