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
 * Describes whether Checkout should collect the customer's billing address. Defaults to `auto`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/billing_address_collection
 */
@Serializable(with = InlineCheckoutSessionBillingAddressCollectionXd15fab78.Serializer::class)
public sealed class InlineCheckoutSessionBillingAddressCollectionXd15fab78 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlineCheckoutSessionBillingAddressCollectionXd15fab78() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `required`.
     */
    public data object Required : InlineCheckoutSessionBillingAddressCollectionXd15fab78() {
        public override val `value`: String = "required"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutSessionBillingAddressCollectionXd15fab78()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutSessionBillingAddressCollectionXd15fab78 =
            when (value) {
                Auto.value -> Auto
                Required.value -> Required
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionBillingAddressCollectionXd15fab78> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionBillingAddressCollectionXd15fab78",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionBillingAddressCollectionXd15fab78 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionBillingAddressCollectionXd15fab78,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
