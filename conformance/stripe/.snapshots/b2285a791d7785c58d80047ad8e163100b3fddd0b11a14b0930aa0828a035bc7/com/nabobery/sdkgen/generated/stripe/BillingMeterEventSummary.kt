package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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
 * A billing meter event summary represents an aggregated view of a customer's billing meter events within a specified
 * timeframe. It indicates how much
 * usage was accrued by a customer for that period.
 *
 * Note: Meters events are aggregated asynchronously so the meter event summaries provide an eventually consistent view
 * of the reported usage.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event_summary
 */
@Serializable(with = BillingMeterEventSummary.Serializer::class)
public class BillingMeterEventSummary(
  /**
   * Aggregated value of all the events within `start_time` (inclusive) and `end_time` (inclusive). The aggregation
   * strategy is defined on meter via `default_aggregation`.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val aggregatedValue: Double,
  /**
   * End timestamp for this event summary (exclusive). Must be aligned with minute boundaries.
   */
  public val endTime: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The meter associated with this event summary.
   */
  public val meter: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineBillingMeterEventSummaryObjectValueX1b2b2ac7,
  /**
   * Start timestamp for this event summary (inclusive). Must be aligned with minute boundaries.
   */
  public val startTime: Int,
) {
  public class Builder {
    private var aggregatedValueValue: Double? = null

    public var aggregatedValue: Double
      get() = requireNotNull(aggregatedValueValue) { "aggregatedValue is required" }
      set(`value`) {
        aggregatedValueValue = value
      }

    private var endTimeValue: Int? = null

    public var endTime: Int
      get() = requireNotNull(endTimeValue) { "endTime is required" }
      set(`value`) {
        endTimeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var meterValue: String? = null

    public var meter: String
      get() = requireNotNull(meterValue) { "meter is required" }
      set(`value`) {
        meterValue = value
      }

    private var objectValueValue: InlineBillingMeterEventSummaryObjectValueX1b2b2ac7? = null

    public var objectValue: InlineBillingMeterEventSummaryObjectValueX1b2b2ac7
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var startTimeValue: Int? = null

    public var startTime: Int
      get() = requireNotNull(startTimeValue) { "startTime is required" }
      set(`value`) {
        startTimeValue = value
      }

    public fun build(): BillingMeterEventSummary {
      check(aggregatedValueValue != null) { "aggregatedValue is required" }
      check(endTimeValue != null) { "endTime is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(meterValue != null) { "meter is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(startTimeValue != null) { "startTime is required" }
      return BillingMeterEventSummary(
        aggregatedValue = aggregatedValue,
        endTime = endTime,
        id = id,
        livemode = livemode,
        meter = meter,
        objectValue = objectValue,
        startTime = startTime,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingMeterEventSummary = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingMeterEventSummary> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingMeterEventSummary {
      val jsonDecoder = decoder.requireJsonDecoder("BillingMeterEventSummary")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingMeterEventSummary must be a JSON object")
      val aggregatedValue = json.decodeRequired<Double>(rawObject, "aggregated_value")
      val endTime = json.decodeRequired<Int>(rawObject, "end_time")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val meter = json.decodeRequired<String>(rawObject, "meter")
      val objectValue = json.decodeRequired<InlineBillingMeterEventSummaryObjectValueX1b2b2ac7>(rawObject, "object")
      val startTime = json.decodeRequired<Int>(rawObject, "start_time")
      return BillingMeterEventSummary(
        aggregatedValue = aggregatedValue,
        endTime = endTime,
        id = id,
        livemode = livemode,
        meter = meter,
        objectValue = objectValue,
        startTime = startTime,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingMeterEventSummary) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingMeterEventSummary")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("aggregated_value", json.encodeToJsonElement(value.aggregatedValue))
        put("end_time", json.encodeToJsonElement(value.endTime))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("meter", value.meter)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("start_time", json.encodeToJsonElement(value.startTime))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingMeterEventSummary(block: BillingMeterEventSummary.Builder.() -> Unit): BillingMeterEventSummary = BillingMeterEventSummary.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingMeterEventSummary is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
