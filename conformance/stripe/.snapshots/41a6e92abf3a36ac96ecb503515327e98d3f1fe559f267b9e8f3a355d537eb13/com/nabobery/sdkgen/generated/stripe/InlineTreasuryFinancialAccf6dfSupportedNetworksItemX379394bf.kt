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
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_financial_address/properties/su
 * pported_networks/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_financial_address/properties/su
 * pported_networks/items
 */
@Serializable(with = InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf.Serializer::class)
public sealed class InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf = when (value) {
      Ach.value -> Ach
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf) {
      encoder.encodeString(value.value)
    }
  }
}
