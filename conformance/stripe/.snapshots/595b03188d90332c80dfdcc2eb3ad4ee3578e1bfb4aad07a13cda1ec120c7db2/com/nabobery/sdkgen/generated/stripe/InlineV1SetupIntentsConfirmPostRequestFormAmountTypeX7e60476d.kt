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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/mandate_options/properties/amou
 * nt_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/mandate_options/properties/amou
 * nt_type
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormAmountTypeX7e60476d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
