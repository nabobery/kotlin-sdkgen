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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_reboot_window
 */
@Serializable(with = TerminalConfigurationConfigurationResourceRebootWindow.Serializer::class)
public class TerminalConfigurationConfigurationResourceRebootWindow(
  /**
   * Integer between 0 to 23 that represents the end hour of the reboot time window. The value must be different than
   * the start_hour.
   */
  public val endHour: Int,
  /**
   * Integer between 0 to 23 that represents the start hour of the reboot time window.
   */
  public val startHour: Int,
) {
  public class Builder {
    private var endHourValue: Int? = null

    public var endHour: Int
      get() = requireNotNull(endHourValue) { "endHour is required" }
      set(`value`) {
        endHourValue = value
      }

    private var startHourValue: Int? = null

    public var startHour: Int
      get() = requireNotNull(startHourValue) { "startHour is required" }
      set(`value`) {
        startHourValue = value
      }

    public fun build(): TerminalConfigurationConfigurationResourceRebootWindow {
      check(endHourValue != null) { "endHour is required" }
      check(startHourValue != null) { "startHour is required" }
      return TerminalConfigurationConfigurationResourceRebootWindow(
        endHour = endHour,
        startHour = startHour,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceRebootWindow = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalConfigurationConfigurationResourceRebootWindow> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceRebootWindow {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceRebootWindow")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceRebootWindow must be a JSON object")
      val endHour = json.decodeRequired<Int>(rawObject, "end_hour")
      val startHour = json.decodeRequired<Int>(rawObject, "start_hour")
      return TerminalConfigurationConfigurationResourceRebootWindow(
        endHour = endHour,
        startHour = startHour,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceRebootWindow) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceRebootWindow")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_hour", json.encodeToJsonElement(value.endHour))
        put("start_hour", json.encodeToJsonElement(value.startHour))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourceRebootWindow(block: TerminalConfigurationConfigurationResourceRebootWindow.Builder.() -> Unit): TerminalConfigurationConfigurationResourceRebootWindow = TerminalConfigurationConfigurationResourceRebootWindow.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalConfigurationConfigurationResourceRebootWindow is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
