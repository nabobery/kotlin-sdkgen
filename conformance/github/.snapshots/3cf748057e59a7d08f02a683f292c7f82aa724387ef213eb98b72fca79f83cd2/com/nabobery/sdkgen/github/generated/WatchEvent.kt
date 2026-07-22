package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/watch-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/watch-event
 */
@Serializable(with = WatchEvent.Serializer::class)
public class WatchEvent(
  public val action: String,
) {
  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    public fun build(): WatchEvent {
      check(actionValue != null) { "action is required" }
      return WatchEvent(
        action = action,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WatchEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WatchEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WatchEvent {
      val jsonDecoder = decoder.requireJsonDecoder("WatchEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WatchEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      return WatchEvent(
        action = action,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WatchEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("WatchEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun watchEvent(block: WatchEvent.Builder.() -> Unit): WatchEvent = WatchEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WatchEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
