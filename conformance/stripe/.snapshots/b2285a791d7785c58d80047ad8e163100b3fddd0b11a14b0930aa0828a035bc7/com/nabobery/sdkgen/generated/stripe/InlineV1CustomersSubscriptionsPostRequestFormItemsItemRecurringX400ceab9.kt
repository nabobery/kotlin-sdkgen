package com.nabobery.sdkgen.generated.stripe

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
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/recur
 * ring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/recur
 * ring
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9(
  public val interval:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataIntervalX4605205b,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataIntervalX4605205b? = null

    public var interval:
        InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataIntervalX4605205b
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9 must be a JSON object")
      val interval = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataIntervalX4605205b>(rawObject, "interval")
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9(block: InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9 = InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
