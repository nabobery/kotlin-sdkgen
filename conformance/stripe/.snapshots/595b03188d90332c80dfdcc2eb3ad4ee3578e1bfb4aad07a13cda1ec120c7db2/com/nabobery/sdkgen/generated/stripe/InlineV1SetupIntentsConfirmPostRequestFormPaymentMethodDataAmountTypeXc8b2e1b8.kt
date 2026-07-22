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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/upi/properties/mandate_options/properties/amount_t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/upi/properties/mandate_options/properties/amount_t
 * ype
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8 =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAmountTypeXc8b2e1b8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
