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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_affirm/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3.Serializer::class)
public sealed class InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsAffirmCaptureMethodXbd4539f3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
