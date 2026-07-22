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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/customer_balance/properties/funding_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/customer_balance/properties/funding_type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `bank_transfer`.
     */
    public data object BankTransfer : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb() {
        public override val `value`: String = "bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb =
            when (value) {
                BankTransfer.value -> BankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
