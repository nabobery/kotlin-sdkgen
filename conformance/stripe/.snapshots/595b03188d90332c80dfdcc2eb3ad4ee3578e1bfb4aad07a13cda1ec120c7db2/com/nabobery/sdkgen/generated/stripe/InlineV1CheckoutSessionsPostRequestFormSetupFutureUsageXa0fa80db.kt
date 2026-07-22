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
 * ded/schema/properties/payment_method_options/properties/cashapp/properties/setup_future_usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/cashapp/properties/setup_future_usage
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `off_session`.
     */
    public data object OffSession : InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db() {
        public override val `value`: String = "off_session"
    }

    /**
     * Documented value. Wire value: `on_session`.
     */
    public data object OnSession : InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db() {
        public override val `value`: String = "on_session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db =
            when (value) {
                None.value -> None
                OffSession.value -> OffSession
                OnSession.value -> OnSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXa0fa80db,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
