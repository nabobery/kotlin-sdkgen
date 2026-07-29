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
 * Page size of invoice pdf. Options include a4, letter, and auto. If set to auto, page size will be switched to a4 or
 * letter based on customer locale.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_rendering_pdf/properties/page_size
 */
@Serializable(with = InlineInvoiceRenderingPdfPageSizeXa324d13f.Serializer::class)
public sealed class InlineInvoiceRenderingPdfPageSizeXa324d13f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `a4`.
   */
  public data object A4 : InlineInvoiceRenderingPdfPageSizeXa324d13f() {
    public override val `value`: String = "a4"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineInvoiceRenderingPdfPageSizeXa324d13f() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `letter`.
   */
  public data object Letter : InlineInvoiceRenderingPdfPageSizeXa324d13f() {
    public override val `value`: String = "letter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceRenderingPdfPageSizeXa324d13f()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceRenderingPdfPageSizeXa324d13f = when (value) {
      A4.value -> A4
      Auto.value -> Auto
      Letter.value -> Letter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceRenderingPdfPageSizeXa324d13f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoiceRenderingPdfPageSizeXa324d13f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceRenderingPdfPageSizeXa324d13f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceRenderingPdfPageSizeXa324d13f) {
      encoder.encodeString(value.value)
    }
  }
}
