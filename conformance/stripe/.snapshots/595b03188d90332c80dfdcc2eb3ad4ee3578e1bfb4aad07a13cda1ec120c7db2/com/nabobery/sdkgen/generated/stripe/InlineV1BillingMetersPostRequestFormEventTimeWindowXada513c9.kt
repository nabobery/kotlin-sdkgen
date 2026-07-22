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
 * The time window which meter events have been pre-aggregated for, if any.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/event_time_window
 */
@Serializable(with = InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9.Serializer::class)
public sealed class InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `day`.
     */
    public data object Day : InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9() {
        public override val `value`: String = "day"
    }

    /**
     * Documented value. Wire value: `hour`.
     */
    public data object Hour : InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9() {
        public override val `value`: String = "hour"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9()

    public companion object {
        public fun fromValue(`value`: String): InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9 =
            when (value) {
                Day.value -> Day
                Hour.value -> Hour
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingMetersPostRequestFormEventTimeWindowXada513c9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
