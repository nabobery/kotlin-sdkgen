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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_revolut_pay/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191.Serializer::class)
public sealed class InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsRevolutPayCaptureMethodXfc59c191,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
