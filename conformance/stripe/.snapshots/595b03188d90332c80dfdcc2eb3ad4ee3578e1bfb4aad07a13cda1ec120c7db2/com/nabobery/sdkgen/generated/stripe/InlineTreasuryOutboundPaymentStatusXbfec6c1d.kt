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
 * Current status of the OutboundPayment: `processing`, `failed`, `posted`, `returned`, `canceled`. An OutboundPayment
 * is `processing` if it has been created and is pending. The status changes to `posted` once the OutboundPayment has
 * been "confirmed" and funds have left the account, or to `failed` or `canceled`. If an OutboundPayment fails to arrive
 * at its destination, its status will change to `returned`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment/properties/status
 */
@Serializable(with = InlineTreasuryOutboundPaymentStatusXbfec6c1d.Serializer::class)
public sealed class InlineTreasuryOutboundPaymentStatusXbfec6c1d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `canceled`.
     */
    public data object Canceled : InlineTreasuryOutboundPaymentStatusXbfec6c1d() {
        public override val `value`: String = "canceled"
    }

    /**
     * Documented value. Wire value: `failed`.
     */
    public data object Failed : InlineTreasuryOutboundPaymentStatusXbfec6c1d() {
        public override val `value`: String = "failed"
    }

    /**
     * Documented value. Wire value: `posted`.
     */
    public data object Posted : InlineTreasuryOutboundPaymentStatusXbfec6c1d() {
        public override val `value`: String = "posted"
    }

    /**
     * Documented value. Wire value: `processing`.
     */
    public data object Processing : InlineTreasuryOutboundPaymentStatusXbfec6c1d() {
        public override val `value`: String = "processing"
    }

    /**
     * Documented value. Wire value: `returned`.
     */
    public data object Returned : InlineTreasuryOutboundPaymentStatusXbfec6c1d() {
        public override val `value`: String = "returned"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryOutboundPaymentStatusXbfec6c1d()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryOutboundPaymentStatusXbfec6c1d =
            when (value) {
                Canceled.value -> Canceled
                Failed.value -> Failed
                Posted.value -> Posted
                Processing.value -> Processing
                Returned.value -> Returned
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryOutboundPaymentStatusXbfec6c1d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundPaymentStatusXbfec6c1d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentStatusXbfec6c1d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryOutboundPaymentStatusXbfec6c1d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
