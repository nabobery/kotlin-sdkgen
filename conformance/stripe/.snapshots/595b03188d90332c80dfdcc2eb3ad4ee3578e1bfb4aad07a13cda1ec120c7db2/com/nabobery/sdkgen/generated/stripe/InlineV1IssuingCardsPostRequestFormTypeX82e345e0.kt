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
 * The type of card to issue. Possible values are `physical` or `virtual`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/type
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormTypeX82e345e0.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormTypeX82e345e0 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `physical`.
     */
    public data object Physical : InlineV1IssuingCardsPostRequestFormTypeX82e345e0() {
        public override val `value`: String = "physical"
    }

    /**
     * Documented value. Wire value: `virtual`.
     */
    public data object Virtual : InlineV1IssuingCardsPostRequestFormTypeX82e345e0() {
        public override val `value`: String = "virtual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardsPostRequestFormTypeX82e345e0()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormTypeX82e345e0 =
            when (value) {
                Physical.value -> Physical
                Virtual.value -> Virtual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormTypeX82e345e0> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormTypeX82e345e0",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormTypeX82e345e0 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardsPostRequestFormTypeX82e345e0,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
