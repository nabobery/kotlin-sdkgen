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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/saved_payment_method_options/properties/payment_method_save.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/saved_payment_method_options/properties/payment_method_save
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708 =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodSaveX38f24708,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
