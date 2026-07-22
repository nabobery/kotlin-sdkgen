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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/three_d_secure/properties/result.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/three_d_secure/properties/result
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `attempt_acknowledged`.
     */
    public data object AttemptAcknowledged : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429() {
        public override val `value`: String = "attempt_acknowledged"
    }

    /**
     * Documented value. Wire value: `authenticated`.
     */
    public data object Authenticated : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429() {
        public override val `value`: String = "authenticated"
    }

    /**
     * Documented value. Wire value: `failed`.
     */
    public data object Failed : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429() {
        public override val `value`: String = "failed"
    }

    /**
     * Documented value. Wire value: `required`.
     */
    public data object Required : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429() {
        public override val `value`: String = "required"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429 =
            when (value) {
                AttemptAcknowledged.value -> AttemptAcknowledged
                Authenticated.value -> Authenticated
                Failed.value -> Failed
                Required.value -> Required
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
