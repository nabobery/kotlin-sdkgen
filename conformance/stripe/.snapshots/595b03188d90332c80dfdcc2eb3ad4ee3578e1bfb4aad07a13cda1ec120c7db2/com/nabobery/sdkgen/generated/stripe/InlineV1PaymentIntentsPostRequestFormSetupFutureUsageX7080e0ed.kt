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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay/anyOf/0/properties/setup_future_usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay/anyOf/0/properties/setup_future_usage
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed =
            when (value) {
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX7080e0ed,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
