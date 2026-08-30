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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}~1return/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/returned_details/properties/code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}~1return/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/returned_details/properties/code
 */
@Serializable(with = InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237.Serializer::class)
public sealed class InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_closed`.
   */
  public data object AccountClosed : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "account_closed"
  }

  /**
   * Documented value. Wire value: `account_frozen`.
   */
  public data object AccountFrozen : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "account_frozen"
  }

  /**
   * Documented value. Wire value: `bank_account_restricted`.
   */
  public data object BankAccountRestricted : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "bank_account_restricted"
  }

  /**
   * Documented value. Wire value: `bank_ownership_changed`.
   */
  public data object BankOwnershipChanged : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "bank_ownership_changed"
  }

  /**
   * Documented value. Wire value: `declined`.
   */
  public data object Declined : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "declined"
  }

  /**
   * Documented value. Wire value: `incorrect_account_holder_name`.
   */
  public data object IncorrectAccountHolderName : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "incorrect_account_holder_name"
  }

  /**
   * Documented value. Wire value: `invalid_account_number`.
   */
  public data object InvalidAccountNumber : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "invalid_account_number"
  }

  /**
   * Documented value. Wire value: `invalid_currency`.
   */
  public data object InvalidCurrency : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "invalid_currency"
  }

  /**
   * Documented value. Wire value: `no_account`.
   */
  public data object NoAccount : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "no_account"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237 = when (value) {
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

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237) {
      encoder.encodeString(value.value)
    }
  }
}
