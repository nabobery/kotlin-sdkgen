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
 * Account holder type: individual or company.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account/properties/account_holder_type
 */
@Serializable(with = InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668.Serializer::class)
public sealed class InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668 =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodUsBankAccountAccountHolderTypeX91c2d668,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
