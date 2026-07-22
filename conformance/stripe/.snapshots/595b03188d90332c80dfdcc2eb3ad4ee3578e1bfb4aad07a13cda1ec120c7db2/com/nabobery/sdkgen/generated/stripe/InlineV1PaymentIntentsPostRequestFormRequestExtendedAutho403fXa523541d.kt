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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_extended_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_extended_authorization
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `if_available`.
     */
    public data object IfAvailable : InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d() {
        public override val `value`: String = "if_available"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d =
            when (value) {
                IfAvailable.value -> IfAvailable
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormRequestExtendedAutho403fXa523541d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
