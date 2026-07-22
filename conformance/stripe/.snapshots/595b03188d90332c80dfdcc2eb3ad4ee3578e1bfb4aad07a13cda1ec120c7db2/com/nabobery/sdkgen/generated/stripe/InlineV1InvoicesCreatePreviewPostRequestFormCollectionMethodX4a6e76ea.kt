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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/collection_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/collection_method
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `charge_automatically`.
     */
    public data object ChargeAutomatically : InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea() {
        public override val `value`: String = "charge_automatically"
    }

    /**
     * Documented value. Wire value: `send_invoice`.
     */
    public data object SendInvoice : InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea() {
        public override val `value`: String = "send_invoice"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea =
            when (value) {
                ChargeAutomatically.value -> ChargeAutomatically
                SendInvoice.value -> SendInvoice
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
