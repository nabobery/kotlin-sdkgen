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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/object
 */
@Serializable(with = InlineIssuingTransactionObjectValueX865231d6.Serializer::class)
public sealed class InlineIssuingTransactionObjectValueX865231d6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `issuing.transaction`.
     */
    public data object IssuingTransaction : InlineIssuingTransactionObjectValueX865231d6() {
        public override val `value`: String = "issuing.transaction"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingTransactionObjectValueX865231d6()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingTransactionObjectValueX865231d6 =
            when (value) {
                IssuingTransaction.value -> IssuingTransaction
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingTransactionObjectValueX865231d6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingTransactionObjectValueX865231d6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingTransactionObjectValueX865231d6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingTransactionObjectValueX865231d6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
