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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/processor_details/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/processor_details/properties/type
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb.Serializer::class)
public sealed class InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `custom`.
     */
    public data object Custom : InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb() {
        public override val `value`: String = "custom"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb =
            when (value) {
                Custom.value -> Custom
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsTypeX23aecdfb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
