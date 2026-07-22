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
 * A short machine-readable string giving the reason for the verification failure.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_phone_report_error/properties/code
 */
@Serializable(with = InlineGelatoPhoneReportErrorCodeX94340781.Serializer::class)
public sealed class InlineGelatoPhoneReportErrorCodeX94340781 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `phone_unverified_other`.
     */
    public data object PhoneUnverifiedOther : InlineGelatoPhoneReportErrorCodeX94340781() {
        public override val `value`: String = "phone_unverified_other"
    }

    /**
     * Documented value. Wire value: `phone_verification_declined`.
     */
    public data object PhoneVerificationDeclined : InlineGelatoPhoneReportErrorCodeX94340781() {
        public override val `value`: String = "phone_verification_declined"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineGelatoPhoneReportErrorCodeX94340781()

    public companion object {
        public fun fromValue(`value`: String): InlineGelatoPhoneReportErrorCodeX94340781 =
            when (value) {
                PhoneUnverifiedOther.value -> PhoneUnverifiedOther
                PhoneVerificationDeclined.value -> PhoneVerificationDeclined
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineGelatoPhoneReportErrorCodeX94340781> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineGelatoPhoneReportErrorCodeX94340781",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineGelatoPhoneReportErrorCodeX94340781 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineGelatoPhoneReportErrorCodeX94340781,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
