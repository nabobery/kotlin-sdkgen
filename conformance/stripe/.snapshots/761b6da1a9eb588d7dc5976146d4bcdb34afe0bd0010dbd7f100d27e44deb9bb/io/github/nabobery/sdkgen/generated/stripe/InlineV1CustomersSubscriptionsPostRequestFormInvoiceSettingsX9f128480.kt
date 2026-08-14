package io.github.nabobery.sdkgen.generated.stripe

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
 * All invoices will be billed using the specified settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/invoice_settings
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480(
  public val accountTaxIds:
      InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650? = null,
  public val customFields:
      InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82? = null,
  public val description: String? = null,
  public val footer: String? = null,
  public val issuer:
      InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f? = null,
) {
  public class Builder {
    public var accountTaxIds: InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650? =
        null

    public var customFields: InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82? =
        null

    public var description: String? = null

    public var footer: String? = null

    public var issuer: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f?
        = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480 = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480(
      accountTaxIds = accountTaxIds,
      customFields = customFields,
      description = description,
      footer = footer,
      issuer = issuer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480(
        accountTaxIds = rawObject["account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAccountTaxIdsX305dc650>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCustomFieldsX8d3b1d82>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsIssuerX0371238f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.footer?.let { put("footer", it) }
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480(block: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480 = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsX9f128480.build(block)
