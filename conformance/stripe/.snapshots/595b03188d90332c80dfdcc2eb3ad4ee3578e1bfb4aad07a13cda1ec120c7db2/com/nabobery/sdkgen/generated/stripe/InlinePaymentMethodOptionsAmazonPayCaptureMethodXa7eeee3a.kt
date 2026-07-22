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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_amazon_pay/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a.Serializer::class)
public sealed class InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsAmazonPayCaptureMethodXa7eeee3a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
