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
 * The type of the payment method used in the OutboundTransfer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/outbound_transfers_payment_method_details/properties/type
 */
@Serializable(with = InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32.Serializer::class)
public sealed class InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `financial_account`.
     */
    public data object FinancialAccount : InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32() {
        public override val `value`: String = "financial_account"
    }

    /**
     * Documented value. Wire value: `us_bank_account`.
     */
    public data object UsBankAccount : InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32() {
        public override val `value`: String = "us_bank_account"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32()

    public companion object {
        public fun fromValue(`value`: String): InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32 =
            when (value) {
                FinancialAccount.value -> FinancialAccount
                UsBankAccount.value -> UsBankAccount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineOutboundTransfersPaymentMethodDetailsTypeX3cfd6f32,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
