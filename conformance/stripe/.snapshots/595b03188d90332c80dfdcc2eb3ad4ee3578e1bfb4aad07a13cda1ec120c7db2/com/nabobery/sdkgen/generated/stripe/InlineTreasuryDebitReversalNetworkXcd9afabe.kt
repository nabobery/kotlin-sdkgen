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
 * The rails used to reverse the funds.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.debit_reversal/properties/network
 */
@Serializable(with = InlineTreasuryDebitReversalNetworkXcd9afabe.Serializer::class)
public sealed class InlineTreasuryDebitReversalNetworkXcd9afabe {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ach`.
     */
    public data object Ach : InlineTreasuryDebitReversalNetworkXcd9afabe() {
        public override val `value`: String = "ach"
    }

    /**
     * Documented value. Wire value: `card`.
     */
    public data object Card : InlineTreasuryDebitReversalNetworkXcd9afabe() {
        public override val `value`: String = "card"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryDebitReversalNetworkXcd9afabe()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryDebitReversalNetworkXcd9afabe =
            when (value) {
                Ach.value -> Ach
                Card.value -> Card
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryDebitReversalNetworkXcd9afabe> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryDebitReversalNetworkXcd9afabe",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryDebitReversalNetworkXcd9afabe =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryDebitReversalNetworkXcd9afabe,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
