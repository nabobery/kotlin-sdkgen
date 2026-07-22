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
 * The nature of the transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/type
 */
@Serializable(with = InlineIssuingTransactionTypeX08595f91.Serializer::class)
public sealed class InlineIssuingTransactionTypeX08595f91 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `capture`.
     */
    public data object Capture : InlineIssuingTransactionTypeX08595f91() {
        public override val `value`: String = "capture"
    }

    /**
     * Documented value. Wire value: `refund`.
     */
    public data object Refund : InlineIssuingTransactionTypeX08595f91() {
        public override val `value`: String = "refund"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingTransactionTypeX08595f91()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingTransactionTypeX08595f91 =
            when (value) {
                Capture.value -> Capture
                Refund.value -> Refund
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingTransactionTypeX08595f91> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingTransactionTypeX08595f91",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingTransactionTypeX08595f91 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingTransactionTypeX08595f91,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
