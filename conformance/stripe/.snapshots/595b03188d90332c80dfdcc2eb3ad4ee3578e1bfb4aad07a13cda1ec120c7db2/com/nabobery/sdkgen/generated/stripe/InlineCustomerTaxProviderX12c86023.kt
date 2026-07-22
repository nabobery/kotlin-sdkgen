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
 * The tax calculation provider used for location resolution. Defaults to `stripe` when not using a [third-party
 * provider](/tax/third-party-apps).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_tax/properties/provider
 */
@Serializable(with = InlineCustomerTaxProviderX12c86023.Serializer::class)
public sealed class InlineCustomerTaxProviderX12c86023 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `anrok`.
     */
    public data object Anrok : InlineCustomerTaxProviderX12c86023() {
        public override val `value`: String = "anrok"
    }

    /**
     * Documented value. Wire value: `avalara`.
     */
    public data object Avalara : InlineCustomerTaxProviderX12c86023() {
        public override val `value`: String = "avalara"
    }

    /**
     * Documented value. Wire value: `sphere`.
     */
    public data object Sphere : InlineCustomerTaxProviderX12c86023() {
        public override val `value`: String = "sphere"
    }

    /**
     * Documented value. Wire value: `stripe`.
     */
    public data object Stripe : InlineCustomerTaxProviderX12c86023() {
        public override val `value`: String = "stripe"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCustomerTaxProviderX12c86023()

    public companion object {
        public fun fromValue(`value`: String): InlineCustomerTaxProviderX12c86023 =
            when (value) {
                Anrok.value -> Anrok
                Avalara.value -> Avalara
                Sphere.value -> Sphere
                Stripe.value -> Stripe
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCustomerTaxProviderX12c86023> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCustomerTaxProviderX12c86023",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCustomerTaxProviderX12c86023 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerTaxProviderX12c86023,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
