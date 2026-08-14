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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properti
 * es/start.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properti
 * es/start
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90(
  public val type: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805? = null

    public var type: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timestamp: Int? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90 {
      check(typeValue != null) { "type is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90 must be a JSON object")
      val type = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemTypeXca70f805>(rawObject, "type")
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90(block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90 = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
