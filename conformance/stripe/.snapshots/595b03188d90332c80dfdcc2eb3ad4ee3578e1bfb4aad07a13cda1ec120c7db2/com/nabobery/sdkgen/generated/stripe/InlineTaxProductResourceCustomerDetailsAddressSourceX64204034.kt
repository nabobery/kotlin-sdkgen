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
 * The type of customer address provided.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_customer_details/properties/address_source
 */
@Serializable(with = InlineTaxProductResourceCustomerDetailsAddressSourceX64204034.Serializer::class)
public sealed class InlineTaxProductResourceCustomerDetailsAddressSourceX64204034 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `billing`.
     */
    public data object Billing : InlineTaxProductResourceCustomerDetailsAddressSourceX64204034() {
        public override val `value`: String = "billing"
    }

    /**
     * Documented value. Wire value: `shipping`.
     */
    public data object Shipping : InlineTaxProductResourceCustomerDetailsAddressSourceX64204034() {
        public override val `value`: String = "shipping"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxProductResourceCustomerDetailsAddressSourceX64204034()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxProductResourceCustomerDetailsAddressSourceX64204034 =
            when (value) {
                Billing.value -> Billing
                Shipping.value -> Shipping
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxProductResourceCustomerDetailsAddressSourceX64204034> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceCustomerDetailsAddressSourceX64204034",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxProductResourceCustomerDetailsAddressSourceX64204034 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductResourceCustomerDetailsAddressSourceX64204034,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
