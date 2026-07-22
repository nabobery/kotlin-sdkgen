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
 * The outcome of the reported refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/outcome
 */
@Serializable(with = InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5.Serializer::class)
public sealed class InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `refunded`.
     */
    public data object Refunded : InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5() {
        public override val `value`: String = "refunded"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5 =
            when (value) {
                Refunded.value -> Refunded
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportRefundPostRequestFormOutcomeX91ed38c5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
