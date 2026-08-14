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
 * Default invoice settings for this customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c.Serializer::class)
public class InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c(
  public val customFields:
      InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185? = null,
  public val defaultPaymentMethod: String? = null,
  public val footer: String? = null,
  public val renderingOptions:
      InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753? = null,
) {
  public class Builder {
    public var customFields: InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185? =
        null

    public var defaultPaymentMethod: String? = null

    public var footer: String? = null

    public var renderingOptions:
        InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753? = null

    public fun build(): InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c = InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c(
      customFields = customFields,
      defaultPaymentMethod = defaultPaymentMethod,
      footer = footer,
      renderingOptions = renderingOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c must be a JSON object")
      return InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c(
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsCustomFieldsX005b2185>(it) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
        renderingOptions = rawObject["rendering_options"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsXb6eff753>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", it) }
        value.footer?.let { put("footer", it) }
        value.renderingOptions?.let { put("rendering_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c(block: InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c.Builder.() -> Unit): InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c = InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c.build(block)
