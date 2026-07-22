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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/passport/properties/files/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/passport/properties/files/items/anyOf/1
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2.Serializer::class)
public sealed class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
