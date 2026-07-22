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
 * ded/schema/properties/saved_payment_method_options/properties/payment_method_remove.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/saved_payment_method_options/properties/payment_method_remove
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3 =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodRemoveX443717a3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
