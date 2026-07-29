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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e(
  public val interval:
      InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalXed555c2c,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalXed555c2c? = null

    public var interval:
        InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalXed555c2c
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e {
      check(intervalValue != null) { "interval is required" }
      return InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e must be a JSON object")
      val interval = json.decodeRequired<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalXed555c2c>(rawObject, "interval")
      return InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e(block: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e = InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX54769f3e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
