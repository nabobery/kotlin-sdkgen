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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_options/properti
 * es/cartes_bancaires/properties/cb_avalgo.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/network_options/properti
 * es/cartes_bancaires/properties/cb_avalgo
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `0`.
     */
    public data object _0 : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b() {
        public override val `value`: String = "0"
    }

    /**
     * Documented value. Wire value: `1`.
     */
    public data object _1 : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b() {
        public override val `value`: String = "1"
    }

    /**
     * Documented value. Wire value: `2`.
     */
    public data object _2 : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b() {
        public override val `value`: String = "2"
    }

    /**
     * Documented value. Wire value: `3`.
     */
    public data object _3 : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b() {
        public override val `value`: String = "3"
    }

    /**
     * Documented value. Wire value: `4`.
     */
    public data object _4 : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b() {
        public override val `value`: String = "4"
    }

    /**
     * Documented value. Wire value: `A`.
     */
    public data object A : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b() {
        public override val `value`: String = "A"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b =
            when (value) {
                _0.value -> _0
                _1.value -> _1
                _2.value -> _2
                _3.value -> _3
                _4.value -> _4
                A.value -> A
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardCbAvalgoXa215cd6b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
