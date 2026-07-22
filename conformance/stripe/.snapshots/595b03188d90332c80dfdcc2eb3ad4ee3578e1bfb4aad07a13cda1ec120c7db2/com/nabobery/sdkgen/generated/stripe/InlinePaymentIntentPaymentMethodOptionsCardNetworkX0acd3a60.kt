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
 * Selected network to process this payment intent on. Depends on the available networks of the card attached to the
 * payment intent. Can be only set confirm-time.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/network
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `amex`.
     */
    public data object Amex : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "amex"
    }

    /**
     * Documented value. Wire value: `cartes_bancaires`.
     */
    public data object CartesBancaires : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "cartes_bancaires"
    }

    /**
     * Documented value. Wire value: `diners`.
     */
    public data object Diners : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "diners"
    }

    /**
     * Documented value. Wire value: `discover`.
     */
    public data object Discover : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "discover"
    }

    /**
     * Documented value. Wire value: `eftpos_au`.
     */
    public data object EftposAu : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "eftpos_au"
    }

    /**
     * Documented value. Wire value: `girocard`.
     */
    public data object Girocard : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "girocard"
    }

    /**
     * Documented value. Wire value: `interac`.
     */
    public data object Interac : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "interac"
    }

    /**
     * Documented value. Wire value: `jcb`.
     */
    public data object Jcb : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "jcb"
    }

    /**
     * Documented value. Wire value: `link`.
     */
    public data object Link : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "link"
    }

    /**
     * Documented value. Wire value: `mastercard`.
     */
    public data object Mastercard : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "mastercard"
    }

    /**
     * Documented value. Wire value: `unionpay`.
     */
    public data object Unionpay : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "unionpay"
    }

    /**
     * Documented value. Wire value: `unknown`.
     */
    public data object Unknown : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "unknown"
    }

    /**
     * Documented value. Wire value: `visa`.
     */
    public data object Visa : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60() {
        public override val `value`: String = "visa"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60 =
            when (value) {
                Amex.value -> Amex
                CartesBancaires.value -> CartesBancaires
                Diners.value -> Diners
                Discover.value -> Discover
                EftposAu.value -> EftposAu
                Girocard.value -> Girocard
                Interac.value -> Interac
                Jcb.value -> Jcb
                Link.value -> Link
                Mastercard.value -> Mastercard
                Unionpay.value -> Unionpay
                Unknown.value -> Unknown
                Visa.value -> Visa
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsCardNetworkX0acd3a60,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
