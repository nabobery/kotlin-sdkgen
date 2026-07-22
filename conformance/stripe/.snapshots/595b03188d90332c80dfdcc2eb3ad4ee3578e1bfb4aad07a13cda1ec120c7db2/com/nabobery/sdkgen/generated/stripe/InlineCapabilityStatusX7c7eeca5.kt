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
 * The status of the capability.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/capability/properties/status
 */
@Serializable(with = InlineCapabilityStatusX7c7eeca5.Serializer::class)
public sealed class InlineCapabilityStatusX7c7eeca5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineCapabilityStatusX7c7eeca5() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineCapabilityStatusX7c7eeca5() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineCapabilityStatusX7c7eeca5() {
        public override val `value`: String = "pending"
    }

    /**
     * Documented value. Wire value: `unrequested`.
     */
    public data object Unrequested : InlineCapabilityStatusX7c7eeca5() {
        public override val `value`: String = "unrequested"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCapabilityStatusX7c7eeca5()

    public companion object {
        public fun fromValue(`value`: String): InlineCapabilityStatusX7c7eeca5 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                Unrequested.value -> Unrequested
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCapabilityStatusX7c7eeca5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCapabilityStatusX7c7eeca5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCapabilityStatusX7c7eeca5 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCapabilityStatusX7c7eeca5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
