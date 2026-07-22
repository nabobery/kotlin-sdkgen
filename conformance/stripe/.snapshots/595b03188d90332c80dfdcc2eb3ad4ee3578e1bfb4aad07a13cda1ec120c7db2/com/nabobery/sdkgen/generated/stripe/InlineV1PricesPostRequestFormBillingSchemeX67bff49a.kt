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
 * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed
 * amount (specified in `unit_amount` or `unit_amount_decimal`) will be charged per unit in `quantity` (for prices with
 * `usage_type=licensed`), or per unit of total usage (for prices with `usage_type=metered`). `tiered` indicates that
 * the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/billing_scheme
 */
@Serializable(with = InlineV1PricesPostRequestFormBillingSchemeX67bff49a.Serializer::class)
public sealed class InlineV1PricesPostRequestFormBillingSchemeX67bff49a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `per_unit`.
     */
    public data object PerUnit : InlineV1PricesPostRequestFormBillingSchemeX67bff49a() {
        public override val `value`: String = "per_unit"
    }

    /**
     * Documented value. Wire value: `tiered`.
     */
    public data object Tiered : InlineV1PricesPostRequestFormBillingSchemeX67bff49a() {
        public override val `value`: String = "tiered"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PricesPostRequestFormBillingSchemeX67bff49a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PricesPostRequestFormBillingSchemeX67bff49a =
            when (value) {
                PerUnit.value -> PerUnit
                Tiered.value -> Tiered
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PricesPostRequestFormBillingSchemeX67bff49a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormBillingSchemeX67bff49a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormBillingSchemeX67bff49a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PricesPostRequestFormBillingSchemeX67bff49a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
