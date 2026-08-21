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
 * Reason for the return.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_transfers_resource_returned_details/properties/cod
 * e
 */
@Serializable(with = InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46.Serializer::class)
public sealed class InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_closed`.
   */
  public data object AccountClosed : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "account_closed"
  }

  /**
   * Documented value. Wire value: `account_frozen`.
   */
  public data object AccountFrozen : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "account_frozen"
  }

  /**
   * Documented value. Wire value: `bank_account_restricted`.
   */
  public data object BankAccountRestricted : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "bank_account_restricted"
  }

  /**
   * Documented value. Wire value: `bank_ownership_changed`.
   */
  public data object BankOwnershipChanged : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "bank_ownership_changed"
  }

  /**
   * Documented value. Wire value: `declined`.
   */
  public data object Declined : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "declined"
  }

  /**
   * Documented value. Wire value: `incorrect_account_holder_name`.
   */
  public data object IncorrectAccountHolderName : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "incorrect_account_holder_name"
  }

  /**
   * Documented value. Wire value: `invalid_account_number`.
   */
  public data object InvalidAccountNumber : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "invalid_account_number"
  }

  /**
   * Documented value. Wire value: `invalid_currency`.
   */
  public data object InvalidCurrency : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "invalid_currency"
  }

  /**
   * Documented value. Wire value: `no_account`.
   */
  public data object NoAccount : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "no_account"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46 = when (value) {
      AccountClosed.value -> AccountClosed
      AccountFrozen.value -> AccountFrozen
      BankAccountRestricted.value -> BankAccountRestricted
      BankOwnershipChanged.value -> BankOwnershipChanged
      Declined.value -> Declined
      IncorrectAccountHolderName.value -> IncorrectAccountHolderName
      InvalidAccountNumber.value -> InvalidAccountNumber
      InvalidCurrency.value -> InvalidCurrency
      NoAccount.value -> NoAccount
      Other.value -> Other
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46) {
      encoder.encodeString(value.value)
    }
  }
}
