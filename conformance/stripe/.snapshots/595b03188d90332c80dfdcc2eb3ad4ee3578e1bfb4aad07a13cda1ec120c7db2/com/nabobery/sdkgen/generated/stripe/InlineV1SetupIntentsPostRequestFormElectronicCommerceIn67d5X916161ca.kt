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
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/electronic_commerce_indi
 * cator.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/electronic_commerce_indi
 * cator
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `01`.
     */
    public data object _01 : InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca() {
        public override val `value`: String = "01"
    }

    /**
     * Documented value. Wire value: `02`.
     */
    public data object _02 : InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca() {
        public override val `value`: String = "02"
    }

    /**
     * Documented value. Wire value: `05`.
     */
    public data object _05 : InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca() {
        public override val `value`: String = "05"
    }

    /**
     * Documented value. Wire value: `06`.
     */
    public data object _06 : InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca() {
        public override val `value`: String = "06"
    }

    /**
     * Documented value. Wire value: `07`.
     */
    public data object _07 : InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca() {
        public override val `value`: String = "07"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca =
            when (value) {
                _01.value -> _01
                _02.value -> _02
                _05.value -> _05
                _06.value -> _06
                _07.value -> _07
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormElectronicCommerceIn67d5X916161ca,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
