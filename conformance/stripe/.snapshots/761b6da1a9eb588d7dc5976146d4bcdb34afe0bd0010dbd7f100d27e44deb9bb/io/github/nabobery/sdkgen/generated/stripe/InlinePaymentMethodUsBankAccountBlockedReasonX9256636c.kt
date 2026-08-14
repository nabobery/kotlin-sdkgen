package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The reason why this PaymentMethod's fingerprint has been blocked
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account_blocked/properties/reason
 */
@Serializable(with = InlinePaymentMethodUsBankAccountBlockedReasonX9256636c.Serializer::class)
public sealed class InlinePaymentMethodUsBankAccountBlockedReasonX9256636c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account_closed`.
   */
  public data object BankAccountClosed : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c() {
    public override val `value`: String = "bank_account_closed"
  }

  /**
   * Documented value. Wire value: `bank_account_frozen`.
   */
  public data object BankAccountFrozen : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c() {
    public override val `value`: String = "bank_account_frozen"
  }

  /**
   * Documented value. Wire value: `bank_account_invalid_details`.
   */
  public data object BankAccountInvalidDetails : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c() {
    public override val `value`: String = "bank_account_invalid_details"
  }

  /**
   * Documented value. Wire value: `bank_account_restricted`.
   */
  public data object BankAccountRestricted : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c() {
    public override val `value`: String = "bank_account_restricted"
  }

  /**
   * Documented value. Wire value: `bank_account_unusable`.
   */
  public data object BankAccountUnusable : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c() {
    public override val `value`: String = "bank_account_unusable"
  }

  /**
   * Documented value. Wire value: `debit_not_authorized`.
   */
  public data object DebitNotAuthorized : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c() {
    public override val `value`: String = "debit_not_authorized"
  }

  /**
   * Documented value. Wire value: `tokenized_account_number_deactivated`.
   */
  public data object TokenizedAccountNumberDeactivated : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c() {
    public override val `value`: String = "tokenized_account_number_deactivated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodUsBankAccountBlockedReasonX9256636c()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodUsBankAccountBlockedReasonX9256636c = when (value) {
      BankAccountClosed.value -> BankAccountClosed
      BankAccountFrozen.value -> BankAccountFrozen
      BankAccountInvalidDetails.value -> BankAccountInvalidDetails
      BankAccountRestricted.value -> BankAccountRestricted
      BankAccountUnusable.value -> BankAccountUnusable
      DebitNotAuthorized.value -> DebitNotAuthorized
      TokenizedAccountNumberDeactivated.value -> TokenizedAccountNumberDeactivated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodUsBankAccountBlockedReasonX9256636c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodUsBankAccountBlockedReasonX9256636c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodUsBankAccountBlockedReasonX9256636c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodUsBankAccountBlockedReasonX9256636c) {
      encoder.encodeString(value.value)
    }
  }
}
