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
 * www-form-urlencoded/schema/properties/phases/items/properties/duration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/duration
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4(
  public val interval:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationIntervalXe0657203,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationIntervalXe0657203? = null

    public var interval:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationIntervalXe0657203
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4 must be a JSON object")
      val interval = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationIntervalXe0657203>(rawObject, "interval")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
