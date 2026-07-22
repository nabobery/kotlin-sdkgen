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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/electronic_com
 * merce_indicator.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/electronic_com
 * merce_indicator
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `01`.
     */
    public data object _01 : InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7() {
        public override val `value`: String = "01"
    }

    /**
     * Documented value. Wire value: `02`.
     */
    public data object _02 : InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7() {
        public override val `value`: String = "02"
    }

    /**
     * Documented value. Wire value: `05`.
     */
    public data object _05 : InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7() {
        public override val `value`: String = "05"
    }

    /**
     * Documented value. Wire value: `06`.
     */
    public data object _06 : InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7() {
        public override val `value`: String = "06"
    }

    /**
     * Documented value. Wire value: `07`.
     */
    public data object _07 : InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7() {
        public override val `value`: String = "07"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7 =
            when (value) {
                _01.value -> _01
                _02.value -> _02
                _05.value -> _05
                _06.value -> _06
                _07.value -> _07
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormElectronicCommerceIn67d5Xce5437a7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
