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
 * Verification status, one of `pending`, `verified`, `unverified`, or `unavailable`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_id_verification/properties/status
 */
@Serializable(with = InlineTaxIdVerificationStatusX7596920a.Serializer::class)
public sealed class InlineTaxIdVerificationStatusX7596920a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineTaxIdVerificationStatusX7596920a() {
        public override val `value`: String = "pending"
    }

    /**
     * Documented value. Wire value: `unavailable`.
     */
    public data object Unavailable : InlineTaxIdVerificationStatusX7596920a() {
        public override val `value`: String = "unavailable"
    }

    /**
     * Documented value. Wire value: `unverified`.
     */
    public data object Unverified : InlineTaxIdVerificationStatusX7596920a() {
        public override val `value`: String = "unverified"
    }

    /**
     * Documented value. Wire value: `verified`.
     */
    public data object Verified : InlineTaxIdVerificationStatusX7596920a() {
        public override val `value`: String = "verified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxIdVerificationStatusX7596920a()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxIdVerificationStatusX7596920a =
            when (value) {
                Pending.value -> Pending
                Unavailable.value -> Unavailable
                Unverified.value -> Unverified
                Verified.value -> Verified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxIdVerificationStatusX7596920a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxIdVerificationStatusX7596920a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxIdVerificationStatusX7596920a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxIdVerificationStatusX7596920a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
