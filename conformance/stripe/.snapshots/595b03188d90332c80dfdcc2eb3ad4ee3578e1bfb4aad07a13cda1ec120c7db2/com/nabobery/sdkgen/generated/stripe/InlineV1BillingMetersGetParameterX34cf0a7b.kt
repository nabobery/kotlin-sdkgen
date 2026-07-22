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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/get/parameters/4/schema
 */
@Serializable(with = InlineV1BillingMetersGetParameterX34cf0a7b.Serializer::class)
public sealed class InlineV1BillingMetersGetParameterX34cf0a7b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineV1BillingMetersGetParameterX34cf0a7b() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineV1BillingMetersGetParameterX34cf0a7b() {
        public override val `value`: String = "inactive"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingMetersGetParameterX34cf0a7b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1BillingMetersGetParameterX34cf0a7b =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingMetersGetParameterX34cf0a7b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersGetParameterX34cf0a7b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1BillingMetersGetParameterX34cf0a7b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingMetersGetParameterX34cf0a7b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
