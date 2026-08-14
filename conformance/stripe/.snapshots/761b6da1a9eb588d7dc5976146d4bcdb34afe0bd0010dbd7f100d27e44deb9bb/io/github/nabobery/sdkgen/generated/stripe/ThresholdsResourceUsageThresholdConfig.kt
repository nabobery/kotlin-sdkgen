package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@ConsistentCopyVisibility
@Serializable
public data class ThresholdsResourceUsageThresholdConfigView internal constructor(
  public val filters: List<ThresholdsResourceUsageAlertFilter>? = null,
  public val gte: Int,
  public val meter: InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422,
  public val recurrence: InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d,
)

/**
 * The usage threshold alert configuration enables setting up alerts for when a certain usage threshold on a specific
 * meter is crossed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/thresholds_resource_usage_threshold_config
 */
@Serializable(with = ThresholdsResourceUsageThresholdConfig.Serializer::class)
public class ThresholdsResourceUsageThresholdConfig(
  /**
   * The value at which this alert will trigger.
   */
  public val gte: Int,
  /**
   * The [Billing Meter](/api/billing/meter) ID whose usage is monitored.
   */
  public val meter: InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422,
  /**
   * Defines how the alert will behave.
   */
  public val recurrence: InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d,
  filters: List<ThresholdsResourceUsageAlertFilter>? = null,
) {
  /**
   * The filters allow limiting the scope of this usage alert. You can only specify up to one filter at this time.
   */
  public val filters: List<ThresholdsResourceUsageAlertFilter>? =
      filters?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var gteValue: Int? = null

    public var gte: Int
      get() = requireNotNull(gteValue) { "gte is required" }
      set(`value`) {
        gteValue = value
      }

    private var meterValue: InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422? = null

    public var meter: InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422
      get() = requireNotNull(meterValue) { "meter is required" }
      set(`value`) {
        meterValue = value
      }

    private var recurrenceValue: InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d? =
        null

    public var recurrence: InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d
      get() = requireNotNull(recurrenceValue) { "recurrence is required" }
      set(`value`) {
        recurrenceValue = value
      }

    private var filtersValue: List<ThresholdsResourceUsageAlertFilter>? = null

    /**
     * The filters allow limiting the scope of this usage alert. You can only specify up to one filter at this time.
     */
    public var filters: List<ThresholdsResourceUsageAlertFilter>?
      get() = filtersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filtersValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): ThresholdsResourceUsageThresholdConfig {
      check(gteValue != null) { "gte is required" }
      check(meterValue != null) { "meter is required" }
      check(recurrenceValue != null) { "recurrence is required" }
      return ThresholdsResourceUsageThresholdConfig(
        gte = gte,
        meter = meter,
        recurrence = recurrence,
        filters = filters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ThresholdsResourceUsageThresholdConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ThresholdsResourceUsageThresholdConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ThresholdsResourceUsageThresholdConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ThresholdsResourceUsageThresholdConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ThresholdsResourceUsageThresholdConfig must be a JSON object")
      val gte = json.decodeRequired<Int>(rawObject, "gte")
      val meter = json.decodeRequired<InlineThresholdsResourceUsageThresholdConfigMeterXe7f01422>(rawObject, "meter")
      val recurrence = json.decodeRequired<InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d>(rawObject, "recurrence")
      return ThresholdsResourceUsageThresholdConfig(
        gte = gte,
        meter = meter,
        recurrence = recurrence,
        filters = rawObject["filters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ThresholdsResourceUsageAlertFilter>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ThresholdsResourceUsageThresholdConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ThresholdsResourceUsageThresholdConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("gte", json.encodeToJsonElement(value.gte))
        put("meter", json.encodeToJsonElement(value.meter))
        put("recurrence", json.encodeToJsonElement(value.recurrence))
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun thresholdsResourceUsageThresholdConfig(block: ThresholdsResourceUsageThresholdConfig.Builder.() -> Unit): ThresholdsResourceUsageThresholdConfig = ThresholdsResourceUsageThresholdConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ThresholdsResourceUsageThresholdConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
