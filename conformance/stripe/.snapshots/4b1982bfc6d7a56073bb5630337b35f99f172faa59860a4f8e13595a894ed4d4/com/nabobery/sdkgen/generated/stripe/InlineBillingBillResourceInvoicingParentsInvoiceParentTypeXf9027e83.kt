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
 * The type of parent that generated this invoice
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_parents_invoice_parent/properties/ty
 * pe
 */
@Serializable(with = InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83.Serializer::class)
public sealed class InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `quote_details`.
   */
  public data object QuoteDetails : InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83() {
    public override val `value`: String = "quote_details"
  }

  /**
   * Documented value. Wire value: `subscription_details`.
   */
  public data object SubscriptionDetails : InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83() {
    public override val `value`: String = "subscription_details"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83 = when (value) {
      QuoteDetails.value -> QuoteDetails
      SubscriptionDetails.value -> SubscriptionDetails
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingParentsInvoiceParentTypeXf9027e83) {
      encoder.encodeString(value.value)
    }
  }
}
