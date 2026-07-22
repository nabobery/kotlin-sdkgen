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
 * ded/schema/properties/payment_method_options/properties/twint/properties/setup_future_usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/twint/properties/setup_future_usage
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `off_session`.
     */
    public data object OffSession : InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae() {
        public override val `value`: String = "off_session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae =
            when (value) {
                None.value -> None
                OffSession.value -> OffSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
