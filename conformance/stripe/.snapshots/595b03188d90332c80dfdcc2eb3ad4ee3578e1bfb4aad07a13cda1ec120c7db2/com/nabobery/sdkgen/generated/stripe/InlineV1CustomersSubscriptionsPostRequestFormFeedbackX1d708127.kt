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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/feedback.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancellation_details/properties/feedback
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `customer_service`.
     */
    public data object CustomerService : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "customer_service"
    }

    /**
     * Documented value. Wire value: `low_quality`.
     */
    public data object LowQuality : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "low_quality"
    }

    /**
     * Documented value. Wire value: `missing_features`.
     */
    public data object MissingFeatures : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "missing_features"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `switched_service`.
     */
    public data object SwitchedService : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "switched_service"
    }

    /**
     * Documented value. Wire value: `too_complex`.
     */
    public data object TooComplex : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "too_complex"
    }

    /**
     * Documented value. Wire value: `too_expensive`.
     */
    public data object TooExpensive : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "too_expensive"
    }

    /**
     * Documented value. Wire value: `unused`.
     */
    public data object Unused : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127() {
        public override val `value`: String = "unused"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127 =
            when (value) {
                Value.value -> Value
                CustomerService.value -> CustomerService
                LowQuality.value -> LowQuality
                MissingFeatures.value -> MissingFeatures
                Other.value -> Other
                SwitchedService.value -> SwitchedService
                TooComplex.value -> TooComplex
                TooExpensive.value -> TooExpensive
                Unused.value -> Unused
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
