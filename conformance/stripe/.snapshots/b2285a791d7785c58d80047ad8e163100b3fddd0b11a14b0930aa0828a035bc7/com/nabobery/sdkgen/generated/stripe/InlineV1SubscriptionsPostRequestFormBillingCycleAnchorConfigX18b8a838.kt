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
 * Mutually exclusive with billing_cycle_anchor and only valid with monthly and yearly price intervals. When provided,
 * the billing_cycle_anchor is set to the next occurrence of the day_of_month at the hour, minute, and second UTC.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_cycle_anchor_config
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838(
  public val dayOfMonth: Int,
  public val hour: Int? = null,
  public val minute: Int? = null,
  public val month: Int? = null,
  public val second: Int? = null,
) {
  public class Builder {
    private var dayOfMonthValue: Int? = null

    public var dayOfMonth: Int
      get() = requireNotNull(dayOfMonthValue) { "dayOfMonth is required" }
      set(`value`) {
        dayOfMonthValue = value
      }

    public var hour: Int? = null

    public var minute: Int? = null

    public var month: Int? = null

    public var second: Int? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838 {
      check(dayOfMonthValue != null) { "dayOfMonth is required" }
      return InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838(
        dayOfMonth = dayOfMonth,
        hour = hour,
        minute = minute,
        month = month,
        second = second,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838 must be a JSON object")
      val dayOfMonth = json.decodeRequired<Int>(rawObject, "day_of_month")
      return InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838(
        dayOfMonth = dayOfMonth,
        hour = rawObject["hour"]?.let { json.decodeFromJsonElement<Int>(it) },
        minute = rawObject["minute"]?.let { json.decodeFromJsonElement<Int>(it) },
        month = rawObject["month"]?.let { json.decodeFromJsonElement<Int>(it) },
        second = rawObject["second"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("day_of_month", json.encodeToJsonElement(value.dayOfMonth))
        value.hour?.let { put("hour", json.encodeToJsonElement(it)) }
        value.minute?.let { put("minute", json.encodeToJsonElement(it)) }
        value.month?.let { put("month", json.encodeToJsonElement(it)) }
        value.second?.let { put("second", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838(block: InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838 = InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
