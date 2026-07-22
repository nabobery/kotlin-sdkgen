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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/political_exposure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/political_exposure
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6.Serializer::class)
public sealed class InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `existing`.
     */
    public data object Existing : InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6() {
        public override val `value`: String = "existing"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6 =
            when (value) {
                Existing.value -> Existing
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
