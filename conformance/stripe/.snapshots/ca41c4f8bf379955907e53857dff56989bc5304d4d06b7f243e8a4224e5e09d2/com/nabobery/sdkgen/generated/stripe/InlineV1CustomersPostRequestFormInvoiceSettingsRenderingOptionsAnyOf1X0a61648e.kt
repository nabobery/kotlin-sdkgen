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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/rendering_options/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/invoice_settings/properties/rendering_options/anyOf/0
 */
@Serializable(with = InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e.Serializer::class)
public class InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e(
  public val amountTaxDisplay:
      InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1cac9922? = null,
  public val template: String? = null,
) {
  public class Builder {
    public var amountTaxDisplay:
        InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1cac9922? = null

    public var template: String? = null

    public fun build(): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e = InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e(
      amountTaxDisplay = amountTaxDisplay,
      template = template,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e must be a JSON object")
      return InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e(
        amountTaxDisplay = rawObject["amount_tax_display"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsAmountTaxDisplayX1cac9922>(it) },
        template = rawObject["template"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountTaxDisplay?.let { put("amount_tax_display", json.encodeToJsonElement(it)) }
        value.template?.let { put("template", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e(block: InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e.Builder.() -> Unit): InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e = InlineV1CustomersPostRequestFormInvoiceSettingsRenderingOptionsAnyOf1X0a61648e.build(block)
