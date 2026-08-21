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

@Serializable
public data class BalanceSettingsResourceStartOfDayView(
  public val hour: Int,
  public val minutes: Int,
  public val timezone: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_start_of_day
 */
@Serializable(with = BalanceSettingsResourceStartOfDay.Serializer::class)
public class BalanceSettingsResourceStartOfDay(
  /**
   * Hour at which the customized start of day begins according to the given timezone. Must be a [supported customized
   * start of day hour](/connect/customized-start-of-day#available-timezones-and-cutoffs).
   */
  public val hour: Int,
  /**
   * Minutes at which the customized start of day begins according to the given timezone. Must be either 0 or 30.
   */
  public val minutes: Int,
  /**
   * Timezone for the customized start of day. Must be a [supported customized start of day
   * timezone](/connect/customized-start-of-day#available-timezones-and-cutoffs).
   */
  public val timezone: String,
) {
  public class Builder {
    private var hourValue: Int? = null

    public var hour: Int
      get() = requireNotNull(hourValue) { "hour is required" }
      set(`value`) {
        hourValue = value
      }

    private var minutesValue: Int? = null

    public var minutes: Int
      get() = requireNotNull(minutesValue) { "minutes is required" }
      set(`value`) {
        minutesValue = value
      }

    private var timezoneValue: String? = null

    public var timezone: String
      get() = requireNotNull(timezoneValue) { "timezone is required" }
      set(`value`) {
        timezoneValue = value
      }

    public fun build(): BalanceSettingsResourceStartOfDay {
      check(hourValue != null) { "hour is required" }
      check(minutesValue != null) { "minutes is required" }
      check(timezoneValue != null) { "timezone is required" }
      return BalanceSettingsResourceStartOfDay(
        hour = hour,
        minutes = minutes,
        timezone = timezone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceSettingsResourceStartOfDay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BalanceSettingsResourceStartOfDay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceSettingsResourceStartOfDay {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceSettingsResourceStartOfDay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceSettingsResourceStartOfDay must be a JSON object")
      val hour = json.decodeRequired<Int>(rawObject, "hour")
      val minutes = json.decodeRequired<Int>(rawObject, "minutes")
      val timezone = json.decodeRequired<String>(rawObject, "timezone")
      return BalanceSettingsResourceStartOfDay(
        hour = hour,
        minutes = minutes,
        timezone = timezone,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceSettingsResourceStartOfDay) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceSettingsResourceStartOfDay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("hour", json.encodeToJsonElement(value.hour))
        put("minutes", json.encodeToJsonElement(value.minutes))
        put("timezone", value.timezone)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceSettingsResourceStartOfDay(block: BalanceSettingsResourceStartOfDay.Builder.() -> Unit): BalanceSettingsResourceStartOfDay = BalanceSettingsResourceStartOfDay.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BalanceSettingsResourceStartOfDay is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
