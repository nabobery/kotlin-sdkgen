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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/proration_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/proration_behavior
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always_invoice`.
     */
    public data object AlwaysInvoice : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412() {
        public override val `value`: String = "always_invoice"
    }

    /**
     * Documented value. Wire value: `create_prorations`.
     */
    public data object CreateProrations : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412() {
        public override val `value`: String = "create_prorations"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412 =
            when (value) {
                AlwaysInvoice.value -> AlwaysInvoice
                CreateProrations.value -> CreateProrations
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
