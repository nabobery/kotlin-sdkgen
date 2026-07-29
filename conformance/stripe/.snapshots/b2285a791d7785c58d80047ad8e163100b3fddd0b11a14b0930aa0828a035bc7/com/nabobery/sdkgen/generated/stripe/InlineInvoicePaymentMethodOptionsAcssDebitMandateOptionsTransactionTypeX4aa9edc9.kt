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
 * Transaction type of the mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_acss_debit_mandate_options/properties
 * /transaction_type
 */
@Serializable(with = InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9.Serializer::class)
public sealed class InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9 = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentMethodOptionsAcssDebitMandateOptionsTransactionTypeX4aa9edc9) {
      encoder.encodeString(value.value)
    }
  }
}
