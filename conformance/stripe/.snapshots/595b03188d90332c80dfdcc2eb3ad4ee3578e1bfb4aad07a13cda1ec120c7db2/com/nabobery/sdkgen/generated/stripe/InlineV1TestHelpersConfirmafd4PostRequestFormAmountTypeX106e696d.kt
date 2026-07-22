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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/upi/properties/mandate_options/properties/amount_
 * type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/upi/properties/mandate_options/properties/amount_
 * type
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d.Serializer::class)
public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersConfirmafd4PostRequestFormAmountTypeX106e696d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
