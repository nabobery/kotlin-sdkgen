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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connections/propert
 * ies/prefetch/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/financial_connections/propert
 * ies/prefetch/items
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `balances`.
     */
    public data object Balances : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9() {
        public override val `value`: String = "balances"
    }

    /**
     * Documented value. Wire value: `ownership`.
     */
    public data object Ownership : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9() {
        public override val `value`: String = "ownership"
    }

    /**
     * Documented value. Wire value: `transactions`.
     */
    public data object Transactions : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9() {
        public override val `value`: String = "transactions"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9 =
            when (value) {
                Balances.value -> Balances
                Ownership.value -> Ownership
                Transactions.value -> Transactions
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXa299fee9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
