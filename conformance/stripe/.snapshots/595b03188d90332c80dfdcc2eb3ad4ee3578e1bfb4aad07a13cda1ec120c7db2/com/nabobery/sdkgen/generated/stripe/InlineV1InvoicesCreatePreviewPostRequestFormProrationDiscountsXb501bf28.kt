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
 * rlencoded/schema/properties/schedule_details/properties/billing_mode/properties/flexible/properties/proration_discoun
 * ts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/billing_mode/properties/flexible/properties/proration_discoun
 * ts
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `included`.
     */
    public data object Included : InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28() {
        public override val `value`: String = "included"
    }

    /**
     * Documented value. Wire value: `itemized`.
     */
    public data object Itemized : InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28() {
        public override val `value`: String = "itemized"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28 =
            when (value) {
                Included.value -> Included
                Itemized.value -> Itemized
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormProrationDiscountsXb501bf28,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
