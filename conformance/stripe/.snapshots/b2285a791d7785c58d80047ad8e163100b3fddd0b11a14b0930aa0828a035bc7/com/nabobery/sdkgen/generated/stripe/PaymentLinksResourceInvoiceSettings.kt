package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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

@ConsistentCopyVisibility
@Serializable
public data class PaymentLinksResourceInvoiceSettingsView internal constructor(
  @SerialName("account_tax_ids")
  public val accountTaxIds:
      List<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae>? = null,
  @SerialName("custom_fields")
  public val customFields: List<InvoiceSettingCustomField>? = null,
  public val description: String? = null,
  public val footer: String? = null,
  public val issuer: InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b? = null,
  public val metadata: Map<String, String>? = null,
  @SerialName("rendering_options")
  public val renderingOptions:
      InlinePaymentLinksResourceInvoiceSettingsRenderingOptionsX61aa2d58? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_invoice_settings
 */
@Serializable(with = PaymentLinksResourceInvoiceSettings.Serializer::class)
public class PaymentLinksResourceInvoiceSettings(
  accountTaxIds: List<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae>? = null,
  customFields: List<InvoiceSettingCustomField>? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * Footer to be displayed on the invoice.
   */
  public val footer: String? = null,
  /**
   * The connected account that issues the invoice. The invoice is presented with the branding and support information
   * of the specified account.
   */
  public val issuer: InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b? = null,
  metadata: Map<String, String>? = null,
  /**
   * Options for invoice PDF rendering.
   */
  public val renderingOptions:
      InlinePaymentLinksResourceInvoiceSettingsRenderingOptionsX61aa2d58? = null,
) {
  /**
   * The account tax IDs associated with the invoice.
   */
  public val accountTaxIds:
      List<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae>? =
      accountTaxIds?.let { collection0 -> collection0.toList() }

  /**
   * A list of up to 4 custom fields to be displayed on the invoice.
   */
  public val customFields: List<InvoiceSettingCustomField>? =
      customFields?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var accountTaxIdsValue:
        List<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae>? = null

    /**
     * The account tax IDs associated with the invoice.
     */
    public var accountTaxIds:
        List<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae>?
      get() = accountTaxIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountTaxIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var customFieldsValue: List<InvoiceSettingCustomField>? = null

    /**
     * A list of up to 4 custom fields to be displayed on the invoice.
     */
    public var customFields: List<InvoiceSettingCustomField>?
      get() = customFieldsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customFieldsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * Footer to be displayed on the invoice.
     */
    public var footer: String? = null

    /**
     * The connected account that issues the invoice. The invoice is presented with the branding and support information
     * of the specified account.
     */
    public var issuer: InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Options for invoice PDF rendering.
     */
    public var renderingOptions: InlinePaymentLinksResourceInvoiceSettingsRenderingOptionsX61aa2d58?
        = null

    public fun build(): PaymentLinksResourceInvoiceSettings = PaymentLinksResourceInvoiceSettings(
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
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceInvoiceSettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceInvoiceSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceInvoiceSettings {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceInvoiceSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceInvoiceSettings must be a JSON object")
      return PaymentLinksResourceInvoiceSettings(
        accountTaxIds = rawObject["account_tax_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlinePaymentLinksResourceInvoiceSettingsAccountTaxIdsItemX4e6052ae>?>(element) },
        customFields = rawObject["custom_fields"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InvoiceSettingCustomField>?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        footer = rawObject["footer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        issuer = rawObject["issuer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        renderingOptions = rawObject["rendering_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceInvoiceSettingsRenderingOptionsX61aa2d58?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceInvoiceSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceInvoiceSettings")
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

public fun paymentLinksResourceInvoiceSettings(block: PaymentLinksResourceInvoiceSettings.Builder.() -> Unit): PaymentLinksResourceInvoiceSettings = PaymentLinksResourceInvoiceSettings.build(block)
