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
 * Whether the credit references a pending invoice item or one or more invoice line items on an invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_item_proration_credited_items/properties/type
 */
@Serializable(with = InlineInvoiceItemProrationCreditedItemsTypeX816d14e0.Serializer::class)
public sealed class InlineInvoiceItemProrationCreditedItemsTypeX816d14e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice_item`.
   */
  public data object InvoiceItem : InlineInvoiceItemProrationCreditedItemsTypeX816d14e0() {
    public override val `value`: String = "invoice_item"
  }

  /**
   * Documented value. Wire value: `invoice_line_items`.
   */
  public data object InvoiceLineItems : InlineInvoiceItemProrationCreditedItemsTypeX816d14e0() {
    public override val `value`: String = "invoice_line_items"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceItemProrationCreditedItemsTypeX816d14e0()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceItemProrationCreditedItemsTypeX816d14e0 = when (value) {
      InvoiceItem.value -> InvoiceItem
      InvoiceLineItems.value -> InvoiceLineItems
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceItemProrationCreditedItemsTypeX816d14e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoiceItemProrationCreditedItemsTypeX816d14e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceItemProrationCreditedItemsTypeX816d14e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceItemProrationCreditedItemsTypeX816d14e0) {
      encoder.encodeString(value.value)
    }
  }
}
