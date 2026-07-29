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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/rendering
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingXf3022a61.Serializer::class)
public class InlineV1InvoicesPostRequestFormRenderingXf3022a61(
  public val amountTaxDisplay:
      InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX6bd45bbf? = null,
  public val pdf: InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21? = null,
  public val template: String? = null,
  public val templateVersion:
      InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd? = null,
) {
  public class Builder {
    public var amountTaxDisplay: InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX6bd45bbf?
        = null

    public var pdf: InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21? = null

    public var template: String? = null

    public var templateVersion: InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd? =
        null

    public fun build(): InlineV1InvoicesPostRequestFormRenderingXf3022a61 = InlineV1InvoicesPostRequestFormRenderingXf3022a61(
      amountTaxDisplay = amountTaxDisplay,
      pdf = pdf,
      template = template,
      templateVersion = templateVersion,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormRenderingXf3022a61 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingXf3022a61> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingXf3022a61 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormRenderingXf3022a61")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormRenderingXf3022a61 must be a JSON object")
      return InlineV1InvoicesPostRequestFormRenderingXf3022a61(
        amountTaxDisplay = rawObject["amount_tax_display"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingAmountTaxDisplayX6bd45bbf>(it) },
        pdf = rawObject["pdf"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21>(it) },
        template = rawObject["template"]?.let { json.decodeFromJsonElement<String>(it) },
        templateVersion = rawObject["template_version"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormRenderingXf3022a61) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormRenderingXf3022a61")
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

public fun inlineV1InvoicesPostRequestFormRenderingXf3022a61(block: InlineV1InvoicesPostRequestFormRenderingXf3022a61.Builder.() -> Unit): InlineV1InvoicesPostRequestFormRenderingXf3022a61 = InlineV1InvoicesPostRequestFormRenderingXf3022a61.build(block)
