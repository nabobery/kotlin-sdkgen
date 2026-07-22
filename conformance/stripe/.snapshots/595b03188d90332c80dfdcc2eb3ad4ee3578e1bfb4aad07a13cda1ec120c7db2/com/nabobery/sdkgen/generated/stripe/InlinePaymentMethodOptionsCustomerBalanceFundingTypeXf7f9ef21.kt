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
 * The funding method type to be used when there are not enough funds in the customer balance. Permitted values include:
 * `bank_transfer`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance/properties/funding_type
 */
@Serializable(with = InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21.Serializer::class)
public sealed class InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `bank_transfer`.
     */
    public data object BankTransfer : InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21() {
        public override val `value`: String = "bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21 =
            when (value) {
                BankTransfer.value -> BankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
