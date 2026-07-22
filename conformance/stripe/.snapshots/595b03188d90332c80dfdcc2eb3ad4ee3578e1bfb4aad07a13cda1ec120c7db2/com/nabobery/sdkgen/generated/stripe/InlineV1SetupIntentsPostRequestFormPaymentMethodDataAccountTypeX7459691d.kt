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
 * lencoded/schema/properties/payment_method_data/properties/us_bank_account/properties/account_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/us_bank_account/properties/account_type
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `checking`.
     */
    public data object Checking : InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d() {
        public override val `value`: String = "checking"
    }

    /**
     * Documented value. Wire value: `savings`.
     */
    public data object Savings : InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d() {
        public override val `value`: String = "savings"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d =
            when (value) {
                Checking.value -> Checking
                Savings.value -> Savings
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAccountTypeX7459691d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
