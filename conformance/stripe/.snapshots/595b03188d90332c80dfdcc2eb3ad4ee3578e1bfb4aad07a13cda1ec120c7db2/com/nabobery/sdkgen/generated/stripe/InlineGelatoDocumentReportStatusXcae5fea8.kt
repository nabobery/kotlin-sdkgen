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
 * Status of this `document` check.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/status
 */
@Serializable(with = InlineGelatoDocumentReportStatusXcae5fea8.Serializer::class)
public sealed class InlineGelatoDocumentReportStatusXcae5fea8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `unverified`.
     */
    public data object Unverified : InlineGelatoDocumentReportStatusXcae5fea8() {
        public override val `value`: String = "unverified"
    }

    /**
     * Documented value. Wire value: `verified`.
     */
    public data object Verified : InlineGelatoDocumentReportStatusXcae5fea8() {
        public override val `value`: String = "verified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineGelatoDocumentReportStatusXcae5fea8()

    public companion object {
        public fun fromValue(`value`: String): InlineGelatoDocumentReportStatusXcae5fea8 =
            when (value) {
                Unverified.value -> Unverified
                Verified.value -> Verified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineGelatoDocumentReportStatusXcae5fea8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineGelatoDocumentReportStatusXcae5fea8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportStatusXcae5fea8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineGelatoDocumentReportStatusXcae5fea8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
