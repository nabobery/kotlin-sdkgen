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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
