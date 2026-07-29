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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65(
  public val accountTaxIds:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013? = null,
  public val customFields:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb? = null,
  public val description: String? = null,
  public val footer: String? = null,
  public val issuer:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017? = null,
  public val metadata:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1? = null,
  public val renderingOptions:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0? = null,
) {
  public class Builder {
    public var accountTaxIds:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013? = null

    public var customFields:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb? = null

    public var description: String? = null

    public var footer: String? = null

    public var issuer: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017?
        = null

    public var metadata:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1? = null

    public var renderingOptions:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65 = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65(
        accountTaxIds = rawObject["account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataIssuerX87ca4017>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataMetadataXcebe60b1>(it) },
        renderingOptions = rawObject["rendering_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65")
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

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65(block: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65 = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65.build(block)
