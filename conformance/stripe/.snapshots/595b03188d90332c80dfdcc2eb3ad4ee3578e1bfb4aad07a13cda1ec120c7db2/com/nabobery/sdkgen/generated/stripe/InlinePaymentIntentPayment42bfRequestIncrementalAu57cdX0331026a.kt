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
 * Request ability to [increment the authorization](https://docs.stripe.com/payments/incremental-authorization) for this
 * PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/request_increm
 * ental_authorization
 */
@Serializable(with = InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a.Serializer::class)
public sealed class InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `if_available`.
     */
    public data object IfAvailable : InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a() {
        public override val `value`: String = "if_available"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a =
            when (value) {
                IfAvailable.value -> IfAvailable
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPayment42bfRequestIncrementalAu57cdX0331026a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
