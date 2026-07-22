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
 * Whether this physical bundle is a standard Stripe offering or custom-made for you.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.physical_bundle/properties/type
 */
@Serializable(with = InlineIssuingPhysicalBundleTypeX88952cef.Serializer::class)
public sealed class InlineIssuingPhysicalBundleTypeX88952cef {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `custom`.
     */
    public data object Custom : InlineIssuingPhysicalBundleTypeX88952cef() {
        public override val `value`: String = "custom"
    }

    /**
     * Documented value. Wire value: `standard`.
     */
    public data object Standard : InlineIssuingPhysicalBundleTypeX88952cef() {
        public override val `value`: String = "standard"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingPhysicalBundleTypeX88952cef()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingPhysicalBundleTypeX88952cef =
            when (value) {
                Custom.value -> Custom
                Standard.value -> Standard
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingPhysicalBundleTypeX88952cef> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingPhysicalBundleTypeX88952cef",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingPhysicalBundleTypeX88952cef =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingPhysicalBundleTypeX88952cef,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
