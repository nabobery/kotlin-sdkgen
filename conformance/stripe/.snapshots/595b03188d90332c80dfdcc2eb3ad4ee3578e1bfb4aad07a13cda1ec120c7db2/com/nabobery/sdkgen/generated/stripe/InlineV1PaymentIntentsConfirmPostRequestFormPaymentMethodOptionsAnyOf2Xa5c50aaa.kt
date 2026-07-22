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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa5c50aaa,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
