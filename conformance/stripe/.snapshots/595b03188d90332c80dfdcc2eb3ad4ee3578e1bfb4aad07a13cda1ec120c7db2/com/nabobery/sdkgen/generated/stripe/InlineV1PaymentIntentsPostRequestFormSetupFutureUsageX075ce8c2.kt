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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alipay/anyOf/0/properties/setup_future_usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alipay/anyOf/0/properties/setup_future_usage
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `off_session`.
     */
    public data object OffSession : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2() {
        public override val `value`: String = "off_session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2 =
            when (value) {
                Value.value -> Value
                None.value -> None
                OffSession.value -> OffSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX075ce8c2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
