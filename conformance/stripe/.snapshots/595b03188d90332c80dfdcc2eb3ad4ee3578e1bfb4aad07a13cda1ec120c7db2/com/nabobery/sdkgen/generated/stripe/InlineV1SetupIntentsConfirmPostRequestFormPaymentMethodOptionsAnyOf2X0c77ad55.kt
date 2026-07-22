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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/propertie
 * s/custom_mandate_url/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/propertie
 * s/custom_mandate_url/anyOf/1
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X0c77ad55,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
