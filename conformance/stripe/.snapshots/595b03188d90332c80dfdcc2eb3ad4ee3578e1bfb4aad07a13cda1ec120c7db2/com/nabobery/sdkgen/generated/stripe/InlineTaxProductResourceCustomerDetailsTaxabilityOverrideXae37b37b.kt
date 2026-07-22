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
 * The taxability override used for taxation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_customer_details/properties/taxability_override
 */
@Serializable(with = InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b.Serializer::class)
public sealed class InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `customer_exempt`.
     */
    public data object CustomerExempt : InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b() {
        public override val `value`: String = "customer_exempt"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `reverse_charge`.
     */
    public data object ReverseCharge : InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b() {
        public override val `value`: String = "reverse_charge"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b =
            when (value) {
                CustomerExempt.value -> CustomerExempt
                None.value -> None
                ReverseCharge.value -> ReverseCharge
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductResourceCustomerDetailsTaxabilityOverrideXae37b37b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
