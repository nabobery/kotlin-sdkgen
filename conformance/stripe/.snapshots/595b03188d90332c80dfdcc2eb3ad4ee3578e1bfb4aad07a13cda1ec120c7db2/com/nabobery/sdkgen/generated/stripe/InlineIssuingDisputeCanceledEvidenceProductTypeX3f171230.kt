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
 * Whether the product was a merchandise or service.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_canceled_evidence/properties/product_type
 */
@Serializable(with = InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230.Serializer::class)
public sealed class InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `merchandise`.
     */
    public data object Merchandise : InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230() {
        public override val `value`: String = "merchandise"
    }

    /**
     * Documented value. Wire value: `service`.
     */
    public data object Service : InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230() {
        public override val `value`: String = "service"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230 =
            when (value) {
                Merchandise.value -> Merchandise
                Service.value -> Service
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingDisputeCanceledEvidenceProductTypeX3f171230,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
