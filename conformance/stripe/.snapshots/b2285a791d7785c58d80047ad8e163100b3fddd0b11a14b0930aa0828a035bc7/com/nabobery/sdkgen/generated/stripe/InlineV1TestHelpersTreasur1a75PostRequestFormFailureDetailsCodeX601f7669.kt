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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1inbound_transfers~1{id}~1fail/post/requestBody/cont
 * ent/application~1x-www-form-urlencoded/schema/properties/failure_details/properties/code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1inbound_transfers~1{id}~1fail/post/requestBody/cont
 * ent/application~1x-www-form-urlencoded/schema/properties/failure_details/properties/code
 */
@Serializable(with = InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669.Serializer::class)
public sealed class InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_closed`.
   */
  public data object AccountClosed : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "account_closed"
  }

  /**
   * Documented value. Wire value: `account_frozen`.
   */
  public data object AccountFrozen : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "account_frozen"
  }

  /**
   * Documented value. Wire value: `bank_account_restricted`.
   */
  public data object BankAccountRestricted : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "bank_account_restricted"
  }

  /**
   * Documented value. Wire value: `bank_ownership_changed`.
   */
  public data object BankOwnershipChanged : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "bank_ownership_changed"
  }

  /**
   * Documented value. Wire value: `debit_not_authorized`.
   */
  public data object DebitNotAuthorized : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "debit_not_authorized"
  }

  /**
   * Documented value. Wire value: `incorrect_account_holder_address`.
   */
  public data object IncorrectAccountHolderAddress : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "incorrect_account_holder_address"
  }

  /**
   * Documented value. Wire value: `incorrect_account_holder_name`.
   */
  public data object IncorrectAccountHolderName : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "incorrect_account_holder_name"
  }

  /**
   * Documented value. Wire value: `incorrect_account_holder_tax_id`.
   */
  public data object IncorrectAccountHolderTaxId : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "incorrect_account_holder_tax_id"
  }

  /**
   * Documented value. Wire value: `insufficient_funds`.
   */
  public data object InsufficientFunds : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "insufficient_funds"
  }

  /**
   * Documented value. Wire value: `invalid_account_number`.
   */
  public data object InvalidAccountNumber : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "invalid_account_number"
  }

  /**
   * Documented value. Wire value: `invalid_currency`.
   */
  public data object InvalidCurrency : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "invalid_currency"
  }

  /**
   * Documented value. Wire value: `no_account`.
   */
  public data object NoAccount : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "no_account"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669 = when (value) {
      AccountClosed.value -> AccountClosed
      AccountFrozen.value -> AccountFrozen
      BankAccountRestricted.value -> BankAccountRestricted
      BankOwnershipChanged.value -> BankOwnershipChanged
      DebitNotAuthorized.value -> DebitNotAuthorized
      IncorrectAccountHolderAddress.value -> IncorrectAccountHolderAddress
      IncorrectAccountHolderName.value -> IncorrectAccountHolderName
      IncorrectAccountHolderTaxId.value -> IncorrectAccountHolderTaxId
      InsufficientFunds.value -> InsufficientFunds
      InvalidAccountNumber.value -> InvalidAccountNumber
      InvalidCurrency.value -> InvalidCurrency
      NoAccount.value -> NoAccount
      Other.value -> Other
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsCodeX601f7669) {
      encoder.encodeString(value.value)
    }
  }
}
