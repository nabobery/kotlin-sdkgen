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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alipay/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alipay/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
