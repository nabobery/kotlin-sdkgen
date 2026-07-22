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
 * The type of the bank account. This can be either 'checking' or 'savings'.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_us_bank_account/properties/acc
 * ount_type
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783.Serializer::class)
public sealed class InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `checking`.
     */
    public data object Checking : InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783() {
        public override val `value`: String = "checking"
    }

    /**
     * Documented value. Wire value: `savings`.
     */
    public data object Savings : InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783() {
        public override val `value`: String = "savings"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783 =
            when (value) {
                Checking.value -> Checking
                Savings.value -> Savings
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsPaymentRecordUsBankAccountAccountTypeX3764d783,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
