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
 * Indicates the type of tax rate applied to the taxable amount. This value can be `null` when no tax applies to the
 * location. This field is only present for TaxRates created by Stripe Tax.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_rate/properties/rate_type
 */
@Serializable(with = InlineTaxRateRateTypeX81463d4b.Serializer::class)
public sealed class InlineTaxRateRateTypeX81463d4b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `flat_amount`.
     */
    public data object FlatAmount : InlineTaxRateRateTypeX81463d4b() {
        public override val `value`: String = "flat_amount"
    }

    /**
     * Documented value. Wire value: `percentage`.
     */
    public data object Percentage : InlineTaxRateRateTypeX81463d4b() {
        public override val `value`: String = "percentage"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxRateRateTypeX81463d4b()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxRateRateTypeX81463d4b =
            when (value) {
                FlatAmount.value -> FlatAmount
                Percentage.value -> Percentage
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxRateRateTypeX81463d4b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxRateRateTypeX81463d4b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxRateRateTypeX81463d4b = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxRateRateTypeX81463d4b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
