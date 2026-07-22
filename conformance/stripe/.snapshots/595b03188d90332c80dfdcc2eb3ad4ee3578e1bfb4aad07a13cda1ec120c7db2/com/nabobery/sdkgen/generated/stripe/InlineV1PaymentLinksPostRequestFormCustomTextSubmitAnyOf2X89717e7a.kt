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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/submit/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/submit/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
