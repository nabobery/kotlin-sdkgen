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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/amount_includes_iof.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/amount_includes_iof
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d =
            when (value) {
                Always.value -> Always
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXa14e165d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
