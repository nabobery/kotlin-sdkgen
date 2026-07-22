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
 * Specifies payment frequency. One of `day`, `week`, `month`, `year`, or `sporadic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card_mandate_options/properties/
 * interval
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `day`.
     */
    public data object Day : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a() {
        public override val `value`: String = "day"
    }

    /**
     * Documented value. Wire value: `month`.
     */
    public data object Month : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a() {
        public override val `value`: String = "month"
    }

    /**
     * Documented value. Wire value: `sporadic`.
     */
    public data object Sporadic : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a() {
        public override val `value`: String = "sporadic"
    }

    /**
     * Documented value. Wire value: `week`.
     */
    public data object Week : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a() {
        public override val `value`: String = "week"
    }

    /**
     * Documented value. Wire value: `year`.
     */
    public data object Year : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a() {
        public override val `value`: String = "year"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a =
            when (value) {
                Day.value -> Day
                Month.value -> Month
                Sporadic.value -> Sporadic
                Week.value -> Week
                Year.value -> Year
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
