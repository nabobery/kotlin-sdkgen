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
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_payments_resource_returned_status/properties/code
 */
@Serializable(with = InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292.Serializer::class)
public sealed class InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_closed`.
   */
  public data object AccountClosed : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "account_closed"
  }

  /**
   * Documented value. Wire value: `account_frozen`.
   */
  public data object AccountFrozen : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "account_frozen"
  }

  /**
   * Documented value. Wire value: `bank_account_restricted`.
   */
  public data object BankAccountRestricted : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "bank_account_restricted"
  }

  /**
   * Documented value. Wire value: `bank_ownership_changed`.
   */
  public data object BankOwnershipChanged : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "bank_ownership_changed"
  }

  /**
   * Documented value. Wire value: `declined`.
   */
  public data object Declined : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "declined"
  }

  /**
   * Documented value. Wire value: `incorrect_account_holder_name`.
   */
  public data object IncorrectAccountHolderName : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "incorrect_account_holder_name"
  }

  /**
   * Documented value. Wire value: `invalid_account_number`.
   */
  public data object InvalidAccountNumber : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "invalid_account_number"
  }

  /**
   * Documented value. Wire value: `invalid_currency`.
   */
  public data object InvalidCurrency : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "invalid_currency"
  }

  /**
   * Documented value. Wire value: `no_account`.
   */
  public data object NoAccount : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "no_account"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292 = when (value) {
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

  public object Serializer : KSerializer<InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292) {
      encoder.encodeString(value.value)
    }
  }
}
