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
 * Transaction type: `adjustment`, `applied_to_invoice`, `credit_note`, `initial`, `invoice_overpaid`,
 * `invoice_too_large`, `invoice_too_small`, `unspent_receiver_credit`, `unapplied_from_invoice`,
 * `checkout_session_subscription_payment`, or `checkout_session_subscription_payment_canceled`. See the [Customer
 * Balance page](https://docs.stripe.com/billing/customer/balance#types) to learn more about transaction types.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_transaction/properties/type
 */
@Serializable(with = InlineCustomerBalanceTransactionTypeXd0405a14.Serializer::class)
public sealed class InlineCustomerBalanceTransactionTypeXd0405a14 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adjustment`.
   */
  public data object Adjustment : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "adjustment"
  }

  /**
   * Documented value. Wire value: `applied_to_invoice`.
   */
  public data object AppliedToInvoice : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "applied_to_invoice"
  }

  /**
   * Documented value. Wire value: `checkout_session_subscription_payment`.
   */
  public data object CheckoutSessionSubscriptionPayment : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "checkout_session_subscription_payment"
  }

  /**
   * Documented value. Wire value: `checkout_session_subscription_payment_canceled`.
   */
  public data object CheckoutSessionSubscriptionPaymentCanceled : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "checkout_session_subscription_payment_canceled"
  }

  /**
   * Documented value. Wire value: `credit_note`.
   */
  public data object CreditNote : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "credit_note"
  }

  /**
   * Documented value. Wire value: `initial`.
   */
  public data object Initial : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "initial"
  }

  /**
   * Documented value. Wire value: `invoice_overpaid`.
   */
  public data object InvoiceOverpaid : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "invoice_overpaid"
  }

  /**
   * Documented value. Wire value: `invoice_too_large`.
   */
  public data object InvoiceTooLarge : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "invoice_too_large"
  }

  /**
   * Documented value. Wire value: `invoice_too_small`.
   */
  public data object InvoiceTooSmall : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "invoice_too_small"
  }

  /**
   * Documented value. Wire value: `migration`.
   */
  public data object Migration : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "migration"
  }

  /**
   * Documented value. Wire value: `unapplied_from_invoice`.
   */
  public data object UnappliedFromInvoice : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "unapplied_from_invoice"
  }

  /**
   * Documented value. Wire value: `unspent_receiver_credit`.
   */
  public data object UnspentReceiverCredit : InlineCustomerBalanceTransactionTypeXd0405a14() {
    public override val `value`: String = "unspent_receiver_credit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerBalanceTransactionTypeXd0405a14()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerBalanceTransactionTypeXd0405a14 = when (value) {
      Adjustment.value -> Adjustment
      AppliedToInvoice.value -> AppliedToInvoice
      CheckoutSessionSubscriptionPayment.value -> CheckoutSessionSubscriptionPayment
      CheckoutSessionSubscriptionPaymentCanceled.value -> CheckoutSessionSubscriptionPaymentCanceled
      CreditNote.value -> CreditNote
      Initial.value -> Initial
      InvoiceOverpaid.value -> InvoiceOverpaid
      InvoiceTooLarge.value -> InvoiceTooLarge
      InvoiceTooSmall.value -> InvoiceTooSmall
      Migration.value -> Migration
      UnappliedFromInvoice.value -> UnappliedFromInvoice
      UnspentReceiverCredit.value -> UnspentReceiverCredit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceTransactionTypeXd0405a14> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerBalanceTransactionTypeXd0405a14", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceTransactionTypeXd0405a14 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceTransactionTypeXd0405a14) {
      encoder.encodeString(value.value)
    }
  }
}
