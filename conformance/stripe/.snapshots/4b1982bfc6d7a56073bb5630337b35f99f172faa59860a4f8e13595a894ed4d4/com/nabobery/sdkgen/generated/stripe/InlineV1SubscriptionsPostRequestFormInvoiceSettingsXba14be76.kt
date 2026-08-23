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
 * All invoices will be billed using the specified settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_settings
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76(
  public val accountTaxIds:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633? = null,
  public val customFields:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXbf17de34? = null,
  public val description: String? = null,
  public val footer: String? = null,
  public val issuer: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerXdb76cca3? = null,
) {
  public class Builder {
    public var accountTaxIds:
        InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633? = null

    public var customFields:
        InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXbf17de34? = null

    public var description: String? = null

    public var footer: String? = null

    public var issuer: InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerXdb76cca3? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76 = InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76(
      accountTaxIds = accountTaxIds,
      customFields = customFields,
      description = description,
      footer = footer,
      issuer = issuer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76(
        accountTaxIds = rawObject["account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsAccountTaxIdsX8196e633>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsCustomFieldsXbf17de34>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsIssuerXdb76cca3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76")
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

public fun inlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76(block: InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76 = InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76.build(block)
