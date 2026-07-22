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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/service.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/shipping/properties/service
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `express`.
     */
    public data object Express : InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d() {
        public override val `value`: String = "express"
    }

    /**
     * Documented value. Wire value: `priority`.
     */
    public data object Priority : InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d() {
        public override val `value`: String = "priority"
    }

    /**
     * Documented value. Wire value: `standard`.
     */
    public data object Standard : InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d() {
        public override val `value`: String = "standard"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d =
            when (value) {
                Express.value -> Express
                Priority.value -> Priority
                Standard.value -> Standard
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardsPostRequestFormShippingServiceXd9aa284d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
