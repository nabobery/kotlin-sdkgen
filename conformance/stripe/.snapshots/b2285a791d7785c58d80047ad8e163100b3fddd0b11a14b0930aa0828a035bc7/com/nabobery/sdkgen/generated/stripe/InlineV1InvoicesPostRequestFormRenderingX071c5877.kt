package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF and
 * Hosted Invoice Page.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/rendering
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingX071c5877.Serializer::class)
public class InlineV1InvoicesPostRequestFormRenderingX071c5877(
  public val amountTaxDisplay:
      InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16? = null,
  public val pdf: InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9? = null,
  public val template: String? = null,
  public val templateVersion:
      InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450? = null,
) {
  public class Builder {
    public var amountTaxDisplay: InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16?
        = null

    public var pdf: InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9? = null

    public var template: String? = null

    public var templateVersion: InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450? =
        null

    public fun build(): InlineV1InvoicesPostRequestFormRenderingX071c5877 = InlineV1InvoicesPostRequestFormRenderingX071c5877(
      amountTaxDisplay = amountTaxDisplay,
      pdf = pdf,
      template = template,
      templateVersion = templateVersion,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormRenderingX071c5877 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingX071c5877> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingX071c5877 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormRenderingX071c5877")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormRenderingX071c5877 must be a JSON object")
      return InlineV1InvoicesPostRequestFormRenderingX071c5877(
        amountTaxDisplay = rawObject["amount_tax_display"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX43329d16>(it) },
        pdf = rawObject["pdf"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingPdfX0cd1a3c9>(it) },
        template = rawObject["template"]?.let { json.decodeFromJsonElement<String>(it) },
        templateVersion = rawObject["template_version"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormRenderingX071c5877) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormRenderingX071c5877")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountTaxDisplay?.let { put("amount_tax_display", json.encodeToJsonElement(it)) }
        value.pdf?.let { put("pdf", json.encodeToJsonElement(it)) }
        value.template?.let { put("template", it) }
        value.templateVersion?.let { put("template_version", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormRenderingX071c5877(block: InlineV1InvoicesPostRequestFormRenderingX071c5877.Builder.() -> Unit): InlineV1InvoicesPostRequestFormRenderingX071c5877 = InlineV1InvoicesPostRequestFormRenderingX071c5877.build(block)
