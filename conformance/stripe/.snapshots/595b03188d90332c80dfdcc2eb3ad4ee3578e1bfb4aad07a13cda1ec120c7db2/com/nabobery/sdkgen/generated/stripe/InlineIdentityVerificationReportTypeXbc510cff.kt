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
 * Type of report.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_report/properties/type
 */
@Serializable(with = InlineIdentityVerificationReportTypeXbc510cff.Serializer::class)
public sealed class InlineIdentityVerificationReportTypeXbc510cff {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `document`.
     */
    public data object Document : InlineIdentityVerificationReportTypeXbc510cff() {
        public override val `value`: String = "document"
    }

    /**
     * Documented value. Wire value: `id_number`.
     */
    public data object IdNumber : InlineIdentityVerificationReportTypeXbc510cff() {
        public override val `value`: String = "id_number"
    }

    /**
     * Documented value. Wire value: `verification_flow`.
     */
    public data object VerificationFlow : InlineIdentityVerificationReportTypeXbc510cff() {
        public override val `value`: String = "verification_flow"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIdentityVerificationReportTypeXbc510cff()

    public companion object {
        public fun fromValue(`value`: String): InlineIdentityVerificationReportTypeXbc510cff =
            when (value) {
                Document.value -> Document
                IdNumber.value -> IdNumber
                VerificationFlow.value -> VerificationFlow
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIdentityVerificationReportTypeXbc510cff> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIdentityVerificationReportTypeXbc510cff",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIdentityVerificationReportTypeXbc510cff =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIdentityVerificationReportTypeXbc510cff,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
