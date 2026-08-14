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
 * Type of payment object associated with this invoice payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoices_payments_invoice_payment_associated_payment/properties/type
 */
@Serializable(with = InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0.Serializer::class)
public sealed class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge`.
   */
  public data object Charge : InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0() {
    public override val `value`: String = "charge"
  }

  /**
   * Documented value. Wire value: `payment_intent`.
   */
  public data object PaymentIntent : InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0() {
    public override val `value`: String = "payment_intent"
  }

  /**
   * Documented value. Wire value: `payment_record`.
   */
  public data object PaymentRecord : InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0() {
    public override val `value`: String = "payment_record"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0 = when (value) {
      Charge.value -> Charge
      PaymentIntent.value -> PaymentIntent
      PaymentRecord.value -> PaymentRecord
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentTypeX71d5b3e0) {
      encoder.encodeString(value.value)
    }
  }
}
