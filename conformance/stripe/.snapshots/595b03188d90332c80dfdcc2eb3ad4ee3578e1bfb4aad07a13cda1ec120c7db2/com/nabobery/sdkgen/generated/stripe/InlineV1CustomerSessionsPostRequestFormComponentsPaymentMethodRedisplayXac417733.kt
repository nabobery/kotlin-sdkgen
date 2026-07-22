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
 * ed/schema/properties/components/properties/payment_element/properties/features/properties/payment_method_redisplay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/payment_element/properties/features/properties/payment_method_redisplay
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733.Serializer::class)
public sealed class InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733 =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodRedisplayXac417733,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
