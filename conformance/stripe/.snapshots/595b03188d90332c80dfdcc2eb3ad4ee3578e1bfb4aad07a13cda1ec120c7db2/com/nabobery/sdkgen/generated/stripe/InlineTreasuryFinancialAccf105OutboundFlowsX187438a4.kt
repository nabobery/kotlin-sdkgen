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
 * Restricts all outbound money movement.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_platform_restrictions/propertie
 * s/outbound_flows
 */
@Serializable(with = InlineTreasuryFinancialAccf105OutboundFlowsX187438a4.Serializer::class)
public sealed class InlineTreasuryFinancialAccf105OutboundFlowsX187438a4 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `restricted`.
     */
    public data object Restricted : InlineTreasuryFinancialAccf105OutboundFlowsX187438a4() {
        public override val `value`: String = "restricted"
    }

    /**
     * Documented value. Wire value: `unrestricted`.
     */
    public data object Unrestricted : InlineTreasuryFinancialAccf105OutboundFlowsX187438a4() {
        public override val `value`: String = "unrestricted"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryFinancialAccf105OutboundFlowsX187438a4()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryFinancialAccf105OutboundFlowsX187438a4 =
            when (value) {
                Restricted.value -> Restricted
                Unrestricted.value -> Unrestricted
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryFinancialAccf105OutboundFlowsX187438a4> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccf105OutboundFlowsX187438a4",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccf105OutboundFlowsX187438a4 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryFinancialAccf105OutboundFlowsX187438a4,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
