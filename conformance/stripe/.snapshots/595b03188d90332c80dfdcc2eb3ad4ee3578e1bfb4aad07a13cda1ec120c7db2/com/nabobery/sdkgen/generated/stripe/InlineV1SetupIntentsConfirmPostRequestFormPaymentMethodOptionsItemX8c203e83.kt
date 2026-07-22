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
 * s/default_for/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/propertie
 * s/default_for/items
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `invoice`.
     */
    public data object Invoice : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83() {
        public override val `value`: String = "invoice"
    }

    /**
     * Documented value. Wire value: `subscription`.
     */
    public data object Subscription : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83() {
        public override val `value`: String = "subscription"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83 =
            when (value) {
                Invoice.value -> Invoice
                Subscription.value -> Subscription
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX8c203e83,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
