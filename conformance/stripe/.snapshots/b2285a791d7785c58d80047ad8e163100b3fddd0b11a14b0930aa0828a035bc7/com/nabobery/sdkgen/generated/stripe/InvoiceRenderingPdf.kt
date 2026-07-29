package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class InvoiceRenderingPdfView(
  @SerialName("page_size")
  public val pageSize: InlineInvoiceRenderingPdfPageSizeXa324d13f? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_rendering_pdf
 */
@Serializable(with = InvoiceRenderingPdf.Serializer::class)
public class InvoiceRenderingPdf(
  /**
   * Page size of invoice pdf. Options include a4, letter, and auto. If set to auto, page size will be switched to a4 or
   * letter based on customer locale.
   */
  public val pageSize: InlineInvoiceRenderingPdfPageSizeXa324d13f? = null,
) {
  public class Builder {
    /**
     * Page size of invoice pdf. Options include a4, letter, and auto. If set to auto, page size will be switched to a4
     * or letter based on customer locale.
     */
    public var pageSize: InlineInvoiceRenderingPdfPageSizeXa324d13f? = null

    public fun build(): InvoiceRenderingPdf = InvoiceRenderingPdf(
      pageSize = pageSize,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceRenderingPdf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoiceRenderingPdf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceRenderingPdf {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceRenderingPdf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceRenderingPdf must be a JSON object")
      return InvoiceRenderingPdf(
        pageSize = rawObject["page_size"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceRenderingPdfPageSizeXa324d13f?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceRenderingPdf) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceRenderingPdf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.pageSize?.let { put("page_size", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceRenderingPdf(block: InvoiceRenderingPdf.Builder.() -> Unit): InvoiceRenderingPdf = InvoiceRenderingPdf.build(block)
