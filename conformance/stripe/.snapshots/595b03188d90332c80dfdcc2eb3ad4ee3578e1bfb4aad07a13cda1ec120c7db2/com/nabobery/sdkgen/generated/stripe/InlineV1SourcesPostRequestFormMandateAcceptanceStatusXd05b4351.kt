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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/mandate/properties/acceptance/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/mandate/properties/acceptance/properties/status
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `accepted`.
     */
    public data object Accepted : InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351() {
        public override val `value`: String = "accepted"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351() {
        public override val `value`: String = "pending"
    }

    /**
     * Documented value. Wire value: `refused`.
     */
    public data object Refused : InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351() {
        public override val `value`: String = "refused"
    }

    /**
     * Documented value. Wire value: `revoked`.
     */
    public data object Revoked : InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351() {
        public override val `value`: String = "revoked"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351 =
            when (value) {
                Accepted.value -> Accepted
                Pending.value -> Pending
                Refused.value -> Refused
                Revoked.value -> Revoked
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesPostRequestFormMandateAcceptanceStatusXd05b4351,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
