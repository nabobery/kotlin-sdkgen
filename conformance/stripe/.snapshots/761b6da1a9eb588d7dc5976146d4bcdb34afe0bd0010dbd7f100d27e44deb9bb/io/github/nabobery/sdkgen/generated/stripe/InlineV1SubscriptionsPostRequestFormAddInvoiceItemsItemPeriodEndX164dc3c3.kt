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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/end
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3(
  public val type: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX881f1770,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX881f1770? = null

    public var type: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX881f1770
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timestamp: Int? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX881f1770>(rawObject, "type")
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3(block: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3 = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
