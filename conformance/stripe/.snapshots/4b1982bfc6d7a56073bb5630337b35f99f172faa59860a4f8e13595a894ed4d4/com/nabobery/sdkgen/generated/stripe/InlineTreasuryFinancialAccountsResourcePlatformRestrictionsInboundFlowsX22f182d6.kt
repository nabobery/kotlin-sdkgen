package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Restricts all inbound money movement.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_platform_restrictions/propertie
 * s/inbound_flows
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `restricted`.
   */
  public data object Restricted : InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6() {
    public override val `value`: String = "restricted"
  }

  /**
   * Documented value. Wire value: `unrestricted`.
   */
  public data object Unrestricted : InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6() {
    public override val `value`: String = "unrestricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6 = when (value) {
      Restricted.value -> Restricted
      Unrestricted.value -> Unrestricted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourcePlatformRestrictionsInboundFlowsX22f182d6) {
      encoder.encodeString(value.value)
    }
  }
}
