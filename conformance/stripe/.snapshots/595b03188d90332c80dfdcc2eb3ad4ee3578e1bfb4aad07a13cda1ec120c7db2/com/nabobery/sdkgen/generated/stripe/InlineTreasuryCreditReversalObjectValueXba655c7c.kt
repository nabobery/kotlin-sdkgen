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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.credit_reversal/properties/object
 */
@Serializable(with = InlineTreasuryCreditReversalObjectValueXba655c7c.Serializer::class)
public sealed class InlineTreasuryCreditReversalObjectValueXba655c7c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `treasury.credit_reversal`.
     */
    public data object TreasuryCreditReversal : InlineTreasuryCreditReversalObjectValueXba655c7c() {
        public override val `value`: String = "treasury.credit_reversal"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryCreditReversalObjectValueXba655c7c()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryCreditReversalObjectValueXba655c7c =
            when (value) {
                TreasuryCreditReversal.value -> TreasuryCreditReversal
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryCreditReversalObjectValueXba655c7c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryCreditReversalObjectValueXba655c7c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryCreditReversalObjectValueXba655c7c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryCreditReversalObjectValueXba655c7c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
