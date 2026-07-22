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
 * How card details were read in this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_present/properties/read_method
 */
@Serializable(with = InlinePaymentMethodDetailsCardPresentReadMethodX713d2924.Serializer::class)
public sealed class InlinePaymentMethodDetailsCardPresentReadMethodX713d2924 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `contact_emv`.
     */
    public data object ContactEmv : InlinePaymentMethodDetailsCardPresentReadMethodX713d2924() {
        public override val `value`: String = "contact_emv"
    }

    /**
     * Documented value. Wire value: `contactless_emv`.
     */
    public data object ContactlessEmv : InlinePaymentMethodDetailsCardPresentReadMethodX713d2924() {
        public override val `value`: String = "contactless_emv"
    }

    /**
     * Documented value. Wire value: `contactless_magstripe_mode`.
     */
    public data object ContactlessMagstripeMode : InlinePaymentMethodDetailsCardPresentReadMethodX713d2924() {
        public override val `value`: String = "contactless_magstripe_mode"
    }

    /**
     * Documented value. Wire value: `magnetic_stripe_fallback`.
     */
    public data object MagneticStripeFallback : InlinePaymentMethodDetailsCardPresentReadMethodX713d2924() {
        public override val `value`: String = "magnetic_stripe_fallback"
    }

    /**
     * Documented value. Wire value: `magnetic_stripe_track2`.
     */
    public data object MagneticStripeTrack2 : InlinePaymentMethodDetailsCardPresentReadMethodX713d2924() {
        public override val `value`: String = "magnetic_stripe_track2"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodDetailsCardPresentReadMethodX713d2924()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodDetailsCardPresentReadMethodX713d2924 =
            when (value) {
                ContactEmv.value -> ContactEmv
                ContactlessEmv.value -> ContactlessEmv
                ContactlessMagstripeMode.value -> ContactlessMagstripeMode
                MagneticStripeFallback.value -> MagneticStripeFallback
                MagneticStripeTrack2.value -> MagneticStripeTrack2
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsCardPresentReadMethodX713d2924> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCardPresentReadMethodX713d2924",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardPresentReadMethodX713d2924 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsCardPresentReadMethodX713d2924,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
