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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/invoice_metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/invoice_metadata/anyOf/1
 */
@Serializable(with = InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf.Serializer::class)
public sealed class InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf) {
      encoder.encodeString(value.value)
    }
  }
}
