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
 * Type of registration in the US.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_united_states/pro
 * perties/type
 */
@Serializable(with = InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5.Serializer::class)
public sealed class InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `local_amusement_tax`.
     */
    public data object LocalAmusementTax : InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5() {
        public override val `value`: String = "local_amusement_tax"
    }

    /**
     * Documented value. Wire value: `local_lease_tax`.
     */
    public data object LocalLeaseTax : InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5() {
        public override val `value`: String = "local_lease_tax"
    }

    /**
     * Documented value. Wire value: `state_communications_tax`.
     */
    public data object StateCommunicationsTax : InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5() {
        public override val `value`: String = "state_communications_tax"
    }

    /**
     * Documented value. Wire value: `state_retail_delivery_fee`.
     */
    public data object StateRetailDeliveryFee : InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5() {
        public override val `value`: String = "state_retail_delivery_fee"
    }

    /**
     * Documented value. Wire value: `state_sales_tax`.
     */
    public data object StateSalesTax : InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5() {
        public override val `value`: String = "state_sales_tax"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5 =
            when (value) {
                LocalAmusementTax.value -> LocalAmusementTax
                LocalLeaseTax.value -> LocalLeaseTax
                StateCommunicationsTax.value -> StateCommunicationsTax
                StateRetailDeliveryFee.value -> StateRetailDeliveryFee
                StateSalesTax.value -> StateSalesTax
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductRegistrationsResourceCountryOptionsUnitedStatesTypeX80e9f5e5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
