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
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/reason
 */
@Serializable(with = InlineCreditNoteReasonX7a4479ce.Serializer::class)
public sealed class InlineCreditNoteReasonX7a4479ce {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `duplicate`.
     */
    public data object Duplicate : InlineCreditNoteReasonX7a4479ce() {
        public override val `value`: String = "duplicate"
    }

    /**
     * Documented value. Wire value: `fraudulent`.
     */
    public data object Fraudulent : InlineCreditNoteReasonX7a4479ce() {
        public override val `value`: String = "fraudulent"
    }

    /**
     * Documented value. Wire value: `order_change`.
     */
    public data object OrderChange : InlineCreditNoteReasonX7a4479ce() {
        public override val `value`: String = "order_change"
    }

    /**
     * Documented value. Wire value: `product_unsatisfactory`.
     */
    public data object ProductUnsatisfactory : InlineCreditNoteReasonX7a4479ce() {
        public override val `value`: String = "product_unsatisfactory"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCreditNoteReasonX7a4479ce()

    public companion object {
        public fun fromValue(`value`: String): InlineCreditNoteReasonX7a4479ce =
            when (value) {
                Duplicate.value -> Duplicate
                Fraudulent.value -> Fraudulent
                OrderChange.value -> OrderChange
                ProductUnsatisfactory.value -> ProductUnsatisfactory
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCreditNoteReasonX7a4479ce> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCreditNoteReasonX7a4479ce",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCreditNoteReasonX7a4479ce = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCreditNoteReasonX7a4479ce,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
