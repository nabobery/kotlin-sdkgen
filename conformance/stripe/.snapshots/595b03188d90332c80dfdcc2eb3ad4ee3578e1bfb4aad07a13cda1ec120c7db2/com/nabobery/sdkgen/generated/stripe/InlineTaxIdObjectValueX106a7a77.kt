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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_id/properties/object
 */
@Serializable(with = InlineTaxIdObjectValueX106a7a77.Serializer::class)
public sealed class InlineTaxIdObjectValueX106a7a77 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `tax_id`.
     */
    public data object TaxId : InlineTaxIdObjectValueX106a7a77() {
        public override val `value`: String = "tax_id"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxIdObjectValueX106a7a77()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxIdObjectValueX106a7a77 =
            when (value) {
                TaxId.value -> TaxId
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxIdObjectValueX106a7a77> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxIdObjectValueX106a7a77",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxIdObjectValueX106a7a77 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxIdObjectValueX106a7a77,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
