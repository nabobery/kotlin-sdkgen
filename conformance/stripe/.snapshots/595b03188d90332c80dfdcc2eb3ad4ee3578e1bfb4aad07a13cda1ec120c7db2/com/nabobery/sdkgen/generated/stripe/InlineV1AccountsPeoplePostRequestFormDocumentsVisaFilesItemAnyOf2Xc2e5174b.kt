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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/visa/properties/files/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/visa/properties/files/items/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc2e5174b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
