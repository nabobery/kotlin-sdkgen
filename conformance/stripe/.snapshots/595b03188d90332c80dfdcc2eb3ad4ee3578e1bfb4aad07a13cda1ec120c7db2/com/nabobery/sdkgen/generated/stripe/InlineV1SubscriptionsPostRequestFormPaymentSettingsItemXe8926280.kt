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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections/properties/filters/properties/account_subcategories/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections/properties/filters/properties/account_subcategories/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `checking`.
     */
    public data object Checking : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280() {
        public override val `value`: String = "checking"
    }

    /**
     * Documented value. Wire value: `savings`.
     */
    public data object Savings : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280() {
        public override val `value`: String = "savings"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280 =
            when (value) {
                Checking.value -> Checking
                Savings.value -> Savings
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
