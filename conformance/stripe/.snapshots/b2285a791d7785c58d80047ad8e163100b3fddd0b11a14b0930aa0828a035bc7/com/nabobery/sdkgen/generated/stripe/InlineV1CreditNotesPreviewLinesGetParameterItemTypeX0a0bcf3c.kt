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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/type
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c.Serializer::class)
public sealed class InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_line_item`.
   */
  public data object CustomLineItem : InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c() {
    public override val `value`: String = "custom_line_item"
  }

  /**
   * Documented value. Wire value: `invoice_line_item`.
   */
  public data object InvoiceLineItem : InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c() {
    public override val `value`: String = "invoice_line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c = when (value) {
      CustomLineItem.value -> CustomLineItem
      InvoiceLineItem.value -> InvoiceLineItem
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetParameterItemTypeX0a0bcf3c) {
      encoder.encodeString(value.value)
    }
  }
}
