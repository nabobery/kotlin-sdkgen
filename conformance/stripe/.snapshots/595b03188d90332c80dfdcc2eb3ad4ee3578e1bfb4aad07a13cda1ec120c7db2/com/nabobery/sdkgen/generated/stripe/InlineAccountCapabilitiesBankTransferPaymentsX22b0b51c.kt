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
 * The status of the customer_balance payments capability of the account, or whether the account can directly process
 * customer_balance charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/bank_transfer_payments
 */
@Serializable(with = InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c.Serializer::class)
public sealed class InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
