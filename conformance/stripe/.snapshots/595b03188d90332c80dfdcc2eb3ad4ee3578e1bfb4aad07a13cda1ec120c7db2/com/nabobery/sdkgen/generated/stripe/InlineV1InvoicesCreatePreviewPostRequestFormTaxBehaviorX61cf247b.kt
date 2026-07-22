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
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/price_data/properties/tax_behavior
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/price_data/properties/tax_behavior
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormTaxBehaviorX61cf247b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
