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
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/propert
 * ies/filters/properties/account_subcategories/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/propert
 * ies/filters/properties/account_subcategories/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `checking`.
     */
    public data object Checking : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e() {
        public override val `value`: String = "checking"
    }

    /**
     * Documented value. Wire value: `savings`.
     */
    public data object Savings : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e() {
        public override val `value`: String = "savings"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e =
            when (value) {
                Checking.value -> Checking
                Savings.value -> Savings
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX88193e9e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
