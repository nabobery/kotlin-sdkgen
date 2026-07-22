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
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_card_restrictions/properties/brands_blocked/i
 * tems.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_card_restrictions/properties/brands_blocked/i
 * tems
 */
@Serializable(with = InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113.Serializer::class)
public sealed class InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `american_express`.
     */
    public data object AmericanExpress : InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113() {
        public override val `value`: String = "american_express"
    }

    /**
     * Documented value. Wire value: `discover_global_network`.
     */
    public data object DiscoverGlobalNetwork : InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113() {
        public override val `value`: String = "discover_global_network"
    }

    /**
     * Documented value. Wire value: `mastercard`.
     */
    public data object Mastercard : InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113() {
        public override val `value`: String = "mastercard"
    }

    /**
     * Documented value. Wire value: `visa`.
     */
    public data object Visa : InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113() {
        public override val `value`: String = "visa"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113 =
            when (value) {
                AmericanExpress.value -> AmericanExpress
                DiscoverGlobalNetwork.value -> DiscoverGlobalNetwork
                Mastercard.value -> Mastercard
                Visa.value -> Visa
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
