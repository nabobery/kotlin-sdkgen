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
 * Type of the document.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/type
 */
@Serializable(with = InlineGelatoDocumentReportTypeXef41d7e5.Serializer::class)
public sealed class InlineGelatoDocumentReportTypeXef41d7e5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `driving_license`.
     */
    public data object DrivingLicense : InlineGelatoDocumentReportTypeXef41d7e5() {
        public override val `value`: String = "driving_license"
    }

    /**
     * Documented value. Wire value: `id_card`.
     */
    public data object IdCard : InlineGelatoDocumentReportTypeXef41d7e5() {
        public override val `value`: String = "id_card"
    }

    /**
     * Documented value. Wire value: `passport`.
     */
    public data object Passport : InlineGelatoDocumentReportTypeXef41d7e5() {
        public override val `value`: String = "passport"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineGelatoDocumentReportTypeXef41d7e5()

    public companion object {
        public fun fromValue(`value`: String): InlineGelatoDocumentReportTypeXef41d7e5 =
            when (value) {
                DrivingLicense.value -> DrivingLicense
                IdCard.value -> IdCard
                Passport.value -> Passport
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineGelatoDocumentReportTypeXef41d7e5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineGelatoDocumentReportTypeXef41d7e5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportTypeXef41d7e5 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineGelatoDocumentReportTypeXef41d7e5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
