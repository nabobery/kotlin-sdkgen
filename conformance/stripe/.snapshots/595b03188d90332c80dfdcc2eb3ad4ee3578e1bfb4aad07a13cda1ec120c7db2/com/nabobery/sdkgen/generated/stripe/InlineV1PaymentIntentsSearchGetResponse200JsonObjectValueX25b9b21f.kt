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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1search/get/responses/200/content/application~1json/schema/
 * properties/object
 */
@Serializable(with = InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f.Serializer::class)
public sealed class InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `search_result`.
     */
    public data object SearchResult : InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f() {
        public override val `value`: String = "search_result"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f =
            when (value) {
                SearchResult.value -> SearchResult
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsSearchGetResponse200JsonObjectValueX25b9b21f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
