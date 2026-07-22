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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
