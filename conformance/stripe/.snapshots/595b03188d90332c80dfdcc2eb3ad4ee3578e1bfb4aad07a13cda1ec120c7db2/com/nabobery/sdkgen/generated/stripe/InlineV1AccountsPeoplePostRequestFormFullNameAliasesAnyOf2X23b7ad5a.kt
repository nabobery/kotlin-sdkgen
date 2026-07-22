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
 * 1x-www-form-urlencoded/schema/properties/full_name_aliases/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/full_name_aliases/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
