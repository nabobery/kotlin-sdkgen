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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/upi/properties/mandate_options/properties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/upi/properties/mandate_options/properties/amount_type
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsAmountTypeXa561004e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
