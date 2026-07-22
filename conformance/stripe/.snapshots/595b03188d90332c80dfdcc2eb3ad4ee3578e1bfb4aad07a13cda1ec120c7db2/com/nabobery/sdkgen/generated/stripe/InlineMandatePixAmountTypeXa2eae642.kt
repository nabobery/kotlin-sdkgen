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
 * Type of amount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_pix/properties/amount_type
 */
@Serializable(with = InlineMandatePixAmountTypeXa2eae642.Serializer::class)
public sealed class InlineMandatePixAmountTypeXa2eae642 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineMandatePixAmountTypeXa2eae642() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineMandatePixAmountTypeXa2eae642() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineMandatePixAmountTypeXa2eae642()

    public companion object {
        public fun fromValue(`value`: String): InlineMandatePixAmountTypeXa2eae642 =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineMandatePixAmountTypeXa2eae642> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineMandatePixAmountTypeXa2eae642",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineMandatePixAmountTypeXa2eae642 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineMandatePixAmountTypeXa2eae642,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
