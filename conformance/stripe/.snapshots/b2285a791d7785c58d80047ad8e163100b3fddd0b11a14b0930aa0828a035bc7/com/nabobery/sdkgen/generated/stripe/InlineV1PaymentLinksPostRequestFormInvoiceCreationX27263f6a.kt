package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generate a post-purchase Invoice for one-time payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a(
  public val enabled: Boolean,
  public val invoiceData:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var invoiceData: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350?
        = null

    public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a(
        enabled = enabled,
        invoiceData = invoiceData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a(
        enabled = enabled,
        invoiceData = rawObject["invoice_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataX055d3350>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.invoiceData?.let { put("invoice_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a(block: InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a = InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
