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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_types/get/responses/200/content/application~1json/schema/
 * properties/object
 */
@Serializable(with = InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e.Serializer::class)
public sealed class InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ReportingReportTypesGetResponse200JsonObjectValueX674dca2e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
