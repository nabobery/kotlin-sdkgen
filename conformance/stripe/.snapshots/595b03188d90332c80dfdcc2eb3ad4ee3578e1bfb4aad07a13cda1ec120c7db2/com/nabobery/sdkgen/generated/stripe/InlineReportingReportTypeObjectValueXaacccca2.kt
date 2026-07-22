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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/reporting.report_type/properties/object
 */
@Serializable(with = InlineReportingReportTypeObjectValueXaacccca2.Serializer::class)
public sealed class InlineReportingReportTypeObjectValueXaacccca2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `reporting.report_type`.
     */
    public data object ReportingReportType : InlineReportingReportTypeObjectValueXaacccca2() {
        public override val `value`: String = "reporting.report_type"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineReportingReportTypeObjectValueXaacccca2()

    public companion object {
        public fun fromValue(`value`: String): InlineReportingReportTypeObjectValueXaacccca2 =
            when (value) {
                ReportingReportType.value -> ReportingReportType
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineReportingReportTypeObjectValueXaacccca2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineReportingReportTypeObjectValueXaacccca2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineReportingReportTypeObjectValueXaacccca2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineReportingReportTypeObjectValueXaacccca2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
