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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/type.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/type
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b.Serializer::class)
public sealed class InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_line_item`.
   */
  public data object CustomLineItem : InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b() {
    public override val `value`: String = "custom_line_item"
  }

  /**
   * Documented value. Wire value: `invoice_line_item`.
   */
  public data object InvoiceLineItem : InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b() {
    public override val `value`: String = "invoice_line_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b = when (value) {
      CustomLineItem.value -> CustomLineItem
      InvoiceLineItem.value -> InvoiceLineItem
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewGetParameterItemTypeX6d20630b) {
      encoder.encodeString(value.value)
    }
  }
}
