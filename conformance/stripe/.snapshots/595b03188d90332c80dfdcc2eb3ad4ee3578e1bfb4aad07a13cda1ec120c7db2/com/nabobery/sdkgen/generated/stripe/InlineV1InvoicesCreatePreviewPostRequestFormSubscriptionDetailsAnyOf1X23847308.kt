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
 * rlencoded/schema/properties/subscription_details/properties/billing_cycle_anchor/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_cycle_anchor/anyOf/0
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `now`.
     */
    public data object Now : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308() {
        public override val `value`: String = "now"
    }

    /**
     * Documented value. Wire value: `unchanged`.
     */
    public data object Unchanged : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308() {
        public override val `value`: String = "unchanged"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308 =
            when (value) {
                Now.value -> Now
                Unchanged.value -> Unchanged
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf1X23847308,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
