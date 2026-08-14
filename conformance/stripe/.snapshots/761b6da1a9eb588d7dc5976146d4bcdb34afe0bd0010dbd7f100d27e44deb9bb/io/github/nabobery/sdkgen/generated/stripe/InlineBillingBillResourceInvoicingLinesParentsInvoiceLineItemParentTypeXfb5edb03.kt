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
 * The type of parent that generated this line item
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_pare
 * nt/properties/type
 */
@Serializable(with = InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03.Serializer::class)
public sealed class InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice_item_details`.
   */
  public data object InvoiceItemDetails : InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03() {
    public override val `value`: String = "invoice_item_details"
  }

  /**
   * Documented value. Wire value: `subscription_item_details`.
   */
  public data object SubscriptionItemDetails : InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03() {
    public override val `value`: String = "subscription_item_details"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03 = when (value) {
      InvoiceItemDetails.value -> InvoiceItemDetails
      SubscriptionItemDetails.value -> SubscriptionItemDetails
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingLinesParentsInvoiceLineItemParentTypeXfb5edb03) {
      encoder.encodeString(value.value)
    }
  }
}
