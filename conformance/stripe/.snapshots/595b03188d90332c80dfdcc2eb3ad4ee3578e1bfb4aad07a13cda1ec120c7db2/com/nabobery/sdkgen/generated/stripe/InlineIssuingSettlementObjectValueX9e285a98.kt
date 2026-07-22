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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.settlement/properties/object
 */
@Serializable(with = InlineIssuingSettlementObjectValueX9e285a98.Serializer::class)
public sealed class InlineIssuingSettlementObjectValueX9e285a98 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `issuing.settlement`.
     */
    public data object IssuingSettlement : InlineIssuingSettlementObjectValueX9e285a98() {
        public override val `value`: String = "issuing.settlement"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingSettlementObjectValueX9e285a98()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingSettlementObjectValueX9e285a98 =
            when (value) {
                IssuingSettlement.value -> IssuingSettlement
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingSettlementObjectValueX9e285a98> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingSettlementObjectValueX9e285a98",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingSettlementObjectValueX9e285a98 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingSettlementObjectValueX9e285a98,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
