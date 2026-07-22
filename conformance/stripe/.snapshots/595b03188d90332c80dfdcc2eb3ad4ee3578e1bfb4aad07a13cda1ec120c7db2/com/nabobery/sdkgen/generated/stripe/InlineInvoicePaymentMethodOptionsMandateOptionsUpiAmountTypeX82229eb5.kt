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
 * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
 * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_mandate_options_upi/properties/amount
 * _type
 */
@Serializable(with = InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5.Serializer::class)
public sealed class InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5()

    public companion object {
        public fun fromValue(`value`: String): InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5 =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicePaymentMethodOptionsMandateOptionsUpiAmountTypeX82229eb5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
