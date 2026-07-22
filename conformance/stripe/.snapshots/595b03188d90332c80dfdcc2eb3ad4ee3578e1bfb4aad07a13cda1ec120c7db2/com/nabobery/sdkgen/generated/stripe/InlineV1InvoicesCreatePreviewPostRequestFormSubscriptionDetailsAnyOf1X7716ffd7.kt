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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/trial_end/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/trial_end/anyOf/0
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `now`.
     */
    public data object Now : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7() {
        public override val `value`: String = "now"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7 =
            when (value) {
                Now.value -> Now
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X7716ffd7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
