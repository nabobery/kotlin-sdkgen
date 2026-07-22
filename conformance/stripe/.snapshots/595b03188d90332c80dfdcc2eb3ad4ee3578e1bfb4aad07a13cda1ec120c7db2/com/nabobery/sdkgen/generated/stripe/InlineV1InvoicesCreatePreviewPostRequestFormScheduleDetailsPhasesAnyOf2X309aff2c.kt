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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/description/anyOf/1
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X309aff2c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
