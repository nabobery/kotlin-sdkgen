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
 * The type of the credit note line item, one of `invoice_line_item` or `custom_line_item`. When the type is
 * `invoice_line_item` there is an additional `invoice_line_item` property on the resource the value of which is the id
 * of the credited line item on the invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note_line_item/properties/type
 */
@Serializable(with = InlineCreditNoteLineItemTypeXfc7121bf.Serializer::class)
public sealed class InlineCreditNoteLineItemTypeXfc7121bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_line_item`.
   */
  public data object CustomLineItem : InlineCreditNoteLineItemTypeXfc7121bf() {
    public override val `value`: String = "custom_line_item"
  }

  /**
   * Documented value. Wire value: `invoice_line_item`.
   */
  public data object InvoiceLineItem : InlineCreditNoteLineItemTypeXfc7121bf() {
    public override val `value`: String = "invoice_line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreditNoteLineItemTypeXfc7121bf()

  public companion object {
    public fun fromValue(`value`: String): InlineCreditNoteLineItemTypeXfc7121bf = when (value) {
      CustomLineItem.value -> CustomLineItem
      InvoiceLineItem.value -> InvoiceLineItem
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteLineItemTypeXfc7121bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCreditNoteLineItemTypeXfc7121bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreditNoteLineItemTypeXfc7121bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteLineItemTypeXfc7121bf) {
      encoder.encodeString(value.value)
    }
  }
}
