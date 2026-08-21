package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_setting_customer_setting
 */
@Serializable(with = InvoiceSettingCustomerSetting.Serializer::class)
public class InvoiceSettingCustomerSetting(
  customFields: List<InvoiceSettingCustomField>? = null,
  /**
   * ID of a payment method that's attached to the customer, to be used as the customer's default payment method for
   * subscriptions and invoices.
   */
  public val defaultPaymentMethod:
      InlineInvoiceSettingCustomerSettingDefaultPaymentMethodX144a10e2? = null,
  /**
   * Default footer to be displayed on invoices for this customer.
   */
  public val footer: String? = null,
  /**
   * Default options for invoice PDF rendering for this customer.
   */
  public val renderingOptions: InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96? = null,
) {
  /**
   * Default custom fields to be displayed on invoices for this customer.
   */
  public val customFields: List<InvoiceSettingCustomField>? =
      customFields?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var customFieldsValue: List<InvoiceSettingCustomField>? = null

    /**
     * Default custom fields to be displayed on invoices for this customer.
     */
    public var customFields: List<InvoiceSettingCustomField>?
      get() = customFieldsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customFieldsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * ID of a payment method that's attached to the customer, to be used as the customer's default payment method for
     * subscriptions and invoices.
     */
    public var defaultPaymentMethod:
        InlineInvoiceSettingCustomerSettingDefaultPaymentMethodX144a10e2? = null

    /**
     * Default footer to be displayed on invoices for this customer.
     */
    public var footer: String? = null

    /**
     * Default options for invoice PDF rendering for this customer.
     */
    public var renderingOptions: InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96? =
        null

    public fun build(): InvoiceSettingCustomerSetting = InvoiceSettingCustomerSetting(
      customFields = customFields,
      defaultPaymentMethod = defaultPaymentMethod,
      footer = footer,
      renderingOptions = renderingOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceSettingCustomerSetting = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoiceSettingCustomerSetting> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceSettingCustomerSetting {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceSettingCustomerSetting")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceSettingCustomerSetting must be a JSON object")
      return InvoiceSettingCustomerSetting(
        customFields = rawObject["custom_fields"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InvoiceSettingCustomField>?>(element) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceSettingCustomerSettingDefaultPaymentMethodX144a10e2?>(element) },
        footer = rawObject["footer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        renderingOptions = rawObject["rendering_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceSettingCustomerSetting) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceSettingCustomerSetting")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", json.encodeToJsonElement(it)) }
        value.footer?.let { put("footer", it) }
        value.renderingOptions?.let { put("rendering_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceSettingCustomerSetting(block: InvoiceSettingCustomerSetting.Builder.() -> Unit): InvoiceSettingCustomerSetting = InvoiceSettingCustomerSetting.build(block)
