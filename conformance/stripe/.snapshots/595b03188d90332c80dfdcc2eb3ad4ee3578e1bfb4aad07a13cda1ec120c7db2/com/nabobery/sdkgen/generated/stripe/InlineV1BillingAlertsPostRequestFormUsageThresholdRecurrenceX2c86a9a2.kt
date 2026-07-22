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
 * /schema/properties/usage_threshold/properties/recurrence.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/usage_threshold/properties/recurrence
 */
@Serializable(with = InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2.Serializer::class)
public sealed class InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `one_time`.
     */
    public data object OneTime : InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2() {
        public override val `value`: String = "one_time"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2()

    public companion object {
        public fun fromValue(`value`: String): InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2 =
            when (value) {
                OneTime.value -> OneTime
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
