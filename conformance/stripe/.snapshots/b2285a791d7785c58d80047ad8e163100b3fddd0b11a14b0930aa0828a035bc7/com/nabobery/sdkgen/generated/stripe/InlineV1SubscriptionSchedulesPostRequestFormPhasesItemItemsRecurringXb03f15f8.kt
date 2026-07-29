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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8(
  public val interval:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX1d9f81f3,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX1d9f81f3? = null

    public var interval:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX1d9f81f3
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8 must be a JSON object")
      val interval = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX1d9f81f3>(rawObject, "interval")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXb03f15f8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
