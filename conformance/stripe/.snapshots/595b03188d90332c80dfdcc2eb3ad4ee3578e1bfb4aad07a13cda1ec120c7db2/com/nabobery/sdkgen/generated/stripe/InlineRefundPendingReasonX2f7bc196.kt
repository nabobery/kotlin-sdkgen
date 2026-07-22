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
 * Provides the reason for why the refund is pending. Possible values are: `processing`, `insufficient_funds`, or
 * `charge_pending`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/pending_reason
 */
@Serializable(with = InlineRefundPendingReasonX2f7bc196.Serializer::class)
public sealed class InlineRefundPendingReasonX2f7bc196 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `charge_pending`.
     */
    public data object ChargePending : InlineRefundPendingReasonX2f7bc196() {
        public override val `value`: String = "charge_pending"
    }

    /**
     * Documented value. Wire value: `insufficient_funds`.
     */
    public data object InsufficientFunds : InlineRefundPendingReasonX2f7bc196() {
        public override val `value`: String = "insufficient_funds"
    }

    /**
     * Documented value. Wire value: `processing`.
     */
    public data object Processing : InlineRefundPendingReasonX2f7bc196() {
        public override val `value`: String = "processing"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineRefundPendingReasonX2f7bc196()

    public companion object {
        public fun fromValue(`value`: String): InlineRefundPendingReasonX2f7bc196 =
            when (value) {
                ChargePending.value -> ChargePending
                InsufficientFunds.value -> InsufficientFunds
                Processing.value -> Processing
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineRefundPendingReasonX2f7bc196> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineRefundPendingReasonX2f7bc196",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineRefundPendingReasonX2f7bc196 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineRefundPendingReasonX2f7bc196,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
