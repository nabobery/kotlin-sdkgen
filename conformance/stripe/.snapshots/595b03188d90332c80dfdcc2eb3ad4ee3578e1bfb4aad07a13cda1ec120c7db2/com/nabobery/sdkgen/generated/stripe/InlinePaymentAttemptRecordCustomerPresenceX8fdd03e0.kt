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
 * Indicates whether the customer was present in your checkout flow during this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_attempt_record/properties/customer_presence
 */
@Serializable(with = InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0.Serializer::class)
public sealed class InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `off_session`.
     */
    public data object OffSession : InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0() {
        public override val `value`: String = "off_session"
    }

    /**
     * Documented value. Wire value: `on_session`.
     */
    public data object OnSession : InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0() {
        public override val `value`: String = "on_session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0 =
            when (value) {
                OffSession.value -> OffSession
                OnSession.value -> OnSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
