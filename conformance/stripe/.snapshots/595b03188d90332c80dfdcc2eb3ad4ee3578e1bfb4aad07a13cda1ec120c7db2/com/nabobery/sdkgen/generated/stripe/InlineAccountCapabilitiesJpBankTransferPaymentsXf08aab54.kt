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
 * The status of the Japanese customer_balance payments (JPY currency) capability of the account, or whether the account
 * can directly process Japanese customer_balance charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/jp_bank_transfer_payments
 */
@Serializable(with = InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54.Serializer::class)
public sealed class InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
