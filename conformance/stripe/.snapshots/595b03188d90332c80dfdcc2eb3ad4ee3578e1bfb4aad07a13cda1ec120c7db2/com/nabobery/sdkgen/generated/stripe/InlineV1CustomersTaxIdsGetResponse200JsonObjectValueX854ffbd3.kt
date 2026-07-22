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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1tax_ids/get/responses/200/content/application~1json/
 * schema/properties/object
 */
@Serializable(with = InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3.Serializer::class)
public sealed class InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3 =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersTaxIdsGetResponse200JsonObjectValueX854ffbd3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
