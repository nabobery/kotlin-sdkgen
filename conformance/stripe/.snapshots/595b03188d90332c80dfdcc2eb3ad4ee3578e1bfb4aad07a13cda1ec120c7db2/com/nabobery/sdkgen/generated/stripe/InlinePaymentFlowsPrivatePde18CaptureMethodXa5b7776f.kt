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
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_naver_pay_payment_method_optio
 * ns/properties/capture_method
 */
@Serializable(with = InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f.Serializer::class)
public sealed class InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentFlowsPrivatePde18CaptureMethodXa5b7776f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
