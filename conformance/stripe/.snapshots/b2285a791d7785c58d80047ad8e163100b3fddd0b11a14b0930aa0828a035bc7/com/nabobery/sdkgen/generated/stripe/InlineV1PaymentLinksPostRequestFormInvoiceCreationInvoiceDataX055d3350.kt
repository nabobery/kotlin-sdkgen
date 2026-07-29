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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350(
  public val accountTaxIds:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a? = null,
  public val customFields:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec? = null,
  public val description: String? = null,
  public val footer: String? = null,
  public val issuer:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f? = null,
  public val metadata:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataX4aee9872? = null,
  public val renderingOptions:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56? = null,
) {
  public class Builder {
    public var accountTaxIds:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a? = null

    public var customFields:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec? = null

    public var description: String? = null

    public var footer: String? = null

    public var issuer: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f?
        = null

    public var metadata:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataX4aee9872? = null

    public var renderingOptions:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350 = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350(
      accountTaxIds = accountTaxIds,
      customFields = customFields,
      description = description,
      footer = footer,
      issuer = issuer,
      metadata = metadata,
      renderingOptions = renderingOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350(
        accountTaxIds = rawObject["account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX61ba7d6f>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataX4aee9872>(it) },
        renderingOptions = rawObject["rendering_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.footer?.let { put("footer", it) }
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.renderingOptions?.let { put("rendering_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350(block: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350 = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350.build(block)
