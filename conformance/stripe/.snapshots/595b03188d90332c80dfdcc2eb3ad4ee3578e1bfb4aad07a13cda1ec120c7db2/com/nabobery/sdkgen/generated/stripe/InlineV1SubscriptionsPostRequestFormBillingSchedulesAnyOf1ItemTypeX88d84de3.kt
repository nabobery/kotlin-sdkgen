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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/bill_until/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/bill_until/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `duration`.
     */
    public data object Duration : InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3() {
        public override val `value`: String = "duration"
    }

    /**
     * Documented value. Wire value: `timestamp`.
     */
    public data object Timestamp : InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3() {
        public override val `value`: String = "timestamp"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3 =
            when (value) {
                Duration.value -> Duration
                Timestamp.value -> Timestamp
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX88d84de3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
