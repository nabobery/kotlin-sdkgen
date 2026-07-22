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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/paym
 * ent_schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/paym
 * ent_schedule
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `halfyearly`.
     */
    public data object Halfyearly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb() {
        public override val `value`: String = "halfyearly"
    }

    /**
     * Documented value. Wire value: `monthly`.
     */
    public data object Monthly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb() {
        public override val `value`: String = "monthly"
    }

    /**
     * Documented value. Wire value: `quarterly`.
     */
    public data object Quarterly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb() {
        public override val `value`: String = "quarterly"
    }

    /**
     * Documented value. Wire value: `weekly`.
     */
    public data object Weekly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb() {
        public override val `value`: String = "weekly"
    }

    /**
     * Documented value. Wire value: `yearly`.
     */
    public data object Yearly : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb() {
        public override val `value`: String = "yearly"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb =
            when (value) {
                Halfyearly.value -> Halfyearly
                Monthly.value -> Monthly
                Quarterly.value -> Quarterly
                Weekly.value -> Weekly
                Yearly.value -> Yearly
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
