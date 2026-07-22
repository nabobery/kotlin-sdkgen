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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/invoice_settings/properties/issuer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/invoice_settings/properties/issuer/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `self`.
     */
    public data object Self : InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d() {
        public override val `value`: String = "self"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d =
            when (value) {
                Account.value -> Account
                Self.value -> Self
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsTypeXfbd1739d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
