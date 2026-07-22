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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/fraud_details/properties/user_report.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/fraud_details/properties/user_report
 */
@Serializable(with = InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd.Serializer::class)
public sealed class InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `fraudulent`.
     */
    public data object Fraudulent : InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd() {
        public override val `value`: String = "fraudulent"
    }

    /**
     * Documented value. Wire value: `safe`.
     */
    public data object Safe : InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd() {
        public override val `value`: String = "safe"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd =
            when (value) {
                Value.value -> Value
                Fraudulent.value -> Fraudulent
                Safe.value -> Safe
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesPostRequestFormFraudDetailsUserReportX9d4f72cd,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
