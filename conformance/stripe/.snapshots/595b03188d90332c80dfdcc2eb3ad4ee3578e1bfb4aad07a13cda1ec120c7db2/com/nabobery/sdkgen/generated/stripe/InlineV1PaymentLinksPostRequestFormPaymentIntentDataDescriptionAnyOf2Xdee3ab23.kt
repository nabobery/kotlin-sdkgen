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
 * orm-urlencoded/schema/properties/payment_intent_data/properties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/description/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
