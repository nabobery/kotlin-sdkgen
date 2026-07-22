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
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/ares_trans_status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/ares_trans_status
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `A`.
     */
    public data object A : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39() {
        public override val `value`: String = "A"
    }

    /**
     * Documented value. Wire value: `C`.
     */
    public data object C : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39() {
        public override val `value`: String = "C"
    }

    /**
     * Documented value. Wire value: `I`.
     */
    public data object I : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39() {
        public override val `value`: String = "I"
    }

    /**
     * Documented value. Wire value: `N`.
     */
    public data object N : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39() {
        public override val `value`: String = "N"
    }

    /**
     * Documented value. Wire value: `R`.
     */
    public data object R : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39() {
        public override val `value`: String = "R"
    }

    /**
     * Documented value. Wire value: `U`.
     */
    public data object U : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39() {
        public override val `value`: String = "U"
    }

    /**
     * Documented value. Wire value: `Y`.
     */
    public data object Y : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39() {
        public override val `value`: String = "Y"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39 =
            when (value) {
                A.value -> A
                C.value -> C
                I.value -> I
                N.value -> N
                R.value -> R
                U.value -> U
                Y.value -> Y
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAresTransStatusX28781a39,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
