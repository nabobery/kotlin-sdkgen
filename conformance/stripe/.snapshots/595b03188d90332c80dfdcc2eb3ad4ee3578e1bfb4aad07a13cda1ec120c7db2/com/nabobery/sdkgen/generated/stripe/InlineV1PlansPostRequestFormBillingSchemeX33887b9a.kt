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
 * amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per
 * unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed
 * using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/billing_scheme
 */
@Serializable(with = InlineV1PlansPostRequestFormBillingSchemeX33887b9a.Serializer::class)
public sealed class InlineV1PlansPostRequestFormBillingSchemeX33887b9a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `per_unit`.
     */
    public data object PerUnit : InlineV1PlansPostRequestFormBillingSchemeX33887b9a() {
        public override val `value`: String = "per_unit"
    }

    /**
     * Documented value. Wire value: `tiered`.
     */
    public data object Tiered : InlineV1PlansPostRequestFormBillingSchemeX33887b9a() {
        public override val `value`: String = "tiered"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PlansPostRequestFormBillingSchemeX33887b9a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PlansPostRequestFormBillingSchemeX33887b9a =
            when (value) {
                PerUnit.value -> PerUnit
                Tiered.value -> Tiered
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PlansPostRequestFormBillingSchemeX33887b9a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormBillingSchemeX33887b9a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormBillingSchemeX33887b9a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PlansPostRequestFormBillingSchemeX33887b9a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
