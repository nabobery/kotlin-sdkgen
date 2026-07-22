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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/political_exposure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/political_exposure
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `existing`.
     */
    public data object Existing : InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a() {
        public override val `value`: String = "existing"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a =
            when (value) {
                Existing.value -> Existing
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
