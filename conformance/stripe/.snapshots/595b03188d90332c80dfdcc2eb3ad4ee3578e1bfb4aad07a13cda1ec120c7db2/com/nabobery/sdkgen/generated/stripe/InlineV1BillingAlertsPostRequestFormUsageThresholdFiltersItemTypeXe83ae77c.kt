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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/usage_threshold/properties/filters/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/usage_threshold/properties/filters/items/properties/type
 */
@Serializable(with = InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c.Serializer::class)
public sealed class InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `customer`.
     */
    public data object Customer : InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c() {
        public override val `value`: String = "customer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c =
            when (value) {
                Customer.value -> Customer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemTypeXe83ae77c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
