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
 * ded/schema/properties/custom_text/properties/shipping_address/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/shipping_address/anyOf/1
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
