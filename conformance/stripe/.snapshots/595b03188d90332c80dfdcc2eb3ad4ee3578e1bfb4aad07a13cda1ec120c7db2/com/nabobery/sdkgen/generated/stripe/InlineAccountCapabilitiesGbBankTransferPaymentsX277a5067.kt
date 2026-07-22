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
 * The status of the GB customer_balance payments (GBP currency) capability of the account, or whether the account can
 * directly process GB customer_balance charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/gb_bank_transfer_payments
 */
@Serializable(with = InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067.Serializer::class)
public sealed class InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
