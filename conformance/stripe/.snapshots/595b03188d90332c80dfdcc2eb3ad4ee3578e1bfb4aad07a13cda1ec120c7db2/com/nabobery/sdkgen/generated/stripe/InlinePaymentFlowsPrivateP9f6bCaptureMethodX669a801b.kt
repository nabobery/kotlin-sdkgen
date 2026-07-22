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
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_kakao_pay_payment_method_optio
 * ns/properties/capture_method
 */
@Serializable(with = InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b.Serializer::class)
public sealed class InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
