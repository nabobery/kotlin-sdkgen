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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_cashapp/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsCashappCaptureMethodXf114e322.Serializer::class)
public sealed class InlinePaymentMethodOptionsCashappCaptureMethodXf114e322 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentMethodOptionsCashappCaptureMethodXf114e322() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsCashappCaptureMethodXf114e322()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsCashappCaptureMethodXf114e322 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsCashappCaptureMethodXf114e322> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCashappCaptureMethodXf114e322",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCashappCaptureMethodXf114e322 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsCashappCaptureMethodXf114e322,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
