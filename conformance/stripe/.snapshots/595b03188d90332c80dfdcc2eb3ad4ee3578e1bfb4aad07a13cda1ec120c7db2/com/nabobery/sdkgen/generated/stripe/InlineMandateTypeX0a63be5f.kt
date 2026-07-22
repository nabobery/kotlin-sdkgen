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
 * The type of the mandate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate/properties/type
 */
@Serializable(with = InlineMandateTypeX0a63be5f.Serializer::class)
public sealed class InlineMandateTypeX0a63be5f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `multi_use`.
     */
    public data object MultiUse : InlineMandateTypeX0a63be5f() {
        public override val `value`: String = "multi_use"
    }

    /**
     * Documented value. Wire value: `single_use`.
     */
    public data object SingleUse : InlineMandateTypeX0a63be5f() {
        public override val `value`: String = "single_use"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineMandateTypeX0a63be5f()

    public companion object {
        public fun fromValue(`value`: String): InlineMandateTypeX0a63be5f =
            when (value) {
                MultiUse.value -> MultiUse
                SingleUse.value -> SingleUse
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineMandateTypeX0a63be5f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineMandateTypeX0a63be5f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineMandateTypeX0a63be5f = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineMandateTypeX0a63be5f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
