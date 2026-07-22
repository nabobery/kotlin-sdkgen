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
 * The rails used to send funds.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_transfers_payment_method_details_financial_account/properti
 * es/network
 */
@Serializable(with = InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce.Serializer::class)
public sealed class InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `stripe`.
     */
    public data object Stripe : InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce() {
        public override val `value`: String = "stripe"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce =
            when (value) {
                Stripe.value -> Stripe
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
