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
 * Indicates that you intend to make future payments with this ConfirmationToken's payment method.
 *
 * The presence of this property will [attach the payment method](https://docs.stripe.com/payments/save-during-payment)
 * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any required actions from the
 * user are complete.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/setup_future_usage
 */
@Serializable(with = InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d.Serializer::class)
public sealed class InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `off_session`.
     */
    public data object OffSession : InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d() {
        public override val `value`: String = "off_session"
    }

    /**
     * Documented value. Wire value: `on_session`.
     */
    public data object OnSession : InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d() {
        public override val `value`: String = "on_session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d =
            when (value) {
                OffSession.value -> OffSession
                OnSession.value -> OnSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
