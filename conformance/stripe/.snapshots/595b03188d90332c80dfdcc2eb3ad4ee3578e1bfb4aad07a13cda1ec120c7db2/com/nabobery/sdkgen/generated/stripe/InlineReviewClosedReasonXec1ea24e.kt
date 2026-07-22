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
 * The reason the review was closed, or null if it has not yet been closed. One of `approved`, `refunded`,
 * `refunded_as_fraud`, `disputed`, `redacted`, `canceled`, `payment_never_settled`, or `acknowledged`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/review/properties/closed_reason
 */
@Serializable(with = InlineReviewClosedReasonXec1ea24e.Serializer::class)
public sealed class InlineReviewClosedReasonXec1ea24e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `acknowledged`.
     */
    public data object Acknowledged : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "acknowledged"
    }

    /**
     * Documented value. Wire value: `approved`.
     */
    public data object Approved : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "approved"
    }

    /**
     * Documented value. Wire value: `canceled`.
     */
    public data object Canceled : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "canceled"
    }

    /**
     * Documented value. Wire value: `disputed`.
     */
    public data object Disputed : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "disputed"
    }

    /**
     * Documented value. Wire value: `payment_never_settled`.
     */
    public data object PaymentNeverSettled : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "payment_never_settled"
    }

    /**
     * Documented value. Wire value: `redacted`.
     */
    public data object Redacted : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "redacted"
    }

    /**
     * Documented value. Wire value: `refunded`.
     */
    public data object Refunded : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "refunded"
    }

    /**
     * Documented value. Wire value: `refunded_as_fraud`.
     */
    public data object RefundedAsFraud : InlineReviewClosedReasonXec1ea24e() {
        public override val `value`: String = "refunded_as_fraud"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineReviewClosedReasonXec1ea24e()

    public companion object {
        public fun fromValue(`value`: String): InlineReviewClosedReasonXec1ea24e =
            when (value) {
                Acknowledged.value -> Acknowledged
                Approved.value -> Approved
                Canceled.value -> Canceled
                Disputed.value -> Disputed
                PaymentNeverSettled.value -> PaymentNeverSettled
                Redacted.value -> Redacted
                Refunded.value -> Refunded
                RefundedAsFraud.value -> RefundedAsFraud
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineReviewClosedReasonXec1ea24e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineReviewClosedReasonXec1ea24e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineReviewClosedReasonXec1ea24e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineReviewClosedReasonXec1ea24e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
