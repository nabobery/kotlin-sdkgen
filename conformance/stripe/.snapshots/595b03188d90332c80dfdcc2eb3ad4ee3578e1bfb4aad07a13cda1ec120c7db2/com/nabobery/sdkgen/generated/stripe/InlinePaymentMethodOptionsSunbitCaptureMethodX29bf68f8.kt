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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_sunbit/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8.Serializer::class)
public sealed class InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsSunbitCaptureMethodX29bf68f8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
