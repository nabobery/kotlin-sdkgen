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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b(
  public val interval:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX97c20f44,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX97c20f44? = null

    public var interval:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX97c20f44
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b {
      check(intervalValue != null) { "interval is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b must be a JSON object")
      val interval = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemIntervalX97c20f44>(rawObject, "interval")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsRecurringXc672758b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
