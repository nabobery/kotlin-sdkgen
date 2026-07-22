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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/fixed_amount/properties/currenc
 * y_options/additionalProperties/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/fixed_amount/properties/currenc
 * y_options/additionalProperties/properties/tax_behavior
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5 =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX5fe493f5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
