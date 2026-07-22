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
 * Payment method type.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details/properties/type
 */
@Serializable(with = InlineDisputePaymentMethodDetailsTypeXf1692f08.Serializer::class)
public sealed class InlineDisputePaymentMethodDetailsTypeXf1692f08 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `amazon_pay`.
     */
    public data object AmazonPay : InlineDisputePaymentMethodDetailsTypeXf1692f08() {
        public override val `value`: String = "amazon_pay"
    }

    /**
     * Documented value. Wire value: `card`.
     */
    public data object Card : InlineDisputePaymentMethodDetailsTypeXf1692f08() {
        public override val `value`: String = "card"
    }

    /**
     * Documented value. Wire value: `klarna`.
     */
    public data object Klarna : InlineDisputePaymentMethodDetailsTypeXf1692f08() {
        public override val `value`: String = "klarna"
    }

    /**
     * Documented value. Wire value: `paypal`.
     */
    public data object Paypal : InlineDisputePaymentMethodDetailsTypeXf1692f08() {
        public override val `value`: String = "paypal"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineDisputePaymentMethodDetailsTypeXf1692f08()

    public companion object {
        public fun fromValue(`value`: String): InlineDisputePaymentMethodDetailsTypeXf1692f08 =
            when (value) {
                AmazonPay.value -> AmazonPay
                Card.value -> Card
                Klarna.value -> Klarna
                Paypal.value -> Paypal
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineDisputePaymentMethodDetailsTypeXf1692f08> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineDisputePaymentMethodDetailsTypeXf1692f08",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineDisputePaymentMethodDetailsTypeXf1692f08 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDisputePaymentMethodDetailsTypeXf1692f08,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
