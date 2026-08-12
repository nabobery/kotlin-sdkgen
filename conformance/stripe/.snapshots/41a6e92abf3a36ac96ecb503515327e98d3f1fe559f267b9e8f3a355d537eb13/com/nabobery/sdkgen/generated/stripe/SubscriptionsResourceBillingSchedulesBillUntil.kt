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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Specifies the end of billing period.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_bill_until
 */
@Serializable(with = SubscriptionsResourceBillingSchedulesBillUntil.Serializer::class)
public class SubscriptionsResourceBillingSchedulesBillUntil(
  /**
   * The timestamp the billing schedule will apply until.
   */
  public val computedTimestamp: Int,
  /**
   * Describes how the billing schedule will determine the end date. Either `duration` or `timestamp`.
   */
  public val type: InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb,
  /**
   * Specifies the billing period.
   */
  public val duration:
      InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8? = null,
  /**
   * If specified, the billing schedule will apply until the specified timestamp.
   */
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var computedTimestampValue: Int? = null

    public var computedTimestamp: Int
      get() = requireNotNull(computedTimestampValue) { "computedTimestamp is required" }
      set(`value`) {
        computedTimestampValue = value
      }

    private var typeValue: InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb? = null

    public var type: InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Specifies the billing period.
     */
    public var duration: InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8? =
        null

    /**
     * If specified, the billing schedule will apply until the specified timestamp.
     */
    public var timestamp: Int? = null

    public fun build(): SubscriptionsResourceBillingSchedulesBillUntil {
      check(computedTimestampValue != null) { "computedTimestamp is required" }
      check(typeValue != null) { "type is required" }
      return SubscriptionsResourceBillingSchedulesBillUntil(
        computedTimestamp = computedTimestamp,
        type = type,
        duration = duration,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourceBillingSchedulesBillUntil = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsResourceBillingSchedulesBillUntil> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourceBillingSchedulesBillUntil {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceBillingSchedulesBillUntil")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourceBillingSchedulesBillUntil must be a JSON object")
      val computedTimestamp = json.decodeRequired<Int>(rawObject, "computed_timestamp")
      val type = json.decodeRequired<InlineSubscriptionsResourceBillingSchedulesBillUntilTypeX20894bbb>(rawObject, "type")
      return SubscriptionsResourceBillingSchedulesBillUntil(
        computedTimestamp = computedTimestamp,
        type = type,
        duration = rawObject["duration"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionsResourceBillingSchedulesBillUntilDurationX2e054bf8?>(element) },
        timestamp = rawObject["timestamp"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourceBillingSchedulesBillUntil) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceBillingSchedulesBillUntil")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("computed_timestamp", json.encodeToJsonElement(value.computedTimestamp))
        put("type", json.encodeToJsonElement(value.type))
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourceBillingSchedulesBillUntil(block: SubscriptionsResourceBillingSchedulesBillUntil.Builder.() -> Unit): SubscriptionsResourceBillingSchedulesBillUntil = SubscriptionsResourceBillingSchedulesBillUntil.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourceBillingSchedulesBillUntil is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
