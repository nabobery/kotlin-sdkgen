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
 * The Electronic Commerce Indicator (ECI). A protocol-level field
 * indicating what degree of authentication was performed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/three_d_secure_details_charge/properties/electronic_commerce_indicat
 * or
 */
@Serializable(with = InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a.Serializer::class)
public sealed class InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `01`.
     */
    public data object _01 : InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a() {
        public override val `value`: String = "01"
    }

    /**
     * Documented value. Wire value: `02`.
     */
    public data object _02 : InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a() {
        public override val `value`: String = "02"
    }

    /**
     * Documented value. Wire value: `05`.
     */
    public data object _05 : InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a() {
        public override val `value`: String = "05"
    }

    /**
     * Documented value. Wire value: `06`.
     */
    public data object _06 : InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a() {
        public override val `value`: String = "06"
    }

    /**
     * Documented value. Wire value: `07`.
     */
    public data object _07 : InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a() {
        public override val `value`: String = "07"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a()

    public companion object {
        public fun fromValue(`value`: String): InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a =
            when (value) {
                _01.value -> _01
                _02.value -> _02
                _05.value -> _05
                _06.value -> _06
                _07.value -> _07
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineThreeDSecureDetailsChargeElectronicCommerceIndicatorXfc9e735a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
