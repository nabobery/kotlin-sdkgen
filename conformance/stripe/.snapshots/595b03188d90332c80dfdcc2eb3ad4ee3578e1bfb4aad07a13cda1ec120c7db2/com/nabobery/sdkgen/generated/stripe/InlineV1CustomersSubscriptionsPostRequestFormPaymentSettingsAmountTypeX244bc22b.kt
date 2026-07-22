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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/pr
 * operties/mandate_options/properties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/pr
 * operties/mandate_options/properties/amount_type
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAmountTypeX244bc22b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
