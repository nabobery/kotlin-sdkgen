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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_transaction/properties/object
 */
@Serializable(with = InlineBillingCreditBalanceTransactionObjectValueX33e7fb04.Serializer::class)
public sealed class InlineBillingCreditBalanceTransactionObjectValueX33e7fb04 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `billing.credit_balance_transaction`.
     */
    public data object BillingCreditBalanceTransaction : InlineBillingCreditBalanceTransactionObjectValueX33e7fb04() {
        public override val `value`: String = "billing.credit_balance_transaction"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingCreditBalanceTransactionObjectValueX33e7fb04()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingCreditBalanceTransactionObjectValueX33e7fb04 =
            when (value) {
                BillingCreditBalanceTransaction.value -> BillingCreditBalanceTransaction
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBillingCreditBalanceTransactionObjectValueX33e7fb04> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingCreditBalanceTransactionObjectValueX33e7fb04",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceTransactionObjectValueX33e7fb04 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingCreditBalanceTransactionObjectValueX33e7fb04,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
