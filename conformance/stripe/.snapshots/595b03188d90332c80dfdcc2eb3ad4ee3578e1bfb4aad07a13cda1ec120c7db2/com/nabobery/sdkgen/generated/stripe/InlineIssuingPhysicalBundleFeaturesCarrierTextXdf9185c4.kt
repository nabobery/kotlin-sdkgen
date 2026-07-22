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
 * The policy for how to use carrier letter text in a card design with this physical bundle.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_physical_bundle_features/properties/carrier_text
 */
@Serializable(with = InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4.Serializer::class)
public sealed class InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `optional`.
     */
    public data object Optional : InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4() {
        public override val `value`: String = "optional"
    }

    /**
     * Documented value. Wire value: `required`.
     */
    public data object Required : InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4() {
        public override val `value`: String = "required"
    }

    /**
     * Documented value. Wire value: `unsupported`.
     */
    public data object Unsupported : InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4() {
        public override val `value`: String = "unsupported"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4 =
            when (value) {
                Optional.value -> Optional
                Required.value -> Required
                Unsupported.value -> Unsupported
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
