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
 * Whether the cardholder provided a CVC and if it matched Stripe’s record.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_verification_data/properties/cvc_check
 */
@Serializable(with = InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d.Serializer::class)
public sealed class InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `match`.
     */
    public data object Match : InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d() {
        public override val `value`: String = "match"
    }

    /**
     * Documented value. Wire value: `mismatch`.
     */
    public data object Mismatch : InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d() {
        public override val `value`: String = "mismatch"
    }

    /**
     * Documented value. Wire value: `not_provided`.
     */
    public data object NotProvided : InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d() {
        public override val `value`: String = "not_provided"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d =
            when (value) {
                Match.value -> Match
                Mismatch.value -> Mismatch
                NotProvided.value -> NotProvided
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationVerificationDataCvcCheckX82d5aa7d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
