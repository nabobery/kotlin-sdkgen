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
 * Determines the position and visibility of the payment method reuse agreement in the UI. When set to `auto`, Stripe's
 * defaults will be used.
 *
 * When set to `hidden`, the payment method reuse agreement text will always be hidden in the UI.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_payment_method_reuse_agreement/proper
 * ties/position
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `hidden`.
     */
    public data object Hidden : InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55() {
        public override val `value`: String = "hidden"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55 =
            when (value) {
                Auto.value -> Auto
                Hidden.value -> Hidden
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
