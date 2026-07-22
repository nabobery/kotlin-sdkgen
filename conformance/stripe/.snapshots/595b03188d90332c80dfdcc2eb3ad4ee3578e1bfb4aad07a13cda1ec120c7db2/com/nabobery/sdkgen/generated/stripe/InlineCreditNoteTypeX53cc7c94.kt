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
 * Type of this credit note, one of `pre_payment` or `post_payment`. A `pre_payment` credit note means it was issued
 * when the invoice was open. A `post_payment` credit note means it was issued when the invoice was paid.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/type
 */
@Serializable(with = InlineCreditNoteTypeX53cc7c94.Serializer::class)
public sealed class InlineCreditNoteTypeX53cc7c94 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `mixed`.
     */
    public data object Mixed : InlineCreditNoteTypeX53cc7c94() {
        public override val `value`: String = "mixed"
    }

    /**
     * Documented value. Wire value: `post_payment`.
     */
    public data object PostPayment : InlineCreditNoteTypeX53cc7c94() {
        public override val `value`: String = "post_payment"
    }

    /**
     * Documented value. Wire value: `pre_payment`.
     */
    public data object PrePayment : InlineCreditNoteTypeX53cc7c94() {
        public override val `value`: String = "pre_payment"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCreditNoteTypeX53cc7c94()

    public companion object {
        public fun fromValue(`value`: String): InlineCreditNoteTypeX53cc7c94 =
            when (value) {
                Mixed.value -> Mixed
                PostPayment.value -> PostPayment
                PrePayment.value -> PrePayment
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCreditNoteTypeX53cc7c94> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCreditNoteTypeX53cc7c94",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCreditNoteTypeX53cc7c94 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCreditNoteTypeX53cc7c94,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
