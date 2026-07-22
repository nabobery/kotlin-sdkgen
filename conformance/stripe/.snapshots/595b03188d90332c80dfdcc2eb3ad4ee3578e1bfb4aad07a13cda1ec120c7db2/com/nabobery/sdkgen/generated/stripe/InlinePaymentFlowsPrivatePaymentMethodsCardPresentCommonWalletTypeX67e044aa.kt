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
 * The type of mobile wallet, one of `apple_pay`, `google_pay`, `samsung_pay`, or `unknown`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_card_present_common_wallet/pro
 * perties/type
 */
@Serializable(with = InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa.Serializer::class)
public sealed class InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `apple_pay`.
     */
    public data object ApplePay : InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa() {
        public override val `value`: String = "apple_pay"
    }

    /**
     * Documented value. Wire value: `google_pay`.
     */
    public data object GooglePay : InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa() {
        public override val `value`: String = "google_pay"
    }

    /**
     * Documented value. Wire value: `samsung_pay`.
     */
    public data object SamsungPay : InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa() {
        public override val `value`: String = "samsung_pay"
    }

    /**
     * Documented value. Wire value: `unknown`.
     */
    public data object Unknown : InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa() {
        public override val `value`: String = "unknown"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa =
            when (value) {
                ApplePay.value -> ApplePay
                GooglePay.value -> GooglePay
                SamsungPay.value -> SamsungPay
                Unknown.value -> Unknown
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentFlowsPrivatePaymentMethodsCardPresentCommonWalletTypeX67e044aa,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
