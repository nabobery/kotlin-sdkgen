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
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1products/get/responses/200/content/application~1json/schema/proper
 * ties/object
 */
@Serializable(with = InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb.Serializer::class)
public sealed class InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ClimateProductsGetResponse200JsonObjectValueX0d2bcabb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
