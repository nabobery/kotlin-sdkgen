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
 * The status of the Tax `Settings`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.settings/properties/status
 */
@Serializable(with = InlineTaxSettingsStatusX499abf9f.Serializer::class)
public sealed class InlineTaxSettingsStatusX499abf9f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineTaxSettingsStatusX499abf9f() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineTaxSettingsStatusX499abf9f() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxSettingsStatusX499abf9f()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxSettingsStatusX499abf9f =
            when (value) {
                Active.value -> Active
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxSettingsStatusX499abf9f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxSettingsStatusX499abf9f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxSettingsStatusX499abf9f = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxSettingsStatusX499abf9f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
