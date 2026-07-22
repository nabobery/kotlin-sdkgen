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
 * Specifies whether the `amount` includes taxes. If `tax_behavior=inclusive`, then the amount includes taxes.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_transaction_shipping_cost/properties/tax_be
 * havior
 */
@Serializable(with = InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279.Serializer::class)
public sealed class InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279() {
        public override val `value`: String = "inclusive"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279 =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
