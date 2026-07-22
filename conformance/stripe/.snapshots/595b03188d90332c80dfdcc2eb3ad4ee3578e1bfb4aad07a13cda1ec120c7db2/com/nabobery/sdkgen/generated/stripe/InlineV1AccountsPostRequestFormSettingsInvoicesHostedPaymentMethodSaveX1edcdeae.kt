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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/invoices/properties/hosted_payment_method_save.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/invoices/properties/hosted_payment_method_save
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae() {
        public override val `value`: String = "never"
    }

    /**
     * Documented value. Wire value: `offer`.
     */
    public data object Offer : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae() {
        public override val `value`: String = "offer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae =
            when (value) {
                Always.value -> Always
                Never.value -> Never
                Offer.value -> Offer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsInvoicesHostedPaymentMethodSaveX1edcdeae,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
