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
 * The status of the konbini payments capability of the account, or whether the account can directly process konbini
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/konbini_payments
 */
@Serializable(with = InlineAccountCapabilitiesKonbiniPaymentsXae40db25.Serializer::class)
public sealed class InlineAccountCapabilitiesKonbiniPaymentsXae40db25 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesKonbiniPaymentsXae40db25() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesKonbiniPaymentsXae40db25() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesKonbiniPaymentsXae40db25() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesKonbiniPaymentsXae40db25()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesKonbiniPaymentsXae40db25 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesKonbiniPaymentsXae40db25> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesKonbiniPaymentsXae40db25",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesKonbiniPaymentsXae40db25 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesKonbiniPaymentsXae40db25,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
