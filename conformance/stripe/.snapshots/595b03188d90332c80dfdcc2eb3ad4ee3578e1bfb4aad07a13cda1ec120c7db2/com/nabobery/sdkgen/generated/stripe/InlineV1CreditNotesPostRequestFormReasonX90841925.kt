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
 * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/reason
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormReasonX90841925.Serializer::class)
public sealed class InlineV1CreditNotesPostRequestFormReasonX90841925 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `duplicate`.
     */
    public data object Duplicate : InlineV1CreditNotesPostRequestFormReasonX90841925() {
        public override val `value`: String = "duplicate"
    }

    /**
     * Documented value. Wire value: `fraudulent`.
     */
    public data object Fraudulent : InlineV1CreditNotesPostRequestFormReasonX90841925() {
        public override val `value`: String = "fraudulent"
    }

    /**
     * Documented value. Wire value: `order_change`.
     */
    public data object OrderChange : InlineV1CreditNotesPostRequestFormReasonX90841925() {
        public override val `value`: String = "order_change"
    }

    /**
     * Documented value. Wire value: `product_unsatisfactory`.
     */
    public data object ProductUnsatisfactory : InlineV1CreditNotesPostRequestFormReasonX90841925() {
        public override val `value`: String = "product_unsatisfactory"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CreditNotesPostRequestFormReasonX90841925()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CreditNotesPostRequestFormReasonX90841925 =
            when (value) {
                Duplicate.value -> Duplicate
                Fraudulent.value -> Fraudulent
                OrderChange.value -> OrderChange
                ProductUnsatisfactory.value -> ProductUnsatisfactory
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormReasonX90841925> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormReasonX90841925",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormReasonX90841925 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPostRequestFormReasonX90841925,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
