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
 * Controls when the funds will be captured from the customer's account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_payco_payment_method_options/p
 * roperties/capture_method
 */
@Serializable(with = InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b.Serializer::class)
public sealed class InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentFlowsPrivateP7edaCaptureMethodX48504f4b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
