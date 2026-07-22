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
 * The status of the Zip capability of the account, or whether the account can directly process Zip charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/zip_payments
 */
@Serializable(with = InlineAccountCapabilitiesZipPaymentsXbb9872a8.Serializer::class)
public sealed class InlineAccountCapabilitiesZipPaymentsXbb9872a8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesZipPaymentsXbb9872a8() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesZipPaymentsXbb9872a8() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesZipPaymentsXbb9872a8() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesZipPaymentsXbb9872a8()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesZipPaymentsXbb9872a8 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesZipPaymentsXbb9872a8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesZipPaymentsXbb9872a8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesZipPaymentsXbb9872a8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesZipPaymentsXbb9872a8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
