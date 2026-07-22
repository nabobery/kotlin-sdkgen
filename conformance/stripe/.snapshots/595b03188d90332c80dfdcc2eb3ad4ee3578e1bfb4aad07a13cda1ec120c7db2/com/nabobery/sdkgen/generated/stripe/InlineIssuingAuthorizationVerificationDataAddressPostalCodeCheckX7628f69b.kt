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
 * Whether the cardholder provided a postal code and if it matched the cardholder’s `billing.address.postal_code`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_verification_data/properties/address_postal_co
 * de_check
 */
@Serializable(with = InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b.Serializer::class)
public sealed class InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `match`.
     */
    public data object Match : InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b() {
        public override val `value`: String = "match"
    }

    /**
     * Documented value. Wire value: `mismatch`.
     */
    public data object Mismatch : InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b() {
        public override val `value`: String = "mismatch"
    }

    /**
     * Documented value. Wire value: `not_provided`.
     */
    public data object NotProvided : InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b() {
        public override val `value`: String = "not_provided"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b =
            when (value) {
                Match.value -> Match
                Mismatch.value -> Mismatch
                NotProvided.value -> NotProvided
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationVerificationDataAddressPostalCodeCheckX7628f69b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
