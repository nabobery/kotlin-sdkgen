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
 * String representing the object’s type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.supplier/properties/object
 */
@Serializable(with = InlineClimateSupplierObjectValueXe62fdd2b.Serializer::class)
public sealed class InlineClimateSupplierObjectValueXe62fdd2b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `climate.supplier`.
     */
    public data object ClimateSupplier : InlineClimateSupplierObjectValueXe62fdd2b() {
        public override val `value`: String = "climate.supplier"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineClimateSupplierObjectValueXe62fdd2b()

    public companion object {
        public fun fromValue(`value`: String): InlineClimateSupplierObjectValueXe62fdd2b =
            when (value) {
                ClimateSupplier.value -> ClimateSupplier
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineClimateSupplierObjectValueXe62fdd2b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineClimateSupplierObjectValueXe62fdd2b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineClimateSupplierObjectValueXe62fdd2b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineClimateSupplierObjectValueXe62fdd2b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
