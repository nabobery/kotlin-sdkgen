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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/netwo
 * rk_options/properties/cartes_bancaires/properties/cb_avalgo.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/netwo
 * rk_options/properties/cartes_bancaires/properties/cb_avalgo
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `0`.
     */
    public data object _0 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b() {
        public override val `value`: String = "0"
    }

    /**
     * Documented value. Wire value: `1`.
     */
    public data object _1 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b() {
        public override val `value`: String = "1"
    }

    /**
     * Documented value. Wire value: `2`.
     */
    public data object _2 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b() {
        public override val `value`: String = "2"
    }

    /**
     * Documented value. Wire value: `3`.
     */
    public data object _3 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b() {
        public override val `value`: String = "3"
    }

    /**
     * Documented value. Wire value: `4`.
     */
    public data object _4 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b() {
        public override val `value`: String = "4"
    }

    /**
     * Documented value. Wire value: `A`.
     */
    public data object A : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b() {
        public override val `value`: String = "A"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b =
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

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCbAvalgoX39c9556b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
