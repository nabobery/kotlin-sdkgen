package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
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
public data class InvoicesResourceInvoiceRenderingView(
  @SerialName("amount_tax_display")
  public val amountTaxDisplay: String? = null,
  public val pdf: InlineInvoicesResourceInvoiceRenderingPdfX02773b89? = null,
  public val template: String? = null,
  @SerialName("template_version")
  public val templateVersion: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_invoice_rendering
 */
@Serializable(with = InvoicesResourceInvoiceRendering.Serializer::class)
public class InvoicesResourceInvoiceRendering(
  /**
   * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
   */
  public val amountTaxDisplay: String? = null,
  /**
   * Invoice pdf rendering options
   */
  public val pdf: InlineInvoicesResourceInvoiceRenderingPdfX02773b89? = null,
  /**
   * ID of the rendering template that the invoice is formatted by.
   */
  public val template: String? = null,
  /**
   * Version of the rendering template that the invoice is using.
   */
  public val templateVersion: Int? = null,
) {
  public class Builder {
    /**
     * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
     */
    public var amountTaxDisplay: String? = null

    /**
     * Invoice pdf rendering options
     */
    public var pdf: InlineInvoicesResourceInvoiceRenderingPdfX02773b89? = null

    /**
     * ID of the rendering template that the invoice is formatted by.
     */
    public var template: String? = null

    /**
     * Version of the rendering template that the invoice is using.
     */
    public var templateVersion: Int? = null

    public fun build(): InvoicesResourceInvoiceRendering = InvoicesResourceInvoiceRendering(
      amountTaxDisplay = amountTaxDisplay,
      pdf = pdf,
      template = template,
      templateVersion = templateVersion,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicesResourceInvoiceRendering = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoicesResourceInvoiceRendering> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicesResourceInvoiceRendering {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicesResourceInvoiceRendering")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicesResourceInvoiceRendering must be a JSON object")
      return InvoicesResourceInvoiceRendering(
        amountTaxDisplay = rawObject["amount_tax_display"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        pdf = rawObject["pdf"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesResourceInvoiceRenderingPdfX02773b89?>(element) },
        template = rawObject["template"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        templateVersion = rawObject["template_version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicesResourceInvoiceRendering) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicesResourceInvoiceRendering")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountTaxDisplay?.let { put("amount_tax_display", it) }
        value.pdf?.let { put("pdf", json.encodeToJsonElement(it)) }
        value.template?.let { put("template", it) }
        value.templateVersion?.let { put("template_version", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicesResourceInvoiceRendering(block: InvoicesResourceInvoiceRendering.Builder.() -> Unit): InvoicesResourceInvoiceRendering = InvoicesResourceInvoiceRendering.build(block)
