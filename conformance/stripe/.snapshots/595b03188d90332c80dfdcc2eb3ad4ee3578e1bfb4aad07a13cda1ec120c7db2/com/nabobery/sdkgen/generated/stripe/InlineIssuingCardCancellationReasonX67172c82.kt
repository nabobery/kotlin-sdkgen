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
 * The reason why the card was canceled.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/cancellation_reason
 */
@Serializable(with = InlineIssuingCardCancellationReasonX67172c82.Serializer::class)
public sealed class InlineIssuingCardCancellationReasonX67172c82 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `design_rejected`.
     */
    public data object DesignRejected : InlineIssuingCardCancellationReasonX67172c82() {
        public override val `value`: String = "design_rejected"
    }

    /**
     * Documented value. Wire value: `fulfillment_error`.
     */
    public data object FulfillmentError : InlineIssuingCardCancellationReasonX67172c82() {
        public override val `value`: String = "fulfillment_error"
    }

    /**
     * Documented value. Wire value: `lost`.
     */
    public data object Lost : InlineIssuingCardCancellationReasonX67172c82() {
        public override val `value`: String = "lost"
    }

    /**
     * Documented value. Wire value: `stolen`.
     */
    public data object Stolen : InlineIssuingCardCancellationReasonX67172c82() {
        public override val `value`: String = "stolen"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingCardCancellationReasonX67172c82()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingCardCancellationReasonX67172c82 =
            when (value) {
                DesignRejected.value -> DesignRejected
                FulfillmentError.value -> FulfillmentError
                Lost.value -> Lost
                Stolen.value -> Stolen
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingCardCancellationReasonX67172c82> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingCardCancellationReasonX67172c82",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingCardCancellationReasonX67172c82 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardCancellationReasonX67172c82,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
