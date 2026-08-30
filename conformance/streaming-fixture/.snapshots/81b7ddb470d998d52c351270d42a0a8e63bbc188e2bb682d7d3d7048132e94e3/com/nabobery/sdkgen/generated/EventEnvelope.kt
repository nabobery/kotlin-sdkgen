package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/EventEnvelope.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EventEnvelope
 */
@Serializable(with = EventEnvelope.Serializer::class)
public class EventEnvelope(
  public val payload: EventChunk,
  public val event: String? = null,
) {
  public class Builder {
    private var payloadValue: EventChunk? = null

    public var payload: EventChunk
      get() = requireNotNull(payloadValue) { "payload is required" }
      set(`value`) {
        payloadValue = value
      }

    public var event: String? = null

    public fun build(): EventEnvelope {
      check(payloadValue != null) { "payload is required" }
      return EventEnvelope(
        payload = payload,
        event = event,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EventEnvelope = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EventEnvelope> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EventEnvelope {
      val jsonDecoder = decoder.requireJsonDecoder("EventEnvelope")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EventEnvelope must be a JSON object")
      val payload = json.decodeRequired<EventChunk>(rawObject, "payload")
      return EventEnvelope(
        payload = payload,
        event = rawObject["event"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: EventEnvelope) {
      val jsonEncoder = encoder.requireJsonEncoder("EventEnvelope")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payload", json.encodeToJsonElement(value.payload))
        value.event?.let { put("event", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun eventEnvelope(block: EventEnvelope.Builder.() -> Unit): EventEnvelope = EventEnvelope.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EventEnvelope is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
