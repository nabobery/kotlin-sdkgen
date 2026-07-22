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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount/anyOf/1
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1ce2be5e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
