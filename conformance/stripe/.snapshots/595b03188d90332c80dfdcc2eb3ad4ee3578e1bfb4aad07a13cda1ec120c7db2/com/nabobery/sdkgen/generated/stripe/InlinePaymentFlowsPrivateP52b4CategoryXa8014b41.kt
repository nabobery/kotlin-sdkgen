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
 * Type of the line item.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_paypal_amount_details_line_ite
 * m_payment_method_options/properties/category
 */
@Serializable(with = InlinePaymentFlowsPrivateP52b4CategoryXa8014b41.Serializer::class)
public sealed class InlinePaymentFlowsPrivateP52b4CategoryXa8014b41 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `digital_goods`.
     */
    public data object DigitalGoods : InlinePaymentFlowsPrivateP52b4CategoryXa8014b41() {
        public override val `value`: String = "digital_goods"
    }

    /**
     * Documented value. Wire value: `donation`.
     */
    public data object Donation : InlinePaymentFlowsPrivateP52b4CategoryXa8014b41() {
        public override val `value`: String = "donation"
    }

    /**
     * Documented value. Wire value: `physical_goods`.
     */
    public data object PhysicalGoods : InlinePaymentFlowsPrivateP52b4CategoryXa8014b41() {
        public override val `value`: String = "physical_goods"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentFlowsPrivateP52b4CategoryXa8014b41()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentFlowsPrivateP52b4CategoryXa8014b41 =
            when (value) {
                DigitalGoods.value -> DigitalGoods
                Donation.value -> Donation
                PhysicalGoods.value -> PhysicalGoods
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentFlowsPrivateP52b4CategoryXa8014b41> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivateP52b4CategoryXa8014b41",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivateP52b4CategoryXa8014b41 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentFlowsPrivateP52b4CategoryXa8014b41,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
