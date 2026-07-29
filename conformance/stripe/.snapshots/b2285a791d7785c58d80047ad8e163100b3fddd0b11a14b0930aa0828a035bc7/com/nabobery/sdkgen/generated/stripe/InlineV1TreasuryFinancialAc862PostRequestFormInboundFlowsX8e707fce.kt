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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/platform_restrictions/properties/inbound_flows.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/platform_restrictions/properties/inbound_flows
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce.Serializer::class)
public sealed class InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `restricted`.
   */
  public data object Restricted : InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce() {
    public override val `value`: String = "restricted"
  }

  /**
   * Documented value. Wire value: `unrestricted`.
   */
  public data object Unrestricted : InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce() {
    public override val `value`: String = "unrestricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce = when (value) {
      Restricted.value -> Restricted
      Unrestricted.value -> Unrestricted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormInboundFlowsX8e707fce) {
      encoder.encodeString(value.value)
    }
  }
}
