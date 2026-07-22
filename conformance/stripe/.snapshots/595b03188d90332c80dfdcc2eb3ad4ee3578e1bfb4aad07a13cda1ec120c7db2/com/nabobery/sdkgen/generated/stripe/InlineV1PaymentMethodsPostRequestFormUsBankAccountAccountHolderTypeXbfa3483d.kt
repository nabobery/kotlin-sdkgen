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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/us_bank_account/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/us_bank_account/properties/account_holder_type
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
