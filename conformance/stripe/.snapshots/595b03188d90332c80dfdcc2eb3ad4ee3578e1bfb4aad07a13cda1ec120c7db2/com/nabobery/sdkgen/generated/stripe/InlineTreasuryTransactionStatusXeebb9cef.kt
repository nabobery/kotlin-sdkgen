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
 * Status of the Transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction/properties/status
 */
@Serializable(with = InlineTreasuryTransactionStatusXeebb9cef.Serializer::class)
public sealed class InlineTreasuryTransactionStatusXeebb9cef {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `open`.
     */
    public data object Open : InlineTreasuryTransactionStatusXeebb9cef() {
        public override val `value`: String = "open"
    }

    /**
     * Documented value. Wire value: `posted`.
     */
    public data object Posted : InlineTreasuryTransactionStatusXeebb9cef() {
        public override val `value`: String = "posted"
    }

    /**
     * Documented value. Wire value: `void`.
     */
    public data object Void : InlineTreasuryTransactionStatusXeebb9cef() {
        public override val `value`: String = "void"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryTransactionStatusXeebb9cef()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryTransactionStatusXeebb9cef =
            when (value) {
                Open.value -> Open
                Posted.value -> Posted
                Void.value -> Void
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryTransactionStatusXeebb9cef> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionStatusXeebb9cef",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryTransactionStatusXeebb9cef =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryTransactionStatusXeebb9cef,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
