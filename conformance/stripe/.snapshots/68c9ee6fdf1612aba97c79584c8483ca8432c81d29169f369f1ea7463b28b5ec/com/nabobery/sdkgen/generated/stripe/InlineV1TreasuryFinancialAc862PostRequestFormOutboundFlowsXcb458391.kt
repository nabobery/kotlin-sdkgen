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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/platform_restrictions/properties/outbound_flows.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/platform_restrictions/properties/outbound_flows
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391.Serializer::class)
public sealed class InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `restricted`.
   */
  public data object Restricted : InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391() {
    public override val `value`: String = "restricted"
  }

  /**
   * Documented value. Wire value: `unrestricted`.
   */
  public data object Unrestricted : InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391() {
    public override val `value`: String = "unrestricted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391 = when (value) {
      Restricted.value -> Restricted
      Unrestricted.value -> Unrestricted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormOutboundFlowsXcb458391) {
      encoder.encodeString(value.value)
    }
  }
}
