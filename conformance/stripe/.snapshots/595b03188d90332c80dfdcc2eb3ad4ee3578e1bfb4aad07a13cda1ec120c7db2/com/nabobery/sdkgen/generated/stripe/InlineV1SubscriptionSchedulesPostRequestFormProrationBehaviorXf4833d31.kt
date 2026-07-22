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
 * If the update changes the billing configuration (item price, quantity, etc.) of the current phase, indicates how
 * prorations from this change should be handled. The default value is `create_prorations`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/proration_behavior
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always_invoice`.
     */
    public data object AlwaysInvoice : InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31() {
        public override val `value`: String = "always_invoice"
    }

    /**
     * Documented value. Wire value: `create_prorations`.
     */
    public data object CreateProrations : InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31() {
        public override val `value`: String = "create_prorations"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31 =
            when (value) {
                AlwaysInvoice.value -> AlwaysInvoice
                CreateProrations.value -> CreateProrations
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
