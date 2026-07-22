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
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options/pro
 * perties/collection_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options/pro
 * perties/collection_method
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `paper`.
     */
    public data object Paper : InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c() {
        public override val `value`: String = "paper"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c =
            when (value) {
                Value.value -> Value
                Paper.value -> Paper
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormCollectionMethodX5794902c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
