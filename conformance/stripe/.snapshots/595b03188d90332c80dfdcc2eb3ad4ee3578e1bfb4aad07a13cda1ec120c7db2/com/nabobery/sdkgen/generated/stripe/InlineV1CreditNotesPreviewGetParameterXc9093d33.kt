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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/3/schema
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterXc9093d33.Serializer::class)
public sealed class InlineV1CreditNotesPreviewGetParameterXc9093d33 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `credit_note`.
     */
    public data object CreditNote : InlineV1CreditNotesPreviewGetParameterXc9093d33() {
        public override val `value`: String = "credit_note"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1CreditNotesPreviewGetParameterXc9093d33() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CreditNotesPreviewGetParameterXc9093d33()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CreditNotesPreviewGetParameterXc9093d33 =
            when (value) {
                CreditNote.value -> CreditNote
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterXc9093d33> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewGetParameterXc9093d33",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterXc9093d33 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewGetParameterXc9093d33,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
