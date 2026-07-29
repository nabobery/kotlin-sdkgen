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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d(
  public val interval: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalX082704a8,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalX082704a8? = null

    public var interval: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalX082704a8
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d {
      check(intervalValue != null) { "interval is required" }
      return InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d must be a JSON object")
      val interval = json.decodeRequired<InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalX082704a8>(rawObject, "interval")
      return InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d(block: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d.Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d = InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringXbe93028d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
