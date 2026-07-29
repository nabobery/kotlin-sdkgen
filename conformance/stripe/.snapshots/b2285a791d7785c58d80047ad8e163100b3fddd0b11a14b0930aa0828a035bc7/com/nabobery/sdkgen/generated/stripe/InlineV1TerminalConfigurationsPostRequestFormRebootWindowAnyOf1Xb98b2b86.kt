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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/reboot_window/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/reboot_window/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86(
  public val endHour: Int,
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

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 {
      check(endHourValue != null) { "endHour is required" }
      check(startHourValue != null) { "startHour is required" }
      return InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86(
        endHour = endHour,
        startHour = startHour,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 must be a JSON object")
      val endHour = json.decodeRequired<Int>(rawObject, "end_hour")
      val startHour = json.decodeRequired<Int>(rawObject, "start_hour")
      return InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86(
        endHour = endHour,
        startHour = startHour,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_hour", json.encodeToJsonElement(value.endHour))
        put("start_hour", json.encodeToJsonElement(value.startHour))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86(block: InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 = InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormRebootWindowAnyOf1Xb98b2b86 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
