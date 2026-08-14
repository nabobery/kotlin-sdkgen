package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/custom_fields/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/custom_fields/anyOf/0/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7(
  public val name: String,
  public val `value`: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7 {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7(
        name = name,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7(
        name = name,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7(block: InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7 = InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
