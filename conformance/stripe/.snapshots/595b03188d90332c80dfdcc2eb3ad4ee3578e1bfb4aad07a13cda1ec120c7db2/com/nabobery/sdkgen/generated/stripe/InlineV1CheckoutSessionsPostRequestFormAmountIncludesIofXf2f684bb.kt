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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/amount_includes_iof.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/amount_includes_iof
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb =
            when (value) {
                Always.value -> Always
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofXf2f684bb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
