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
 * Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails/properties/funding
 */
@Serializable(with = InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805.Serializer::class)
public sealed class InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `credit`.
     */
    public data object Credit : InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805() {
        public override val `value`: String = "credit"
    }

    /**
     * Documented value. Wire value: `debit`.
     */
    public data object Debit : InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805() {
        public override val `value`: String = "debit"
    }

    /**
     * Documented value. Wire value: `prepaid`.
     */
    public data object Prepaid : InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805() {
        public override val `value`: String = "prepaid"
    }

    /**
     * Documented value. Wire value: `unknown`.
     */
    public data object Unknown : InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805() {
        public override val `value`: String = "unknown"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805 =
            when (value) {
                Credit.value -> Credit
                Debit.value -> Debit
                Prepaid.value -> Prepaid
                Unknown.value -> Unknown
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
