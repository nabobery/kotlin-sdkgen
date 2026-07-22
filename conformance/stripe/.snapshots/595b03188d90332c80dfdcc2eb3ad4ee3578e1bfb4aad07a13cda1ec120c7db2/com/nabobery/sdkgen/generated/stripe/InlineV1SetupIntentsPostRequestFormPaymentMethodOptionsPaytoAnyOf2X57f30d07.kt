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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount/anyOf
 * /1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount/anyOf
 * /1
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
