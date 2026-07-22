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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/billing_thresholds/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/billing_thresholds/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
