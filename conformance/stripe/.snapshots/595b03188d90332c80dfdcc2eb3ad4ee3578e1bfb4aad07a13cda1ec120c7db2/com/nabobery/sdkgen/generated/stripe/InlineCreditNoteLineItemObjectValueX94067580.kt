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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note_line_item/properties/object
 */
@Serializable(with = InlineCreditNoteLineItemObjectValueX94067580.Serializer::class)
public sealed class InlineCreditNoteLineItemObjectValueX94067580 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `credit_note_line_item`.
     */
    public data object CreditNoteLineItem : InlineCreditNoteLineItemObjectValueX94067580() {
        public override val `value`: String = "credit_note_line_item"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCreditNoteLineItemObjectValueX94067580()

    public companion object {
        public fun fromValue(`value`: String): InlineCreditNoteLineItemObjectValueX94067580 =
            when (value) {
                CreditNoteLineItem.value -> CreditNoteLineItem
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCreditNoteLineItemObjectValueX94067580> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCreditNoteLineItemObjectValueX94067580",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCreditNoteLineItemObjectValueX94067580 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCreditNoteLineItemObjectValueX94067580,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
