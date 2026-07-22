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
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s/properties/permissions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s/properties/permissions/items
 */
@Serializable(with = InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529.Serializer::class)
public sealed class InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `balances`.
     */
    public data object Balances : InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529() {
        public override val `value`: String = "balances"
    }

    /**
     * Documented value. Wire value: `ownership`.
     */
    public data object Ownership : InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529() {
        public override val `value`: String = "ownership"
    }

    /**
     * Documented value. Wire value: `payment_method`.
     */
    public data object PaymentMethod : InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529() {
        public override val `value`: String = "payment_method"
    }

    /**
     * Documented value. Wire value: `transactions`.
     */
    public data object Transactions : InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529() {
        public override val `value`: String = "transactions"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529()

    public companion object {
        public fun fromValue(`value`: String): InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529 =
            when (value) {
                Balances.value -> Balances
                Ownership.value -> Ownership
                PaymentMethod.value -> PaymentMethod
                Transactions.value -> Transactions
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
