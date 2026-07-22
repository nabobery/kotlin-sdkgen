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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/get/parameters/10/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/get/parameters/10/schema
 */
@Serializable(with = InlineV1IssuingCardsGetParameterXa4140d67.Serializer::class)
public sealed class InlineV1IssuingCardsGetParameterXa4140d67 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineV1IssuingCardsGetParameterXa4140d67() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `canceled`.
     */
    public data object Canceled : InlineV1IssuingCardsGetParameterXa4140d67() {
        public override val `value`: String = "canceled"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineV1IssuingCardsGetParameterXa4140d67() {
        public override val `value`: String = "inactive"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardsGetParameterXa4140d67()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardsGetParameterXa4140d67 =
            when (value) {
                Active.value -> Active
                Canceled.value -> Canceled
                Inactive.value -> Inactive
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardsGetParameterXa4140d67> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsGetParameterXa4140d67",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardsGetParameterXa4140d67 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardsGetParameterXa4140d67,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
