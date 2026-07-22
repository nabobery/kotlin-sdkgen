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
 * The status of the Bancontact payments capability of the account, or whether the account can directly process
 * Bancontact charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/bancontact_payments
 */
@Serializable(with = InlineAccountCapabilitiesBancontactPaymentsXba86145d.Serializer::class)
public sealed class InlineAccountCapabilitiesBancontactPaymentsXba86145d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesBancontactPaymentsXba86145d() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesBancontactPaymentsXba86145d() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesBancontactPaymentsXba86145d() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesBancontactPaymentsXba86145d()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesBancontactPaymentsXba86145d =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesBancontactPaymentsXba86145d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesBancontactPaymentsXba86145d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesBancontactPaymentsXba86145d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesBancontactPaymentsXba86145d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
