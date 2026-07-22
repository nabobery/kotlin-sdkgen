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
 * The payment status of the Checkout Session, one of `paid`, `unpaid`, or `no_payment_required`.
 * You can use this value to decide when to fulfill your customer's order.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/payment_status
 */
@Serializable(with = InlineCheckoutSessionPaymentStatusX0c3c2c7c.Serializer::class)
public sealed class InlineCheckoutSessionPaymentStatusX0c3c2c7c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `no_payment_required`.
     */
    public data object NoPaymentRequired : InlineCheckoutSessionPaymentStatusX0c3c2c7c() {
        public override val `value`: String = "no_payment_required"
    }

    /**
     * Documented value. Wire value: `paid`.
     */
    public data object Paid : InlineCheckoutSessionPaymentStatusX0c3c2c7c() {
        public override val `value`: String = "paid"
    }

    /**
     * Documented value. Wire value: `unpaid`.
     */
    public data object Unpaid : InlineCheckoutSessionPaymentStatusX0c3c2c7c() {
        public override val `value`: String = "unpaid"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutSessionPaymentStatusX0c3c2c7c()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutSessionPaymentStatusX0c3c2c7c =
            when (value) {
                NoPaymentRequired.value -> NoPaymentRequired
                Paid.value -> Paid
                Unpaid.value -> Unpaid
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionPaymentStatusX0c3c2c7c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionPaymentStatusX0c3c2c7c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionPaymentStatusX0c3c2c7c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionPaymentStatusX0c3c2c7c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
