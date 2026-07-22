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
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1search/get/responses/200/content/application~1json/schema/propert
 * ies/object
 */
@Serializable(with = InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b.Serializer::class)
public sealed class InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `search_result`.
     */
    public data object SearchResult : InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b() {
        public override val `value`: String = "search_result"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b =
            when (value) {
                SearchResult.value -> SearchResult
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ProductsSearchGetResponse200JsonObjectValueX79be551b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
