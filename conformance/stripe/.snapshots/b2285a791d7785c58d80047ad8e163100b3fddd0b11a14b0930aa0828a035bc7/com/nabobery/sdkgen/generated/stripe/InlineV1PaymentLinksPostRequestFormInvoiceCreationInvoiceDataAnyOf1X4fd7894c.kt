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
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c(
  public val amountTaxDisplay:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478? = null,
  public val template: String? = null,
) {
  public class Builder {
    public var amountTaxDisplay:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478? = null

    public var template: String? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c(
      amountTaxDisplay = amountTaxDisplay,
      template = template,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c(
        amountTaxDisplay = rawObject["amount_tax_display"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationAmountTaxDisplayXe1f62478>(it) },
        template = rawObject["template"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountTaxDisplay?.let { put("amount_tax_display", json.encodeToJsonElement(it)) }
        value.template?.let { put("template", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c(block: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c.build(block)
