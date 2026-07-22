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
 * The type of the card wallet, one of `apple_pay`, `google_pay`, or `link`. An additional hash is included on the
 * Wallet subhash with a name matching this value. It contains additional information specific to the card wallet type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_card_wallet/properties/type
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e.Serializer::class)
public sealed class InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `apple_pay`.
     */
    public data object ApplePay : InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e() {
        public override val `value`: String = "apple_pay"
    }

    /**
     * Documented value. Wire value: `google_pay`.
     */
    public data object GooglePay : InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e() {
        public override val `value`: String = "google_pay"
    }

    /**
     * Documented value. Wire value: `link`.
     */
    public data object Link : InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e() {
        public override val `value`: String = "link"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e()

    public companion object {
        public fun fromValue(`value`: String): InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e =
            when (value) {
                ApplePay.value -> ApplePay
                GooglePay.value -> GooglePay
                Link.value -> Link
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
