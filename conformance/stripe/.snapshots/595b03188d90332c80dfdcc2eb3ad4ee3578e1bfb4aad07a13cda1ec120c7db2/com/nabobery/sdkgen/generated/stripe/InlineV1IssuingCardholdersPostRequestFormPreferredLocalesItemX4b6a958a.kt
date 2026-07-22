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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/preferred_locales/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/preferred_locales/items
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a.Serializer::class)
public sealed class InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `es`.
     */
    public data object Es : InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a() {
        public override val `value`: String = "es"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `it`.
     */
    public data object It : InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a() {
        public override val `value`: String = "it"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a =
            when (value) {
                De.value -> De
                En.value -> En
                Es.value -> Es
                Fr.value -> Fr
                It.value -> It
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
