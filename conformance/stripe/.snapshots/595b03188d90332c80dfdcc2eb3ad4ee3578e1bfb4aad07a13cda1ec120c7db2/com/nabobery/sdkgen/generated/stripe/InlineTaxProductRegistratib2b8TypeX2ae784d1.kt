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
 * The type of the election for the state sales tax registration.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_us_state_sales_ta
 * x_election/properties/type
 */
@Serializable(with = InlineTaxProductRegistratib2b8TypeX2ae784d1.Serializer::class)
public sealed class InlineTaxProductRegistratib2b8TypeX2ae784d1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `local_use_tax`.
     */
    public data object LocalUseTax : InlineTaxProductRegistratib2b8TypeX2ae784d1() {
        public override val `value`: String = "local_use_tax"
    }

    /**
     * Documented value. Wire value: `simplified_sellers_use_tax`.
     */
    public data object SimplifiedSellersUseTax : InlineTaxProductRegistratib2b8TypeX2ae784d1() {
        public override val `value`: String = "simplified_sellers_use_tax"
    }

    /**
     * Documented value. Wire value: `single_local_use_tax`.
     */
    public data object SingleLocalUseTax : InlineTaxProductRegistratib2b8TypeX2ae784d1() {
        public override val `value`: String = "single_local_use_tax"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxProductRegistratib2b8TypeX2ae784d1()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxProductRegistratib2b8TypeX2ae784d1 =
            when (value) {
                LocalUseTax.value -> LocalUseTax
                SimplifiedSellersUseTax.value -> SimplifiedSellersUseTax
                SingleLocalUseTax.value -> SingleLocalUseTax
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxProductRegistratib2b8TypeX2ae784d1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistratib2b8TypeX2ae784d1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxProductRegistratib2b8TypeX2ae784d1 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductRegistratib2b8TypeX2ae784d1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
