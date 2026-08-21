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
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_closed_status_details/propertie
 * s/reasons/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_closed_status_details/propertie
 * s/reasons/items
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_rejected`.
   */
  public data object AccountRejected : InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334() {
    public override val `value`: String = "account_rejected"
  }

  /**
   * Documented value. Wire value: `closed_by_platform`.
   */
  public data object ClosedByPlatform : InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334() {
    public override val `value`: String = "closed_by_platform"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334 = when (value) {
      AccountRejected.value -> AccountRejected
      ClosedByPlatform.value -> ClosedByPlatform
      Other.value -> Other
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334) {
      encoder.encodeString(value.value)
    }
  }
}
