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
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/expiry_check.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/expiry_check
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `match`.
     */
    public data object Match : InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7() {
        public override val `value`: String = "match"
    }

    /**
     * Documented value. Wire value: `mismatch`.
     */
    public data object Mismatch : InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7() {
        public override val `value`: String = "mismatch"
    }

    /**
     * Documented value. Wire value: `not_provided`.
     */
    public data object NotProvided : InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7() {
        public override val `value`: String = "not_provided"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7 =
            when (value) {
                Match.value -> Match
                Mismatch.value -> Mismatch
                NotProvided.value -> NotProvided
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing214aPostRequestFormExpiryCheckXf06ee4a7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
