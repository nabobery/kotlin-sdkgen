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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation/properties/object
 */
@Serializable(with = InlineTaxCalculationObjectValueX7f5df0b7.Serializer::class)
public sealed class InlineTaxCalculationObjectValueX7f5df0b7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `tax.calculation`.
     */
    public data object TaxCalculation : InlineTaxCalculationObjectValueX7f5df0b7() {
        public override val `value`: String = "tax.calculation"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxCalculationObjectValueX7f5df0b7()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxCalculationObjectValueX7f5df0b7 =
            when (value) {
                TaxCalculation.value -> TaxCalculation
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxCalculationObjectValueX7f5df0b7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxCalculationObjectValueX7f5df0b7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxCalculationObjectValueX7f5df0b7 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxCalculationObjectValueX7f5df0b7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
