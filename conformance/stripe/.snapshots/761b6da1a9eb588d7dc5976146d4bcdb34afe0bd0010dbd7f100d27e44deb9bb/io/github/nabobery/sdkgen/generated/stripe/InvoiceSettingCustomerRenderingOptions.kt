package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

@Serializable
public data class InvoiceSettingCustomerRenderingOptionsView(
  @SerialName("amount_tax_display")
  public val amountTaxDisplay: String? = null,
  public val template: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_setting_customer_rendering_options
 */
@Serializable(with = InvoiceSettingCustomerRenderingOptions.Serializer::class)
public class InvoiceSettingCustomerRenderingOptions(
  /**
   * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
   */
  public val amountTaxDisplay: String? = null,
  /**
   * ID of the invoice rendering template to be used for this customer's invoices. If set, the template will be used on
   * all invoices for this customer unless a template is set directly on the invoice.
   */
  public val template: String? = null,
) {
  public class Builder {
    /**
     * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
     */
    public var amountTaxDisplay: String? = null

    /**
     * ID of the invoice rendering template to be used for this customer's invoices. If set, the template will be used
     * on all invoices for this customer unless a template is set directly on the invoice.
     */
    public var template: String? = null

    public fun build(): InvoiceSettingCustomerRenderingOptions = InvoiceSettingCustomerRenderingOptions(
      amountTaxDisplay = amountTaxDisplay,
      template = template,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceSettingCustomerRenderingOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoiceSettingCustomerRenderingOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceSettingCustomerRenderingOptions {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceSettingCustomerRenderingOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceSettingCustomerRenderingOptions must be a JSON object")
      return InvoiceSettingCustomerRenderingOptions(
        amountTaxDisplay = rawObject["amount_tax_display"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        template = rawObject["template"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceSettingCustomerRenderingOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceSettingCustomerRenderingOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountTaxDisplay?.let { put("amount_tax_display", it) }
        value.template?.let { put("template", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceSettingCustomerRenderingOptions(block: InvoiceSettingCustomerRenderingOptions.Builder.() -> Unit): InvoiceSettingCustomerRenderingOptions = InvoiceSettingCustomerRenderingOptions.build(block)
