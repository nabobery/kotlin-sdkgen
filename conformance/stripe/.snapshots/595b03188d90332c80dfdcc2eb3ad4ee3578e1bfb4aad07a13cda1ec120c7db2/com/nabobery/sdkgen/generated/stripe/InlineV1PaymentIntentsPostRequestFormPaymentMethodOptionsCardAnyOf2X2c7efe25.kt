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
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_kana/anyOf/1
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_kana/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
