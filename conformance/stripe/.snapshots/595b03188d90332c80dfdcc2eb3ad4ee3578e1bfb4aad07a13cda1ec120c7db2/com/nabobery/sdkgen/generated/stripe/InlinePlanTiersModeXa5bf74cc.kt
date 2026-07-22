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
 * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity
 * within a period determines the per unit price. In `graduated` tiering, pricing can change as the quantity grows.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan/properties/tiers_mode
 */
@Serializable(with = InlinePlanTiersModeXa5bf74cc.Serializer::class)
public sealed class InlinePlanTiersModeXa5bf74cc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `graduated`.
     */
    public data object Graduated : InlinePlanTiersModeXa5bf74cc() {
        public override val `value`: String = "graduated"
    }

    /**
     * Documented value. Wire value: `volume`.
     */
    public data object Volume : InlinePlanTiersModeXa5bf74cc() {
        public override val `value`: String = "volume"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePlanTiersModeXa5bf74cc()

    public companion object {
        public fun fromValue(`value`: String): InlinePlanTiersModeXa5bf74cc =
            when (value) {
                Graduated.value -> Graduated
                Volume.value -> Volume
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePlanTiersModeXa5bf74cc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePlanTiersModeXa5bf74cc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePlanTiersModeXa5bf74cc = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePlanTiersModeXa5bf74cc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
