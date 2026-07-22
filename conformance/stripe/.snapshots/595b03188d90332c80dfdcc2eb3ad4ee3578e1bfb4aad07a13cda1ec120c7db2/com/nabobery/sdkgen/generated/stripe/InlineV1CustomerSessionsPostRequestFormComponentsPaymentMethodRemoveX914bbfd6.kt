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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_remov
 * e.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_remov
 * e
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6.Serializer::class)
public sealed class InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6 =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRemoveX914bbfd6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
