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
 * One of `individual` or `company`. See [Choose a cardholder
 * type](https://docs.stripe.com/issuing/other/choose-cardholder) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/type
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0.Serializer::class)
public sealed class InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0 =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
