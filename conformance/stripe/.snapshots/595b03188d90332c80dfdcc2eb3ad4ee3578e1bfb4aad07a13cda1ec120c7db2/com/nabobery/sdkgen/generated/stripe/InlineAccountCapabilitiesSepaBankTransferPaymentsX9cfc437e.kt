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
 * The status of the SEPA customer_balance payments (EUR currency) capability of the account, or whether the account can
 * directly process SEPA customer_balance charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/sepa_bank_transfer_payments
 */
@Serializable(with = InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e.Serializer::class)
public sealed class InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
