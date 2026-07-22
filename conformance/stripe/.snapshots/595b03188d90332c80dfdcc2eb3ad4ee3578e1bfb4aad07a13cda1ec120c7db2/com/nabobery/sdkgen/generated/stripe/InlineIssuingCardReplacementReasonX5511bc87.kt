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
 * The reason why the previous card needed to be replaced.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/replacement_reason
 */
@Serializable(with = InlineIssuingCardReplacementReasonX5511bc87.Serializer::class)
public sealed class InlineIssuingCardReplacementReasonX5511bc87 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `damaged`.
     */
    public data object Damaged : InlineIssuingCardReplacementReasonX5511bc87() {
        public override val `value`: String = "damaged"
    }

    /**
     * Documented value. Wire value: `expired`.
     */
    public data object Expired : InlineIssuingCardReplacementReasonX5511bc87() {
        public override val `value`: String = "expired"
    }

    /**
     * Documented value. Wire value: `fulfillment_error`.
     */
    public data object FulfillmentError : InlineIssuingCardReplacementReasonX5511bc87() {
        public override val `value`: String = "fulfillment_error"
    }

    /**
     * Documented value. Wire value: `lost`.
     */
    public data object Lost : InlineIssuingCardReplacementReasonX5511bc87() {
        public override val `value`: String = "lost"
    }

    /**
     * Documented value. Wire value: `stolen`.
     */
    public data object Stolen : InlineIssuingCardReplacementReasonX5511bc87() {
        public override val `value`: String = "stolen"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingCardReplacementReasonX5511bc87()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingCardReplacementReasonX5511bc87 =
            when (value) {
                Damaged.value -> Damaged
                Expired.value -> Expired
                FulfillmentError.value -> FulfillmentError
                Lost.value -> Lost
                Stolen.value -> Stolen
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingCardReplacementReasonX5511bc87> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingCardReplacementReasonX5511bc87",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingCardReplacementReasonX5511bc87 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardReplacementReasonX5511bc87,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
