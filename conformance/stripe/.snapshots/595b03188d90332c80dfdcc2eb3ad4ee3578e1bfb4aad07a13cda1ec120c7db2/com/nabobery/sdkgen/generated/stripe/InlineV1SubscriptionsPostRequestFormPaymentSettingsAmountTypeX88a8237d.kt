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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/
 * 0/properties/mandate_options/properties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/
 * 0/properties/mandate_options/properties/amount_type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountTypeX88a8237d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
