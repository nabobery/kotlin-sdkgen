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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b(
  public val enabled: Boolean,
  public val invoiceData:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var invoiceData: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65?
        = null

    public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b(
        enabled = enabled,
        invoiceData = invoiceData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b(
        enabled = enabled,
        invoiceData = rawObject["invoice_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataXcd3dae65>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.invoiceData?.let { put("invoice_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b(block: InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b = InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
