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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/network
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `amex`.
     */
    public data object Amex : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "amex"
    }

    /**
     * Documented value. Wire value: `cartes_bancaires`.
     */
    public data object CartesBancaires : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "cartes_bancaires"
    }

    /**
     * Documented value. Wire value: `diners`.
     */
    public data object Diners : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "diners"
    }

    /**
     * Documented value. Wire value: `discover`.
     */
    public data object Discover : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "discover"
    }

    /**
     * Documented value. Wire value: `eftpos_au`.
     */
    public data object EftposAu : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "eftpos_au"
    }

    /**
     * Documented value. Wire value: `girocard`.
     */
    public data object Girocard : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "girocard"
    }

    /**
     * Documented value. Wire value: `interac`.
     */
    public data object Interac : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "interac"
    }

    /**
     * Documented value. Wire value: `jcb`.
     */
    public data object Jcb : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "jcb"
    }

    /**
     * Documented value. Wire value: `link`.
     */
    public data object Link : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "link"
    }

    /**
     * Documented value. Wire value: `mastercard`.
     */
    public data object Mastercard : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "mastercard"
    }

    /**
     * Documented value. Wire value: `unionpay`.
     */
    public data object Unionpay : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "unionpay"
    }

    /**
     * Documented value. Wire value: `unknown`.
     */
    public data object Unknown : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "unknown"
    }

    /**
     * Documented value. Wire value: `visa`.
     */
    public data object Visa : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73() {
        public override val `value`: String = "visa"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73 =
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

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardNetworkX1ba5df73,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
