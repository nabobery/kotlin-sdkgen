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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction_entry/properties/object
 */
@Serializable(with = InlineTreasuryTransactionEntryObjectValueX5712b74d.Serializer::class)
public sealed class InlineTreasuryTransactionEntryObjectValueX5712b74d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `treasury.transaction_entry`.
     */
    public data object TreasuryTransactionEntry : InlineTreasuryTransactionEntryObjectValueX5712b74d() {
        public override val `value`: String = "treasury.transaction_entry"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryTransactionEntryObjectValueX5712b74d()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryTransactionEntryObjectValueX5712b74d =
            when (value) {
                TreasuryTransactionEntry.value -> TreasuryTransactionEntry
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryTransactionEntryObjectValueX5712b74d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionEntryObjectValueX5712b74d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryTransactionEntryObjectValueX5712b74d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryTransactionEntryObjectValueX5712b74d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
