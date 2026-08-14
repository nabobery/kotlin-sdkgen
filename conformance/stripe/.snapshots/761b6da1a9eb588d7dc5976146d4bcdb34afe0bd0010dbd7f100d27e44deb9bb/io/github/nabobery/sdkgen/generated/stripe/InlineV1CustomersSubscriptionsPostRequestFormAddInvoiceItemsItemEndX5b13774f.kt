package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/end
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f(
  public val type: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca7026da,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca7026da? = null

    public var type: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca7026da
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timestamp: Int? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f {
      check(typeValue != null) { "type is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f must be a JSON object")
      val type = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca7026da>(rawObject, "type")
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f(block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
