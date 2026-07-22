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
 * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
 * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_upi/properties/amount_type
 */
@Serializable(with = InlineMandateUpiAmountTypeX9eb5e33d.Serializer::class)
public sealed class InlineMandateUpiAmountTypeX9eb5e33d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineMandateUpiAmountTypeX9eb5e33d() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineMandateUpiAmountTypeX9eb5e33d() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineMandateUpiAmountTypeX9eb5e33d()

    public companion object {
        public fun fromValue(`value`: String): InlineMandateUpiAmountTypeX9eb5e33d =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineMandateUpiAmountTypeX9eb5e33d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineMandateUpiAmountTypeX9eb5e33d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineMandateUpiAmountTypeX9eb5e33d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineMandateUpiAmountTypeX9eb5e33d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
