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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/default_aggregation/properties/formula.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/default_aggregation/properties/formula
 */
@Serializable(with = InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0.Serializer::class)
public sealed class InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `count`.
     */
    public data object Count : InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0() {
        public override val `value`: String = "count"
    }

    /**
     * Documented value. Wire value: `last`.
     */
    public data object Last : InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0() {
        public override val `value`: String = "last"
    }

    /**
     * Documented value. Wire value: `sum`.
     */
    public data object Sum : InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0() {
        public override val `value`: String = "sum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0()

    public companion object {
        public fun fromValue(`value`: String): InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0 =
            when (value) {
                Count.value -> Count
                Last.value -> Last
                Sum.value -> Sum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingMetersPostRequestFormDefaultAggregationFormulaX793833c0,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
