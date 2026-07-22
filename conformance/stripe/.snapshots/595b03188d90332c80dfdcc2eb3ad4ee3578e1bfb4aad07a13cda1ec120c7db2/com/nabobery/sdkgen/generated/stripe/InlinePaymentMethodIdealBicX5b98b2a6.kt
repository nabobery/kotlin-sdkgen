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
 * The Bank Identifier Code of the customer's bank, if the bank was provided.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_ideal/properties/bic
 */
@Serializable(with = InlinePaymentMethodIdealBicX5b98b2a6.Serializer::class)
public sealed class InlinePaymentMethodIdealBicX5b98b2a6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ABNANL2A`.
     */
    public data object Abnanl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "ABNANL2A"
    }

    /**
     * Documented value. Wire value: `ADYBNL2A`.
     */
    public data object Adybnl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "ADYBNL2A"
    }

    /**
     * Documented value. Wire value: `ASNBNL21`.
     */
    public data object Asnbnl21 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "ASNBNL21"
    }

    /**
     * Documented value. Wire value: `BITSNL2A`.
     */
    public data object Bitsnl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "BITSNL2A"
    }

    /**
     * Documented value. Wire value: `BUNQNL2A`.
     */
    public data object Bunqnl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "BUNQNL2A"
    }

    /**
     * Documented value. Wire value: `BUUTNL2A`.
     */
    public data object Buutnl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "BUUTNL2A"
    }

    /**
     * Documented value. Wire value: `FNOMNL22`.
     */
    public data object Fnomnl22 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "FNOMNL22"
    }

    /**
     * Documented value. Wire value: `FVLBNL22`.
     */
    public data object Fvlbnl22 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "FVLBNL22"
    }

    /**
     * Documented value. Wire value: `HANDNL2A`.
     */
    public data object Handnl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "HANDNL2A"
    }

    /**
     * Documented value. Wire value: `INGBNL2A`.
     */
    public data object Ingbnl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "INGBNL2A"
    }

    /**
     * Documented value. Wire value: `KNABNL2H`.
     */
    public data object Knabnl2H : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "KNABNL2H"
    }

    /**
     * Documented value. Wire value: `MLLENL2A`.
     */
    public data object Mllenl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "MLLENL2A"
    }

    /**
     * Documented value. Wire value: `MOYONL21`.
     */
    public data object Moyonl21 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "MOYONL21"
    }

    /**
     * Documented value. Wire value: `NNBANL2G`.
     */
    public data object Nnbanl2G : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "NNBANL2G"
    }

    /**
     * Documented value. Wire value: `NTSBDEB1`.
     */
    public data object Ntsbdeb1 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "NTSBDEB1"
    }

    /**
     * Documented value. Wire value: `RABONL2U`.
     */
    public data object Rabonl2U : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "RABONL2U"
    }

    /**
     * Documented value. Wire value: `RBRBNL21`.
     */
    public data object Rbrbnl21 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "RBRBNL21"
    }

    /**
     * Documented value. Wire value: `REVOIE23`.
     */
    public data object Revoie23 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "REVOIE23"
    }

    /**
     * Documented value. Wire value: `REVOLT21`.
     */
    public data object Revolt21 : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "REVOLT21"
    }

    /**
     * Documented value. Wire value: `SNSBNL2A`.
     */
    public data object Snsbnl2A : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "SNSBNL2A"
    }

    /**
     * Documented value. Wire value: `TRIONL2U`.
     */
    public data object Trionl2U : InlinePaymentMethodIdealBicX5b98b2a6() {
        public override val `value`: String = "TRIONL2U"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodIdealBicX5b98b2a6()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodIdealBicX5b98b2a6 =
            when (value) {
                Abnanl2A.value -> Abnanl2A
                Adybnl2A.value -> Adybnl2A
                Asnbnl21.value -> Asnbnl21
                Bitsnl2A.value -> Bitsnl2A
                Bunqnl2A.value -> Bunqnl2A
                Buutnl2A.value -> Buutnl2A
                Fnomnl22.value -> Fnomnl22
                Fvlbnl22.value -> Fvlbnl22
                Handnl2A.value -> Handnl2A
                Ingbnl2A.value -> Ingbnl2A
                Knabnl2H.value -> Knabnl2H
                Mllenl2A.value -> Mllenl2A
                Moyonl21.value -> Moyonl21
                Nnbanl2G.value -> Nnbanl2G
                Ntsbdeb1.value -> Ntsbdeb1
                Rabonl2U.value -> Rabonl2U
                Rbrbnl21.value -> Rbrbnl21
                Revoie23.value -> Revoie23
                Revolt21.value -> Revolt21
                Snsbnl2A.value -> Snsbnl2A
                Trionl2U.value -> Trionl2U
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodIdealBicX5b98b2a6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodIdealBicX5b98b2a6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodIdealBicX5b98b2a6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodIdealBicX5b98b2a6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
