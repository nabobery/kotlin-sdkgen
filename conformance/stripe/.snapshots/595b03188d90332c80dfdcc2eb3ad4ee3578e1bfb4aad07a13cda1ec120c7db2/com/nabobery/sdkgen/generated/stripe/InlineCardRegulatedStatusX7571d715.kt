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
 * Status of a card based on the card issuer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card/properties/regulated_status
 */
@Serializable(with = InlineCardRegulatedStatusX7571d715.Serializer::class)
public sealed class InlineCardRegulatedStatusX7571d715 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `regulated`.
     */
    public data object Regulated : InlineCardRegulatedStatusX7571d715() {
        public override val `value`: String = "regulated"
    }

    /**
     * Documented value. Wire value: `unregulated`.
     */
    public data object Unregulated : InlineCardRegulatedStatusX7571d715() {
        public override val `value`: String = "unregulated"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCardRegulatedStatusX7571d715()

    public companion object {
        public fun fromValue(`value`: String): InlineCardRegulatedStatusX7571d715 =
            when (value) {
                Regulated.value -> Regulated
                Unregulated.value -> Unregulated
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCardRegulatedStatusX7571d715> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCardRegulatedStatusX7571d715",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCardRegulatedStatusX7571d715 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCardRegulatedStatusX7571d715,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
