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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/reason
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `canceled`.
     */
    public data object Canceled : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "canceled"
    }

    /**
     * Documented value. Wire value: `duplicate`.
     */
    public data object Duplicate : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "duplicate"
    }

    /**
     * Documented value. Wire value: `fraudulent`.
     */
    public data object Fraudulent : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "fraudulent"
    }

    /**
     * Documented value. Wire value: `merchandise_not_as_described`.
     */
    public data object MerchandiseNotAsDescribed : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "merchandise_not_as_described"
    }

    /**
     * Documented value. Wire value: `no_valid_authorization`.
     */
    public data object NoValidAuthorization : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "no_valid_authorization"
    }

    /**
     * Documented value. Wire value: `not_received`.
     */
    public data object NotReceived : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "not_received"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `service_not_as_described`.
     */
    public data object ServiceNotAsDescribed : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a() {
        public override val `value`: String = "service_not_as_described"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a =
            when (value) {
                Canceled.value -> Canceled
                Duplicate.value -> Duplicate
                Fraudulent.value -> Fraudulent
                MerchandiseNotAsDescribed.value -> MerchandiseNotAsDescribed
                NoValidAuthorization.value -> NoValidAuthorization
                NotReceived.value -> NotReceived
                Other.value -> Other
                ServiceNotAsDescribed.value -> ServiceNotAsDescribed
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReasonX7793221a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
