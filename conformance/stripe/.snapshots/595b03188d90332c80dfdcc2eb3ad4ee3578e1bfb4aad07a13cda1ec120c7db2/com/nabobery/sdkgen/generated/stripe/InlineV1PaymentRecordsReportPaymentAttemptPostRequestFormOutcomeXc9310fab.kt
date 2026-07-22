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
 * The outcome of the reported payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/outcome
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab.Serializer::class)
public sealed class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `failed`.
     */
    public data object Failed : InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab() {
        public override val `value`: String = "failed"
    }

    /**
     * Documented value. Wire value: `guaranteed`.
     */
    public data object Guaranteed : InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab() {
        public override val `value`: String = "guaranteed"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab =
            when (value) {
                Failed.value -> Failed
                Guaranteed.value -> Guaranteed
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormOutcomeXc9310fab,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
