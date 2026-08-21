package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class RecurringView(
  public val interval: InlineRecurringIntervalX408cd922,
  @SerialName("interval_count")
  public val intervalCount: Int,
  public val meter: String? = null,
  @SerialName("usage_type")
  public val usageType: InlineRecurringUsageTypeX56c31d8b,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/recurring
 */
@Serializable(with = Recurring.Serializer::class)
public class Recurring(
  /**
   * The frequency at which a subscription is billed. One of `day`, `week`, `month` or `year`.
   */
  public val interval: InlineRecurringIntervalX408cd922,
  /**
   * The number of intervals (specified in the `interval` attribute) between subscription billings. For example,
   * `interval=month` and `interval_count=3` bills every 3 months.
   */
  public val intervalCount: Int,
  /**
   * Configures how the quantity per period should be determined. Can be either `metered` or `licensed`. `licensed`
   * automatically bills the `quantity` set when adding it to a subscription. `metered` aggregates the total usage based
   * on usage records. Defaults to `licensed`.
   */
  public val usageType: InlineRecurringUsageTypeX56c31d8b,
  /**
   * The meter tracking the usage of a metered price
   */
  public val meter: String? = null,
) {
  public class Builder {
    private var intervalValue: InlineRecurringIntervalX408cd922? = null

    public var interval: InlineRecurringIntervalX408cd922
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var intervalCountValue: Int? = null

    public var intervalCount: Int
      get() = requireNotNull(intervalCountValue) { "intervalCount is required" }
      set(`value`) {
        intervalCountValue = value
      }

    private var usageTypeValue: InlineRecurringUsageTypeX56c31d8b? = null

    public var usageType: InlineRecurringUsageTypeX56c31d8b
      get() = requireNotNull(usageTypeValue) { "usageType is required" }
      set(`value`) {
        usageTypeValue = value
      }

    /**
     * The meter tracking the usage of a metered price
     */
    public var meter: String? = null

    public fun build(): Recurring {
      check(intervalValue != null) { "interval is required" }
      check(intervalCountValue != null) { "intervalCount is required" }
      check(usageTypeValue != null) { "usageType is required" }
      return Recurring(
        interval = interval,
        intervalCount = intervalCount,
        usageType = usageType,
        meter = meter,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Recurring = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Recurring> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Recurring {
      val jsonDecoder = decoder.requireJsonDecoder("Recurring")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Recurring must be a JSON object")
      val interval = json.decodeRequired<InlineRecurringIntervalX408cd922>(rawObject, "interval")
      val intervalCount = json.decodeRequired<Int>(rawObject, "interval_count")
      val usageType = json.decodeRequired<InlineRecurringUsageTypeX56c31d8b>(rawObject, "usage_type")
      return Recurring(
        interval = interval,
        intervalCount = intervalCount,
        usageType = usageType,
        meter = rawObject["meter"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Recurring) {
      val jsonEncoder = encoder.requireJsonEncoder("Recurring")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        put("interval_count", json.encodeToJsonElement(value.intervalCount))
        put("usage_type", json.encodeToJsonElement(value.usageType))
        value.meter?.let { put("meter", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun recurring(block: Recurring.Builder.() -> Unit): Recurring = Recurring.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Recurring is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
