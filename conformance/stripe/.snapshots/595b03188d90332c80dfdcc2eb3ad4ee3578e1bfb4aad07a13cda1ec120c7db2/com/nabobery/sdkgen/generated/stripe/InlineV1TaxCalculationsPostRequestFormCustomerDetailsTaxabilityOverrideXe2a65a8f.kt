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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/taxability_override.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/taxability_override
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `customer_exempt`.
     */
    public data object CustomerExempt : InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f() {
        public override val `value`: String = "customer_exempt"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `reverse_charge`.
     */
    public data object ReverseCharge : InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f() {
        public override val `value`: String = "reverse_charge"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f =
            when (value) {
                CustomerExempt.value -> CustomerExempt
                None.value -> None
                ReverseCharge.value -> ReverseCharge
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsTaxabilityOverrideXe2a65a8f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
