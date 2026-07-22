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
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders/get/responses/200/content/application~1json/schema/properti
 * es/object
 */
@Serializable(with = InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4.Serializer::class)
public sealed class InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4 =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ClimateOrdersGetResponse200JsonObjectValueX6220d9d4,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
