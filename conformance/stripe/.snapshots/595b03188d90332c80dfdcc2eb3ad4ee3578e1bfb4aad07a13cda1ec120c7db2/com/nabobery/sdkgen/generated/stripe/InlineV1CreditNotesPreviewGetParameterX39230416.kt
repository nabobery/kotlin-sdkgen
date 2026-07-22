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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/10/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/10/schema
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterX39230416.Serializer::class)
public sealed class InlineV1CreditNotesPreviewGetParameterX39230416 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `duplicate`.
     */
    public data object Duplicate : InlineV1CreditNotesPreviewGetParameterX39230416() {
        public override val `value`: String = "duplicate"
    }

    /**
     * Documented value. Wire value: `fraudulent`.
     */
    public data object Fraudulent : InlineV1CreditNotesPreviewGetParameterX39230416() {
        public override val `value`: String = "fraudulent"
    }

    /**
     * Documented value. Wire value: `order_change`.
     */
    public data object OrderChange : InlineV1CreditNotesPreviewGetParameterX39230416() {
        public override val `value`: String = "order_change"
    }

    /**
     * Documented value. Wire value: `product_unsatisfactory`.
     */
    public data object ProductUnsatisfactory : InlineV1CreditNotesPreviewGetParameterX39230416() {
        public override val `value`: String = "product_unsatisfactory"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CreditNotesPreviewGetParameterX39230416()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CreditNotesPreviewGetParameterX39230416 =
            when (value) {
                Duplicate.value -> Duplicate
                Fraudulent.value -> Fraudulent
                OrderChange.value -> OrderChange
                ProductUnsatisfactory.value -> ProductUnsatisfactory
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterX39230416> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewGetParameterX39230416",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterX39230416 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewGetParameterX39230416,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
