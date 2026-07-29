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
 * The type of financial address
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_financial_address/properties/ty
 * pe
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `aba`.
   */
  public data object Aba : InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8() {
    public override val `value`: String = "aba"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8 = when (value) {
      Aba.value -> Aba
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8) {
      encoder.encodeString(value.value)
    }
  }
}
