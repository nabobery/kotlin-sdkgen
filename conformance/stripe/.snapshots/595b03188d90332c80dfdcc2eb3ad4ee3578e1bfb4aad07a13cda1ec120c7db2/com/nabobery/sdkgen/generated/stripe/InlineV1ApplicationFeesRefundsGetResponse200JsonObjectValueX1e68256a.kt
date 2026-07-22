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
 * sdkgen://source/openapi.json#/paths/~1v1~1application_fees~1{id}~1refunds/get/responses/200/content/application~1json
 * /schema/properties/object
 */
@Serializable(with = InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a.Serializer::class)
public sealed class InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ApplicationFeesRefundsGetResponse200JsonObjectValueX1e68256a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
