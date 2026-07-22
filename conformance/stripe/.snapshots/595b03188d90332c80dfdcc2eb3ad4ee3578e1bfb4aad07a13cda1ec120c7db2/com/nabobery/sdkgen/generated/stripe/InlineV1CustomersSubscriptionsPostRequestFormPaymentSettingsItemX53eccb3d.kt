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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/financial_connections/properties/filters/properties/account_subcategor
 * ies/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account/anyOf/0/properties/financial_connections/properties/filters/properties/account_subcategor
 * ies/items
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `checking`.
     */
    public data object Checking : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d() {
        public override val `value`: String = "checking"
    }

    /**
     * Documented value. Wire value: `savings`.
     */
    public data object Savings : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d() {
        public override val `value`: String = "savings"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d =
            when (value) {
                Checking.value -> Checking
                Savings.value -> Savings
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX53eccb3d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
