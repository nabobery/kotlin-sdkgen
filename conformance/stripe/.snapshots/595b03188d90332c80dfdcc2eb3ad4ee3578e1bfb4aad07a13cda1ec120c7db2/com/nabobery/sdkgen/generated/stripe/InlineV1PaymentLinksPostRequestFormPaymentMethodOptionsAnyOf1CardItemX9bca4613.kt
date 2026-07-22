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
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0/properties/brands_blocked/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0/properties/brands_blocked/anyOf/0/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `american_express`.
     */
    public data object AmericanExpress : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613() {
        public override val `value`: String = "american_express"
    }

    /**
     * Documented value. Wire value: `discover_global_network`.
     */
    public data object DiscoverGlobalNetwork : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613() {
        public override val `value`: String = "discover_global_network"
    }

    /**
     * Documented value. Wire value: `mastercard`.
     */
    public data object Mastercard : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613() {
        public override val `value`: String = "mastercard"
    }

    /**
     * Documented value. Wire value: `visa`.
     */
    public data object Visa : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613() {
        public override val `value`: String = "visa"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613 =
            when (value) {
                AmericanExpress.value -> AmericanExpress
                DiscoverGlobalNetwork.value -> DiscoverGlobalNetwork
                Mastercard.value -> Mastercard
                Visa.value -> Visa
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
